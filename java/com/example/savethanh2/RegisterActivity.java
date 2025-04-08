package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.savethanh2.databinding.ActivityRegisterBinding;
import com.example.savethanh2.databinding.ViewpostActivityBinding;

public class RegisterActivity extends AppCompatActivity {
    private com.example.savethanh2.databinding.ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.back.setOnClickListener(view -> onBackPressed());
        binding.res.setOnClickListener(view -> {
            Intent intent = new Intent(RegisterActivity.this, Register2Activity.class);
            startActivity(intent);
        });
    }
}