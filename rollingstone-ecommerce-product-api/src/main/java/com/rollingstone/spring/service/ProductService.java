package com.rollingstone.spring.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.rollingstone.spring.model.Product;

public interface ProductService {

   Product save(Product product);
   Optional<Product> get(long id);
   Page<Product> getProductsByPage(Integer page, Integer size);
   void update(long id, Product product);
   void delete(long id);
}
