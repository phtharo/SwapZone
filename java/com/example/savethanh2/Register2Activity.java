package com.example.savethanh2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityRegister2Binding;

public class Register2Activity extends AppCompatActivity {
    private ActivityRegister2Binding binding;
    private Button lastSelectedButton = null;
    private int quantity = 1; // Giá trị ban đầu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegister2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EdgeToEdge.enable(this);

        binding.back.setOnClickListener(view -> onBackPressed());
        binding.btnres.setOnClickListener(view -> handleRegistration());

        setupCategoryButtons();
        setupQuantityButtons();
    }

    private void handleRegistration() {
        Intent intent = new Intent(Register2Activity.this, HomeActivity.class);
        Toast.makeText(this, "Registered successfully", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    private void setupCategoryButtons() {
        Button[] buttons = {
                binding.btnClothes, binding.btnShoes, binding.btnBooks,
                binding.btnFood, binding.btnAppliances, binding.btnOther
        };

        View.OnClickListener buttonClickListener = view -> {
            Button clickedButton = (Button) view;

            if (lastSelectedButton != null) {
                lastSelectedButton.setBackgroundColor(Color.parseColor("#4CAF50"));
            }

            clickedButton.setBackgroundColor(Color.parseColor("#388E3C"));
            lastSelectedButton = clickedButton;
        };

        for (Button button : buttons) {
            button.setOnClickListener(buttonClickListener);
        }
    }

    private void setupQuantityButtons() {
        binding.btnMinus.setOnClickListener(view -> {
            if (quantity > 1) {
                quantity--;
                binding.tvQuantity.setText(String.valueOf(quantity));
            }
        });

        binding.btnPlus.setOnClickListener(view -> {
            quantity++;
            binding.tvQuantity.setText(String.valueOf(quantity));
        });
    }
}
