package com.example.appbank.View.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.appbank.R;
import com.example.appbank.ViewModel.AccountViewModel;

public class MainActivity extends AppCompatActivity {

    AccountViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar ViewModel
        viewModel= new ViewModelProvider(this).get(AccountViewModel.class);

        //Operar sobre el ViewModel
        viewModel.setBalance(50000.15);
        viewModel.setName("Vanessa Anegelina");

        TextView name= findViewById(R.id.tvName);
        name.setText(viewModel.getName());

    }
}