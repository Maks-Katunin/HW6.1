package com.geektech.hw61.ui.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.hw61.databinding.RecyclerViewItemFollowingBinding;
import com.geektech.hw61.ui.dashboard.model.FollowingModel;

import java.util.ArrayList;

public class FollowingAdapter extends RecyclerView.Adapter<FollowingAdapter.ViewHolder> {

    private ArrayList<FollowingModel> list = new ArrayList<>();
    private RecyclerViewItemFollowingBinding binding;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        binding = RecyclerViewItemFollowingBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    public void addItems(ArrayList<FollowingModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private RecyclerViewItemFollowingBinding binding = RecyclerViewItemFollowingBinding.bind(itemView);

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(FollowingModel followingModel) {
            binding.image1View1.setImageResource(followingModel.getImage1View1());
            binding.image2View2.setImageResource(followingModel.getImage2View2());
            binding.text1View1.setText(followingModel.getText1View1());

        }
    }
}
