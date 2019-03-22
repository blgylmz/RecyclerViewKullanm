package com.example.bilge.recyclerviewkullanm;

import java.util.ArrayList;

public class Product {

    private String productName;
    private String productDescription;
    private int imageID;

    public Product(){


    }

    public Product(int imageID, String productName,String productDescription){
        this.imageID=imageID;
        this.productDescription=productDescription;
        this.productName=productName;

    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public static ArrayList<Product> getData(){

        ArrayList<Product> productList = new ArrayList<Product>();
        int productImages[] ={R.drawable.bloggr, R.drawable.deviantart,R.drawable.digg,R.drawable.email,R.drawable.facebook,R.drawable.google_plus,R.drawable.instagram,R.drawable.linkedin,R.drawable.twitter,R.drawable.youtube,R.drawable.pinterest,R.drawable.share};
        String[] productNames = {"Blogger","Devinart","Digg","Email","Facebook","Google Plus","İnstagram","Linkedin","Twitter","Youtube","Pinterest", "Share"};
    for (int i=0;i<productImages.length;i++){

        Product temp = new Product();
        temp.setImageID(productImages[i]);
        temp.setProductName(productNames[i]);
        temp.setProductDescription("Sosyal Medya");
        productList.add(temp);
    }

    return productList;


    }
}
