package com.example.savethanh2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.savethanh2.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo binding
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bắt sự kiện khi nhấn vào nút có id là org
        binding.org.setOnClickListener {
            val intent = Intent(this, SupportActivity::class.java)
            startActivity(intent)
        }
    }
}
