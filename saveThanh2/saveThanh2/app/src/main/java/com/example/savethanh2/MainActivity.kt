package com.example.savethanh2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.example.savethanh2.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Lấy NavigationView từ layout
        val navView: BottomNavigationView = findViewById(R.id.navView)


        // Thiết lập NavigationItemSelectedListener để xử lý khi chọn item từ menu
        binding.navView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_acc -> {
                    openContactActivity()
                    true
                }
                else -> false
            }
        }

    }

    private fun openContactActivity() {
        startActivity(Intent(this, ContactActivity::class.java))
    }
}
