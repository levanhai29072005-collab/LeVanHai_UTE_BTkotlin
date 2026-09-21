package com.ute.btviewbinding

import android.view.View
import android.widget.Toast

// Extension Function cho View: Ẩn/Hiện View
fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.GONE
}

// Extension Function cho String: Viết hoa toàn bộ và thêm lời chào
fun String.toGreeting(): String {
    return "Xin chào: ${this.trim().uppercase()}"
}

// Extension Function cho View: Hiển thị nhanh Toast thông báo
fun View.showToast(msg: String) {
    Toast.makeText(this.context, msg, Toast.LENGTH_SHORT).show()
}