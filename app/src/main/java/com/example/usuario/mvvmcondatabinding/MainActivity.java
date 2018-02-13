package com.example.usuario.mvvmcondatabinding;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.usuario.mvvmcondatabinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    public ActivityMainBinding mBinding;
    private MainActivityViewModel mModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        mBinding.setViewModel(mModel);


    }


}
