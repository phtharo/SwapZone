package com.example.swapzone;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.swapzone.databinding.ActivityDonateBinding;
import java.util.ArrayList;
import java.util.List;

public class DonateActivity extends AppCompatActivity {

    private ActivityDonateBinding binding; // Sử dụng ViewBinding
    private List<LinearLayout> linearLayouts;
    private List<TextView> textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityDonateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Gắn sự kiện nút Back để quay lại trang trước
        binding.back.setOnClickListener(view -> onBackPressed());

        // Khởi tạo danh sách chứa các LinearLayout và TextView
        linearLayouts = new ArrayList<>();
        textViews = new ArrayList<>();

        // Thêm các LinearLayout vào danh sách
        linearLayouts.add(binding.rqi296dafbqj); // Vietnam Red Cross Society
        linearLayouts.add(binding.linearHandicap); // Handicap International
        linearLayouts.add(binding.linearDKT); // DKT International
        linearLayouts.add(binding.linearBlueDragon); // Blue Dragon Children’s Foundation

        // Thêm các TextView vào danh sách theo thứ tự tương ứng
        textViews.add(binding.r4uzfpx1q8dd); // Vietnam Red Cross Society
        textViews.add(binding.textHandicap); // Handicap International
        textViews.add(binding.textDKT); // DKT International
        textViews.add(binding.textBlueDragon); // Blue Dragon Children’s Foundation

        // Gắn sự kiện tìm kiếm
        binding.editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterList(s.toString().trim());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    // Hàm lọc danh sách theo ký tự nhập vào
    private void filterList(String query) {
        for (int i = 0; i < textViews.size(); i++) {
            String itemText = textViews.get(i).getText().toString().toLowerCase();
            if (itemText.contains(query.toLowerCase())) {
                linearLayouts.get(i).setVisibility(View.VISIBLE);
            } else {
                linearLayouts.get(i).setVisibility(View.GONE);
            }
        }
    }
}
