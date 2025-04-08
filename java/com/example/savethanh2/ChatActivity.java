package com.example.savethanh2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityChatBinding;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Gắn sự kiện nút Back để quay lại trang trước
        binding.back.setOnClickListener(view -> onBackPressed());

        // Xử lý sự kiện khi ấn nút gửi tin nhắn
        binding.btnSend.setOnClickListener(view -> sendMessage());
    }

    private void sendMessage() {
        String messageText = binding.sendmess.getText().toString().trim();
        if (!messageText.isEmpty()) {
            // Tạo TextView mới để hiển thị tin nhắn gửi
            TextView newMessage = new TextView(this);
            newMessage.setText(messageText);
            newMessage.setTextSize(14);
            newMessage.setTextColor(getResources().getColor(android.R.color.white));
            newMessage.setBackgroundResource(R.drawable.chat_bubble_user);
            newMessage.setPadding(20, 12, 20, 12); // Padding trong tin nhắn

            // LayoutParams để căn lề và căn phải tin nhắn
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(50, 10, 16, 10); // Khoảng cách giữa các tin nhắn
            params.gravity = Gravity.END; // Đẩy tin nhắn sang phải
            newMessage.setLayoutParams(params);

            // Thêm tin nhắn vào layout chứa tin nhắn
            binding.chatContainer.addView(newMessage);

            // Xóa nội dung trong EditText sau khi gửi
            binding.sendmess.setText("");
        }
    }


}
