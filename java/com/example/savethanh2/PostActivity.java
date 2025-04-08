package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityPostBinding;

public class PostActivity extends AppCompatActivity {

    private ActivityPostBinding binding; // Khai báo ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Ánh xạ ViewBinding
        binding = ActivityPostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Xử lý sự kiện click nút "pro" để điều hướng đến ProfileActivity
        binding.pro.setOnClickListener(view -> {
            Intent intent = new Intent(PostActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        // Xử lý sự kiện click nút "shop" để điều hướng đến Post2Activity
        binding.shop.setOnClickListener(view -> {
            Intent intent = new Intent(PostActivity.this, Post2Activity.class);
            startActivity(intent);
        });

        binding.home.setOnClickListener(view -> {
            Intent intent = new Intent(PostActivity.this, HomeActivity.class);
            startActivity(intent);
        });
        binding.regis.setOnClickListener(view -> {
            Intent intent = new Intent(PostActivity.this, Register2Activity.class);
            startActivity(intent);
        });
        binding.back.setOnClickListener(view -> onBackPressed());
        binding.btnPost.setOnClickListener(view -> {
            // Lấy nội dung từ EditText
            String postContent = binding.etPostContent.getText().toString().trim();

            // Kiểm tra nếu nội dung không rỗng thì gửi đi
            if (!postContent.isEmpty()) {
                Intent intent = new Intent(PostActivity.this, ViewPostActivity.class);
                intent.putExtra("POST_CONTENT", postContent);
                startActivity(intent);
            } else {
                binding.etPostContent.setError("Please enter some content before posting.");
            }
        });

    }
}
