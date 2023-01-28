package com.cakeshop.org.view.products;


import com.cakeshop.org.utils.HbmConfigApp;
import com.cakeshop.org.view.addproducts.AddProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AvailableProductsRepository  {

    @Autowired
    HbmConfigApp hbmConfigApp;
    public List<AddProducts> getProducts(){
        hbmConfigApp.getSessionFactory();
        return null;
    }
}
