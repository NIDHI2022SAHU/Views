package com.example.firstkotlin;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class Afragment extends Fragment{



     public View onCreatView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    return inflater.inflate(R.layout.fragment_afragment,container,false);
    }}