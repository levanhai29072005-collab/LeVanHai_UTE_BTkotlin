package com.ute.secondactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ute.secondactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bắt sự kiện bấm nút để gửi dữ liệu và chuyển màn hình
        binding.btnOpenDetail.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("MESSAGE_KEY", "Dữ liệu gửi từ MainActivity!")
            startActivity(intent)
        }
    }
}