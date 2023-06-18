package com.sathiyan.productserivce.repository;

import com.sathiyan.productserivce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
