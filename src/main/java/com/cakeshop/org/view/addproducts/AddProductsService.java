package com.cakeshop.org.view.addproducts;

public interface AddProductsService {

    int saveProducts(AddProducts addProducts);
    AddProducts findProducts(int id);
    boolean  upDateProduct(AddProducts id);
}
