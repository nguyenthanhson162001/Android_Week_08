package com.example.tiki_layout;

import android.os.Bundle;
import android.widget.ListView;

import androidx.fragment.app.FragmentActivity;

import com.example.tiki_layout.adapter.ProductAdapter;
import com.example.tiki_layout.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivityListView extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view);

        ProductFragment productFragment = new ProductFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, productFragment, "productFragment").commit();
    }
}