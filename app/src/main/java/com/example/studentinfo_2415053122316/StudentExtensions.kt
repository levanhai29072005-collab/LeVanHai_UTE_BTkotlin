package com.example.studentinfo_2415053122316
fun Double.toAcademicClassification(): String {
    return when {
        this >= 9.0 -> "Xuất sắc"
        this >= 8.0 -> "Giỏi"
        this >= 6.5 -> "Khá"
        this >= 5.0 -> "Trung bình"
        else -> "Yếu"
    }
}
fun Double.toPassStatus(): String {
    return if (this >= 5.0) "ĐẠT" else "CHƯA ĐẠT"
}