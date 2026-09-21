package com.ute.btviewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ute.btviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tương tác trực tiếp với các View thông qua đối tượng binding
        binding.btnSubmit.setOnClickListener {
            val content = binding.edtInput.text.toString().trim()
            if (content.isNotEmpty()) {
                binding.tvResult.text = "Kết quả: $content"
            } else {
                binding.tvResult.text = "Vui lòng nhập nội dung!"
            }
        }
    }
}