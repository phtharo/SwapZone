package com.example.savethanh2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.savethanh2.databinding.ActivitySupportBinding

class SupportActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySupportBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo binding
        binding = ActivitySupportBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Thêm bất kỳ logic hoặc giao diện nào cho ContactActivity tại đây
        // Ví dụ:

    }
}
