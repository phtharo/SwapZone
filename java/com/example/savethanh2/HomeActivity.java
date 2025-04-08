package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding; // Khai báo ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Ánh xạ ViewBinding
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Xử lý sự kiện click nút "pro" để điều hướng đến ProfileActivity
        binding.pro.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        // Xử lý sự kiện click nút "shop" để điều hướng đến Post2Activity
        binding.shop.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, Post2Activity.class);
            startActivity(intent);
        });

        binding.add.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, PostActivity.class);
            startActivity(intent);
        });
        binding.regis.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, Register2Activity.class);
            startActivity(intent);
        });
        binding.donate.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this, Register2Activity .class);
            startActivity(intent);
        });
    }
}
