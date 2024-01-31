package com.sample.starter.service;

import com.sample.starter.model.Product;
import com.sample.starter.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repo;


    //READ
    public Product getProductByID(int id)
    {

        return repo.getReferenceById(id);
    }
    //READ
    public List<Product> getAllProduct()
    {
        return repo.findAll();
    }
    //CREATE
    public void createProduct(Product product)
    {

        repo.save(product);
    }
    //UPDATE
    public Product updateProduct(Product product)
    {
        repo.save(product);
        return product;
    }
    //DELETE
    public void deleteProduct(int id)
    {
        repo.deleteById(id);
    }
}