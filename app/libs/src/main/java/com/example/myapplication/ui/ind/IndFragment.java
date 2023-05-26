package com.example.myapplication.ui.ind;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentIndBinding;
import com.example.myapplication.ui.information.InformationViewModel;

public class IndFragment extends Fragment {

    private FragmentIndBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        IndViewModel IndViewModel =
                new ViewModelProvider(this).get(IndViewModel.class);

        binding = FragmentIndBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInd;
        IndViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}