package com.geektech.hw61.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.hw61.R;
import com.geektech.hw61.databinding.FragmentFollowingBinding;
import com.geektech.hw61.ui.dashboard.model.FollowingModel;

import java.util.ArrayList;

public class FollowingFragment extends Fragment {

    private FragmentFollowingBinding binding;
    private FollowingAdapter adapter = new FollowingAdapter();
    private ArrayList<FollowingModel> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFollowingBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initView();
    }

    private void initView() {
        adapter.addItems(list);
        binding.containerFollowing.setAdapter(adapter);
    }

    private void createList() {
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
        list.add(new FollowingModel(R.drawable.img, R.drawable.ic_brisbane, "Eminem liked your photo "));
    }
}