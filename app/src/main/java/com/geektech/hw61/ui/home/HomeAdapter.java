package com.geektech.hw61.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.geektech.hw61.databinding.RecyclerViewItemBinding;
import com.geektech.hw61.ui.home.model.HomeModel;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private ArrayList<HomeModel> list = new ArrayList<>();
    private RecyclerViewItemBinding binding;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        binding = RecyclerViewItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    public void addItems(ArrayList<HomeModel> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private RecyclerViewItemBinding binding = RecyclerViewItemBinding.bind(itemView);

        public ViewHolder(View itemView) {
            super(itemView);
        }


        public void onBind(HomeModel homeModel) {

            binding.tvDescription.setText(homeModel.getDesc());
            binding.tvData.setText(homeModel.getData());
            binding.imageView1.setImageResource(homeModel.getImage());
        }
    }
}
