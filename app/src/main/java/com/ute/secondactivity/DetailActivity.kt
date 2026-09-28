package com.ute.secondactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ute.secondactivity.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Lấy dữ liệu gửi sang từ MainActivity
        val receivedText = intent.getStringExtra("MESSAGE_KEY")
        if (!receivedText.isNullOrEmpty()) {
            binding.tvReceivedData.text = receivedText
        }

        // Bấm nút quay lại màn hình trước
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}