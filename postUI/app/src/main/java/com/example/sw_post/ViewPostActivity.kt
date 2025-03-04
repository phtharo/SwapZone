package com.example.sw_post
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ViewPostActivity : AppCompatActivity() {
    private lateinit var txt_post_content: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewpost_activity)

        val txt_post_content = findViewById<TextView>(R.id.txt_post_content)

        val content = intent.getStringExtra("post_content")
        txt_post_content.text = content ?: "Không có nội dung"
    }
}
