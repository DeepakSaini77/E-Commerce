package com.example.ecom.Repository;

import com.example.ecom.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long > {
    List<Product> findAllByCategory_Id(int id);


}
