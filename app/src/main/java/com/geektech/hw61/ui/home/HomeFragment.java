package com.geektech.hw61.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geektech.hw61.R;
import com.geektech.hw61.databinding.FragmentHomeBinding;
import com.geektech.hw61.ui.home.model.HomeModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeAdapter adapter = new HomeAdapter();
    private ArrayList<HomeModel> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        creatList();
        initView();

    }

    private void creatList() {
        list.add(new HomeModel("Turkey","20 - September",R.drawable.rectangle));
        list.add(new HomeModel("Turkey","20 - September",R.drawable.rectangle));
        list.add(new HomeModel("Turkey","20 - September",R.drawable.rectangle));
        list.add(new HomeModel("Turkey","20 - September",R.drawable.rectangle));
        list.add(new HomeModel("Turkey","20 - September",R.drawable.rectangle));
        list.add(new HomeModel("Turkey","20 - September",R.drawable.rectangle));
    }

    private void initView() {
        adapter.addItems(list);
        binding.lents.setAdapter(adapter);
    }
}