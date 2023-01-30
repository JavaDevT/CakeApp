package com.cakeshop.org.view.products;


import com.cakeshop.org.utils.HbmConfigApp;
import com.cakeshop.org.view.addproducts.AddProducts;
import org.hibernate.query.Query;

 import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AvailableProductsRepository  {

    @Autowired
    HbmConfigApp hbmConfigApp;
    public List<AddProducts> getProducts(){
        try {

            Session session = hbmConfigApp.getSessionFactory().openSession();
            Query  addProducts=   session.createQuery("from AddProducts");//,AddProducts.class).list();
            List<AddProducts> products= addProducts.getResultList();
            session.close();
            return products;
        } catch (Exception e) {
            System.out.println("error  " + e.getMessage() + "" + e.getLocalizedMessage());
        }
        return null;
    }
}
