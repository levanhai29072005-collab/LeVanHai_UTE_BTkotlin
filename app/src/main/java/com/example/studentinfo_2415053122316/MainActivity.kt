package com.example.studentinfo_2415053122316

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentinfo_2415053122316.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Khởi tạo đối tượng Model với dữ liệu cá nhân
        val student = Student(
            studentId = "2415053122316",
            fullName = "Lê Văn Hải",
            className = "24T3",
            age = 21,
            score = 8.6
        )

        // Hiển thị thông tin cơ bản từ Model
        binding.tvStudentId.text = "Mã sinh viên: ${student.studentId}"
        binding.tvFullName.text = "Họ tên: ${student.fullName}"
        binding.tvClassName.text = "Lớp: ${student.className}"
        binding.tvAge.text = "Tuổi: ${student.age}"
        binding.tvScore.text = "Điểm: ${student.score}"

        // Sử dụng Extension Function theo yêu cầu mở rộng (MSSV chẵn)
        binding.tvClassification.text = "Xếp loại: ${student.score.toAcademicClassification()}"
        binding.tvStatus.text = "Trạng thái: ${student.score.toPassStatus()}"
    }
}