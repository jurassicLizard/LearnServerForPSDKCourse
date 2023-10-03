/*
 * Copyright (c)
 * 2023. Salem Bouraoui . Adapted from Tutorial at : https://spring.io/guides/tutorials/rest/.
 *   Released for educational purposes only as a supplement to PluralSights Angular - Getting Started Course.
 *   The author is not responsible for any direct or indirect misuse of this software and any related
 * consequences. Use at your own risk.
 */

package com.triassic.systems.ps.dk.ng.gs.testserver.configurations;

import com.triassic.systems.ps.dk.ng.gs.testserver.persistence.model.Product;
import com.triassic.systems.ps.dk.ng.gs.testserver.persistence.repositories.ProductsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);



    @Bean
    public CommandLineRunner initDatabase(ProductsRepository repository)
    {
        return args -> {
            logger.info("Adding ... " + repository.save(new Product(1L,"Leaf Rake",
                    "GDN-0011",
                    "March 19, 2021",
                    "Leaf rake with 48-inch wooden handle.",
                    19.95,
                    3.2,
                    "assets/images/leaf_rake.png")));

            logger.info("Adding ... " + repository.save(new Product(2L,"Garden Cart",
                    "GDN-0023",
                    "March 18, 2021",
                    "15 gallon capacity rolling garden cart",
                    32.99,
                    4.2,
                    "assets/images/garden_cart.png")));

            logger.info("Adding ... " + repository.save(new Product(5L,"Hammer",
                    "TBX-0048",
                    "May 21, 2021",
                    "Curved claw steel hammer",
                    8.9,
                    4.8,
                    "assets/images/hammer.png")));

            logger.info("Adding ... " + repository.save(new Product(8L,"Saw",
                    "TBX-0022",
                    "May 15, 2021",
                    "15-inch steel blade hand saw",
                    11.55,
                    3.7,
                    "assets/images/saw.png")));
            logger.info("Adding ... " + repository.save(new Product(10L,"Video Game Controller",
                    "GMG-0042",
                    "October 15, 2020",
                    "Standard two-button video game controller",
                    35.95,
                    4.6,
                    "assets/images/xbox-controller.png")));


        };
    }



}
