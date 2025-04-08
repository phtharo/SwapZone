package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityPost2Binding;

public class Post2Activity extends AppCompatActivity {

    private ActivityPost2Binding binding; // Khai báo ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Ánh xạ ViewBinding
        binding = ActivityPost2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Xử lý sự kiện click nút "back" để quay lại trang trước
        binding.back.setOnClickListener(view -> onBackPressed());

        // Xử lý sự kiện click nút "deli", "deli1", "deli2" để điều hướng đến DeliveredActivity
        binding.deli.setOnClickListener(view -> navigateToDelivered());
        binding.deli1.setOnClickListener(view -> navigateToDelivered());
        binding.deli2.setOnClickListener(view -> navigateToDelivered());
    }

    // Phương thức điều hướng đến DeliveredActivity
    private void navigateToDelivered() {
        Intent intent = new Intent(Post2Activity.this, DeliveredActivity.class);
        startActivity(intent);
    }
}
