package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.savethanh2.databinding.ActivitySigninBinding;
import com.example.savethanh2.model.UserModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class SigninActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private DatabaseReference database;
    private ActivitySigninBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        // Initialize Firebase Auth and Database
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance().getReference();
        binding.rzjuy4zhwfw.setOnClickListener(view -> registerUser());
        binding.rt0tgps6jqq9.setOnClickListener(view -> {
            startActivity(new Intent(SigninActivity.this, LoginActivity.class));
        });
    }
    private void registerUser() {
        String fullName = binding.rdbf6jc76vx5.getText().toString().trim();
        String email = binding.rbx9lma5nso.getText().toString().trim();
        String date = binding.rmpryolztwo.getText().toString().trim();
        String password = binding.r1mmslg88acj.getText().toString().trim();
        String cfPassword = binding.rnpva0513hsb.getText().toString().trim();

        if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || date.isEmpty() || cfPassword.isEmpty()) {
            Toast.makeText(this, "Please fill all details", Toast.LENGTH_SHORT).show();
            return;
        }


        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show();
                saveUserData(fullName, email);
                startActivity(new Intent(SigninActivity.this, LoginActivity.class));
                finish();
            } else {
                Toast.makeText(this, "Account creation failed", Toast.LENGTH_SHORT).show();
                Log.e("SignActivity", "createAccount: Failure", task.getException());
            }
        });
    }
    private void saveUserData(String fullName, String email) {
        String userID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        UserModel user = new UserModel(fullName, email);
        database.child("users").child(userID).setValue(user).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                Log.d("SignActivity", "User data saved successfully");
            } else {
                Log.e("SignActivity", "Failed to save user data", task.getException());
            }
        });
    }
}