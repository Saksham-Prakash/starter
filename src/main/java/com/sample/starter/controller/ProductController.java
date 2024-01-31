package com.sample.starter.controller;

import com.sample.starter.model.Product;
import com.sample.starter.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    private ProductService service;

    @GetMapping("/getallproduct")
    public List<Product> getAllProduct()
    {
        return service.getAllProduct();
    }

    @PostMapping("/addproduct")
    public void addproduct(@RequestBody Product product)
    {
        service.createProduct(product);
    }
    @DeleteMapping("/deleteproduct")
    private void deleteProduct(@RequestParam Integer id)
    {
        service.deleteProduct(id);
    }
    @PutMapping("updateproduct")
    public void update(@RequestBody Product product)
    {
        service.updateProduct(product);
    }
}