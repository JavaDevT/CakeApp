package com.cakeshop.org.view.addproducts;

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
}
