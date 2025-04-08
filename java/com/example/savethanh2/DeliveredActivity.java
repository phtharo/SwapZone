package com.example.savethanh2;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityDeliveredBinding; // Đúng Binding

public class DeliveredActivity extends AppCompatActivity {

    private ActivityDeliveredBinding binding; // Đúng Binding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Ánh xạ ViewBinding
        binding = ActivityDeliveredBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Gắn sự kiện nút Back để quay lại trang trước
        binding.back.setOnClickListener(view -> onBackPressed());
    }
}
