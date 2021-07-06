package com.example.bottomnagivation2.ui.data_binding;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnagivation2.R;
import com.example.bottomnagivation2.databinding.ActivityTestDataBindingBinding;

import java.math.BigDecimal;

public class TestDataBindingActivity extends AppCompatActivity {
    private ActivityTestDataBindingBinding binding;
    private DataTestViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test_data_binding);
        binding.setViewModel(viewModel);
        binding.setData(new DataTest("Tu", "123"));
        binding.setLifecycleOwner(this);



        viewModel= new ViewModelProvider(this).get(DataTestViewModel.class);
        binding.btnToast.setOnClickListener((view) -> {
            Toast.makeText(this, "aaaaa", Toast.LENGTH_SHORT).show();
            viewModel.testString.setValue("Tu Test");
        });

        viewModel.getUsers().observe(this, dataTests -> {

        });

        viewModel.testString.observe(this, s -> {
            binding.tvTest.setText(s);
        });

    }

    public void showToast() {
        Toast.makeText(this, "aaaaa", Toast.LENGTH_SHORT).show();
    }
}
