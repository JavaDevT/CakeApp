package com.cakeshop.org.view.addproducts;

import com.cakeshop.org.model.AddProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddProductsServiceImpl implements AddProductsService {

    @Autowired
    AddProductsRepository addProductsRepository;

    @Override
    public int saveProducts(AddProducts addProducts) {
        return addProductsRepository.saveProduct(addProducts);
    }

    @Override
    public AddProducts findProducts(int id) {
        return addProductsRepository.findProducts(id);
     }

    @Override
    public boolean upDateProduct(AddProducts id) {
        return addProductsRepository.updateProduct(id);
    }
}
