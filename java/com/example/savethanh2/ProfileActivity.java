package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    private ActivityProfileBinding binding; // Khai báo ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Ánh xạ ViewBinding
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Xử lý sự kiện click nút "pro" để điều hướng đến ProfileActivity
        binding.home.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        // Xử lý sự kiện click nút "shop" để điều hướng đến Post2Activity
        binding.shop.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, Post2Activity.class);
            startActivity(intent);
        });

        binding.add.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, PostActivity.class);
            startActivity(intent);
        });
        binding.regis.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, Register2Activity.class);
            startActivity(intent);
        });
        binding.logout.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, SigninActivity.class);
            startActivity(intent);
        });
        binding.donate.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, DonateActivity.class);
            startActivity(intent);
        });
        binding.contact.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, ContactActivity.class);
            startActivity(intent);
        });
        binding.deli.setOnClickListener(view -> {
            Intent intent = new Intent(ProfileActivity.this, Post2Activity.class);
            startActivity(intent);
        });
    }
}
