package com.example.projetotcc.fragments;

import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetotcc.R;
import com.example.projetotcc.databinding.FragmentHomeBinding;
import com.example.projetotcc.fragments.ui.BaseFragment;

public class FragmentHome extends BaseFragment<FragmentHomeBinding> {
    private static final String TAG = FragmentHome.class.getSimpleName();

    public FragmentHome() { super(R.layout.fragment_home, FragmentHomeBinding::bind); }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onBindCreated(FragmentHomeBinding fragmentHomeBinding) {

    }
}