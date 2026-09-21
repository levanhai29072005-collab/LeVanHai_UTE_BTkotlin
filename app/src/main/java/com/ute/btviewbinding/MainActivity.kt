package com.ute.btviewbinding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ute.btviewbinding.databinding.ActivityMainBinding

// Model dữ liệu mẫu để áp dụng Scope Functions
data class UserProfile(
    var name: String = "",
    var message: String = ""
)

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. apply: Khởi tạo và thiết lập thuộc tính cho đối tượng
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        binding.btnSubmit.setOnClickListener {
            val input = binding.edtInput.text.toString().trim()

            // 2. let: Kiểm tra chuỗi rỗng / null và xử lý dữ liệu
            input.takeIf { it.isNotEmpty() }?.let { validText ->

                // 3. run: Tính toán hoặc cấu hình đối tượng và trả về kết quả
                val profile = UserProfile().run {
                    name = "Sinh viên UTE"
                    message = validText
                    this // trả về đối tượng profile
                }

                // 4. also: Thực hiện hành động phụ (side-effect) như ghi log / thông báo Toast
                profile.also {
                    Toast.makeText(this, "Đang xử lý cho: ${it.name}", Toast.LENGTH_SHORT).show()
                }

                // 5. with: Nhóm các thao tác gán giao diện với đối tượng đích
                with(binding) {
                    tvResult.text = "Tác giả: ${profile.name}\nNội dung: ${profile.message}"
                    edtInput.text?.clear()
                }

            } ?: run {
                // Xử lý khi người dùng để trống ô nhập
                binding.tvResult.text = "Vui lòng nhập nội dung!"
            }
        }
    }
}