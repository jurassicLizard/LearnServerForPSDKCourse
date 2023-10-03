/*
 * Copyright (c)
 * 2023. Salem Bouraoui . Adapted from Tutorial at : https://spring.io/guides/tutorials/rest/.
 *   Released for educational purposes only as a supplement to PluralSights Angular - Getting Started Course.
 *   The author is not responsible for any direct or indirect misuse of this software and any related
 * consequences. Use at your own risk.
 */

package com.triassic.systems.ps.dk.ng.gs.testserver.controllers;

import com.triassic.systems.ps.dk.ng.gs.testserver.exceptions.ProductNotFoundException;
import com.triassic.systems.ps.dk.ng.gs.testserver.persistence.model.Product;
import com.triassic.systems.ps.dk.ng.gs.testserver.persistence.repositories.ProductsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);
    private final ProductsRepository repository;

    public ProductsController(ProductsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/products")
    public List<Product> getAllProducts()
    {
        logger.info("[GET] retrieving all products");
        return repository.findAll();
    }

    @GetMapping("/api/products/{id}")
    public Product getSingleProductById(@PathVariable Long id)
    {
        logger.info("[GET] retrieving product with id :"+ id);
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }
}
