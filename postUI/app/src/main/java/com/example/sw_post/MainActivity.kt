package com.example.sw_post

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_post = findViewById<Button>(R.id.btn_post)
        val edt_content = findViewById<EditText>(R.id.edt_content)
        val charityImage = findViewById<ImageView>(R.id.charityImage)


        btn_post.setOnClickListener {
            val text = edt_content.text.toString()
            if (text.isNotEmpty()) {
                val intent = Intent(this, ViewPostActivity::class.java).apply {
                    putExtra("post_content", text)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Vui lòng nhập nội dung bài đăng!", Toast.LENGTH_SHORT).show()
            }
        }
        val btnPost = findViewById<Button>(R.id.btn_post)
        btnPost.setOnClickListener {
            val intent = Intent(this, ViewPostActivity::class.java)
            startActivity(intent)
        }


        // Set image programmatically (ví dụ nếu cần tải từ Internet)
        charityImage.setImageResource(R.drawable.charity)
    }
}