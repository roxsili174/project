package com.example.myapplication.ui.home;

import static com.example.myapplication.R.id.button1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.View.OnClickListener;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements View.OnClickListener {
    EditText temperature, pressure, pulse;
    Button button1, button2;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        temperature = temperature.findViewById(R.id.temperature);
        pressure = pressure.findViewById(R.id.pressure);
        pulse = pulse.findViewById(R.id.pulse);
        button1 = button1.findViewById(R.id.button1);
        button2 = button2.findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                String temp = temperature.getText().toString();
                String press = pressure.getText().toString();
                String pul = pulse.getText().toString();
                temperature.setText(temp);
                pressure.setText(press);
                pulse.setText(pul);
                break;
            case R.id.button2:
                temperature.getText().clear();
                pressure.getText().clear();
                pulse.getText().clear();
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    }
