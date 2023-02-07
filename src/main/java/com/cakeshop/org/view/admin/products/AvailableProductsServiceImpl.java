package com.cakeshop.org.view.admin.products;


import com.cakeshop.org.model.AddProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvailableProductsServiceImpl implements AvailableProductsService {

    @Autowired
    AvailableProductsRepository repository;

    @Override
    public List<AddProducts> getAllProducts() {

        return repository.getProducts();
    }
}
