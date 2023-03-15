package com.example.productbackend.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productbackend.models.Product;

@RestController



public class ProductController {
    
        @GetMapping("product")
        
        public Product getProduct(){
            
            Product obj = new Product();

            obj.setId(1);
            obj.setName("RTX 4090");
            obj.setPrice(5090.90);

            return obj;
        }

        @GetMapping("products")
        public List<Product> getProducts(){
           
            Product obj = new Product();
            obj.setId(1);
            obj.setName("RTX 4090");
            obj.setPrice(5090.90);

            Product obj2 = new Product();
            obj2.setId(2);
            obj2.setName("RTX 2090");
            obj2.setPrice(2090.90);

            Product obj3 = new Product();
            obj3.setId(3);
            obj3.setName("RTX 3090");
            obj3.setPrice(5390.90);

            Product obj4 = new Product();
            obj4.setId(4);
            obj4.setName("RTX 4090");
            obj4.setPrice(4090.90);

            List<Product> list = new ArrayList<>();

            list.add(obj);
            list.add(obj2);
            list.add(obj3);
            list.add(obj4);

            return list;
        }
}
