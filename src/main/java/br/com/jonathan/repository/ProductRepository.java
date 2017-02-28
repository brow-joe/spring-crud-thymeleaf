package br.com.jonathan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jonathan.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}