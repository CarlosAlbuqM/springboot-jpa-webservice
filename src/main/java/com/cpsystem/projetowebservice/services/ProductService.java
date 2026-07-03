package com.cpsystem.projetowebservice.services;

import com.cpsystem.projetowebservice.entities.Product;
import com.cpsystem.projetowebservice.entities.User;
import com.cpsystem.projetowebservice.repositories.ProductRepository;
import com.cpsystem.projetowebservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
