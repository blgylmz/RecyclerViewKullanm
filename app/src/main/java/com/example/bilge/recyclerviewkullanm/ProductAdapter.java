package com.example.bilge.recyclerviewkullanm;

import android.content.Context;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {


    ArrayList<Product> mProductList;
    LayoutInflater inflater;

    public ProductAdapter(Context context, ArrayList<Product> products){

        inflater = LayoutInflater.from(context);
        this.mProductList =products;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= inflater.inflate(R.layout.item_product_card,parent,false);
        MyViewHolder holder =new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Product selectedProduct = mProductList.get(position);
        holder.setData(selectedProduct,position);

    }

    @Override
    public int getItemCount() {

        return mProductList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView productName, productDescription;
        ImageView productImage, deleteproduct;

        public MyViewHolder(View itemView) {
            super(itemView);

            productName = (TextView) itemView.findViewById(R.id.productName);
            productDescription = (TextView) itemView.findViewById(R.id.productDescription);
            productImage = (ImageView) itemView.findViewById(R.id.productImage);
            deleteproduct = (ImageView) itemView.findViewById(R.id.deleteproduct);
            deleteproduct.setOnClickListener(this);
        }

        public void setData(Product selectedProduct, int position) {

            this.productName.setText(selectedProduct.getProductName());
            this.productDescription.setText(selectedProduct.getProductDescription());
            this.productImage.setImageResource(selectedProduct.getImageID());


        }

        @Override
        public void onClick(View v) {

        }
    }
}
