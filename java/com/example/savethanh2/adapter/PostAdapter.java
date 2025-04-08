package com.example.savethanh2.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savethanh2.databinding.PostItemBinding;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {


    private List<Integer> avatars;  // Danh sách tên sản phẩm
    private List<String> names;  // Danh sách giá sản phẩm
    private List<String> times;  // Danh sách URL ảnh sản phẩm
    private List<String> descriptions;  // Danh sách mô tả sản phẩm
    private List<Integer> image;  // Danh sách số lượng sản phẩm trong giỏ


    // Constructor để nhận các tham số
    public PostAdapter(List<Integer> items, List<String> price, List<String> images,
                       List<String> description, List<Integer> cartQuantity) {
        this.avatars = items;
        this.names = price;
        this.times = images;
        this.descriptions = description;
        this.image = cartQuantity;

    }


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Sử dụng đúng đối tượng 'parent' thay vì 'viewGroup'
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        PostItemBinding binding = PostItemBinding.inflate(inflater, parent, false);
        return new PostViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        // Cập nhật dữ liệu vào view holder tại đây
    }

    @Override
    public int getItemCount() {
        return 0; // Bạn cần trả về số lượng item trong adapter
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        private final PostItemBinding binding;

        public PostViewHolder(PostItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        // Thêm các phương thức để truy cập dữ liệu từ binding nếu cần
    }
}
