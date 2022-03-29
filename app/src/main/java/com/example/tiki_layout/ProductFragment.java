package com.example.tiki_layout;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tiki_layout.adapter.ProductAdapter;
import com.example.tiki_layout.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProductFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProductFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProductFragment newInstance(String param1, String param2) {
        ProductFragment fragment = new ProductFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product, container, false);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img1));
        products.add(new Product(2,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img2));
        products.add(new Product(3,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img3));
        products.add(new Product(4,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img4));
        products.add(new Product(5,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img5));
        products.add(new Product(6,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img6));
        products.add(new Product(7,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img7));
        products.add(new Product(8,"Nike shoes-discount 50%","Pls touch to see detail", 2000, R.drawable.img8));

        ProductAdapter productAdapter = new ProductAdapter(R.layout.adapter_product,getActivity(), products);
        ListView listView = view.findViewById(R.id.listView);
        listView.setAdapter(productAdapter);

        return view;
    }
}