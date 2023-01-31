package com.cakeshop.org.view.addproducts;

import com.cakeshop.org.model.AddProducts;

public interface AddProductsService {

    int saveProducts(AddProducts addProducts);
    AddProducts findProducts(int id);
    boolean  upDateProduct(AddProducts id);
}
