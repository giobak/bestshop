package com.gio.bestshop.repositories;

import com.gio.bestshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
