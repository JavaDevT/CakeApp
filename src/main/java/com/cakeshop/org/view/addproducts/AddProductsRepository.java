package com.cakeshop.org.view.addproducts;

import com.cakeshop.org.model.AddProducts;
import com.cakeshop.org.utils.HbmConfigApp;
import com.google.gson.Gson;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class AddProductsRepository {

    @Autowired
    HbmConfigApp hbmConfigApp;


    public int saveProduct(AddProducts addProducts) {
        try {

            Session session = hbmConfigApp.getSessionFactory().openSession();
            int productId = (Integer) session.save(addProducts);
            System.out.println("repso  " + productId);
             //session.save(addProducts);
            session.close();
            return productId;
        } catch (Exception e) {
            System.out.println("error  " + e.getMessage() + "" + e.getLocalizedMessage());
        }

        return -1;
    }

    public int editProduct(int id) {
        return 0;
    }

    public AddProducts findProducts(int id) {
        try {
            return (AddProducts) hbmConfigApp.getSessionFactory().openSession().get(AddProducts.class, id);
        } catch (Exception ignored) {
        }
        return null;
    }

    public boolean updateProduct(AddProducts id) {
        boolean status = false;
        try {
            id.setCakeImage("dkdvmkfv");
            Session session = hbmConfigApp.getSessionFactory().openSession();
            ///AddProducts student = session.load(AddProducts.class, id.getId());
          //   student.setCakeName(id.getCakeName());
          Transaction tx = session.beginTransaction();

            Gson gson=new Gson();
            System.out.println(gson.toJson(id));
             session.saveOrUpdate(id);
            tx.commit();
            status = true;
            session.close();
        } catch (Exception e) {
            System.out.println("error  " + e.getMessage() + "" + e.getLocalizedMessage());
        }

        return status;
    }
}
