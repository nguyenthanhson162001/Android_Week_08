package com.example.tiki_layout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tiki_layout.model.Product;
import com.example.tiki_layout.R;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private  int idLayout; //item
    private Context context;
    private List<Product> products ;

    public ProductAdapter(int idLayout, Context context, List<Product> products) {
        this.idLayout = idLayout;
        this.context = context;
        this.products = products;
    }

    @Override
    public int getCount() {
        if(products == null)
             return 0;
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){

            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout,viewGroup, false);

        }
        TextView name = view.findViewById(R.id.name);
        TextView description = view.findViewById(R.id.description);
        ImageView imageView = view.findViewById(R.id.img);
        Product product = products.get(i);
        name.setText(product.getName());
        imageView.setImageResource(product.getImage());
        description.setText(product.getDescription());

        return view;

    }
}
