package com.example.subjectlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.R.layout;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Theory extends Fragment {

    public Theory() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_theory, container, false);

    }
}