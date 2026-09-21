package com.ute.btviewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ute.btviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val content = binding.edtInput.text.toString()

            if (content.isNotEmpty()) {
                // Sử dụng Extension toGreeting() và show()
                binding.tvResult.text = content.toGreeting()
                binding.tvResult.show()

                // Sử dụng Extension showToast()
                it.showToast("Đã áp dụng Extension thành công!")
            } else {
                it.showToast("Vui lòng nhập nội dung!")
                binding.tvResult.hide() // Sử dụng Extension hide()
            }
        }
    }
}