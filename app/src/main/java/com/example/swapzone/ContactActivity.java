package com.example.swapzone;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.swapzone.R.id.databinding.ActivityChatBinding;
import com.example.swapzone.R.id.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {

    private ActivityContactBinding binding; // Sử dụng ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chat);
        // Ánh xạ ViewBinding
        binding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Gắn sự kiện nút Back để quay lại trang trước
        binding.back.setOnClickListener(view -> onBackPressed());
        binding.btnPostLeft.setOnClickListener(view -> {
            Intent intent = new Intent(ContactActivity.this, ChatActivity.class);
            startActivity(intent);
        });
        binding.pro.setOnClickListener(view -> {
            Intent intent = new Intent(ContactActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        // Xử lý sự kiện click nút "shop" để điều hướng đến Post2Activity
        binding.shop.setOnClickListener(view -> {
            Intent intent = new Intent(ContactActivity.this, Post2Activity.class);
            startActivity(intent);
        });

        binding.home.setOnClickListener(view -> {
            Intent intent = new Intent(ContactActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        binding.regis.setOnClickListener(view -> {
            Intent intent = new Intent(ContactActivity.this, Register2Activity.class);
            startActivity(intent);
        });
        binding.add.setOnClickListener(view -> {
            Intent intent = new Intent(ContactActivity.this, PostActivity.class);
            startActivity(intent);
        });
    }
}
