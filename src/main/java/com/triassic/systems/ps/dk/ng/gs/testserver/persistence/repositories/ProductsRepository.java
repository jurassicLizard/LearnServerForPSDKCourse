/*
 * Copyright (c) 2023. Salem Bouraoui . Released for educational purposes only. The author is not responsible for any direct or indirect misuse of this software and any related consequences. Use at your own risk.
 */

package com.triassic.systems.ps.dk.ng.gs.testserver.persistence.repositories;

import com.triassic.systems.ps.dk.ng.gs.testserver.persistence.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepository extends JpaRepository<Product,Long>
{
}
