package com.cakeshop.org.view.addproducts;

import com.cakeshop.org.utils.HbmConfigApp;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddProductsRepository {

    @Autowired
    HbmConfigApp hbmConfigApp;


    public int saveProduct(AddProducts addProducts) {
        try {

            Session session = hbmConfigApp.getSessionFactory().openSession();
            int productId = (Integer) session.save(addProducts);
            System.out.println("repso  "+productId);
            //session.save(addProducts);
            session.close();
            return productId;
        } catch (Exception e) {
            System.out.println("error  " + e.getMessage() + "" + e.getLocalizedMessage());
        }

        return -1;
    }
}
