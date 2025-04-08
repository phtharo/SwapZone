package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.savethanh2.databinding.ActivityChat2Binding;
import com.example.savethanh2.databinding.ActivityChatBinding;

public class Chat2Activity extends AppCompatActivity {

    private ActivityChat2Binding binding; // Sử dụng ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chat);
        // Ánh xạ ViewBinding
        binding = ActivityChat2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Gắn sự kiện nút Back để quay lại trang trước
        binding.back.setOnClickListener(view -> onBackPressed());

    }
}
