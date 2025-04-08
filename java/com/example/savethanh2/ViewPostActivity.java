//package com.example.savethanh2;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.core.view.WindowCompat;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.savethanh2.adapter.PostAdapter;
//import com.example.savethanh2.databinding.ViewpostActivityBinding;
//import com.example.savethanh2.model.PostModel;
//import com.google.firebase.firestore.FirebaseFirestore;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ViewPostActivity extends Fragment {
//
//    private RecyclerView recyclerView;
//    private List<PostModel> postList;
//    private PostAdapter adapter;
//
//    private FirebaseFirestore db;
//    private ViewpostActivityBinding binding;
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        // Khởi tạo Binding cho Fragment
//        binding = ViewpostActivityBinding.inflate(inflater, container, false);
//        View view = binding.getRoot();
//
//        List<Integer> avatars = new ArrayList<>();
//        avatars.add(R.drawable.oet);
//        avatars.add(R.drawable.oet);
//        avatars.add(R.drawable.oet);
//
//        List<String> names = new ArrayList<>();
//        names.add("SaiGon Chilren's Charity CIO ");
//        names.add("SaiGon Chilren's Charity CIO 1 ");
//        names.add("SaiGon Chilren's Charity CIO 2 ");
//
//        List<String> times = new ArrayList<>();
//        times.add("1h. Thanh Khê, Đà Nẵng");
//        times.add("23h. Ngũ Hành Sơn, Đà Nẵng");
//        times.add("1h. Liên Chiểu, Đà Nẵng");
//
//        List<String> decriptions = new ArrayList<>();
//        decriptions.add("Dear Respected Benefactors, Organizations, Individuals, and the Community, With the aim of sharing difficulties and bringing joy to underprivileged children, the charity program To School with You has been launched. Our goal is to collect clothing and school supplies to encourage and support these children in their pursuit of education and knowledge.\n" +
//                "Dear Respected Benefactors, the charity progr.");
//        decriptions.add("Dear Respected Benefactors, Organizations, Individuals, and the Community, With the aim of sharing difficulties and bringing joy to underprivileged children, the charity program To School with You has been launched. Our goal is to collect clothing and school supplies to encourage and support these children in their pursuit of education and knowledge.\n" +
//                "Dear Respected Benefactors, the charity progr.");
//        decriptions.add("Dear Respected Benefactors, Organizations, Individuals, and the Community, With the aim of sharing difficulties and bringing joy to underprivileged children, the charity program To School with You has been launched. Our goal is to collect clothing and school supplies to encourage and support these children in their pursuit of education and knowledge.\n" +
//                "Dear Respected Benefactors, the charity progr.");
//
//        List<Integer> image = new ArrayList<>();
//        image.add(R.drawable.sg);
//        image.add(R.drawable.sg);
//        image.add(R.drawable.sg);
//
//        adapter = new PostAdapter(avatars, names, times, decriptions, image);
//
//        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
//        binding.recyclerView.setAdapter(adapter);
//
//        return view;
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
//    }
//}
package com.example.savethanh2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.savethanh2.databinding.ActivityHomeBinding;
import com.example.savethanh2.databinding.ViewpostActivityBinding;

public class ViewPostActivity extends AppCompatActivity {
    private TextView tvPostContent;
    private ViewpostActivityBinding binding; // Khai báo ViewBinding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);




        // Ánh xạ ViewBinding
        binding = ViewpostActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        tvPostContent = findViewById(R.id.tvPostContent);

        // Nhận dữ liệu từ Intent
        String postContent = getIntent().getStringExtra("POST_CONTENT");
        if (postContent != null) {
            tvPostContent.setText(postContent);
        }
        binding.back.setOnClickListener(view -> onBackPressed());
        binding.donate1.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPostActivity.this, Register2Activity.class);
            startActivity(intent);
        });
        binding.donate2.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPostActivity.this, Register2Activity.class);
            startActivity(intent);
        });
        binding.donate3.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPostActivity.this, Register2Activity.class);
            startActivity(intent);
        });

        binding.chat1.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPostActivity.this, ChatActivity.class);
            startActivity(intent);
        });
        binding.chat2.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPostActivity.this, ChatActivity.class);
            startActivity(intent);
        });
        binding.chat3.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPostActivity.this, ChatActivity.class);
            startActivity(intent);
        });
    }
}
