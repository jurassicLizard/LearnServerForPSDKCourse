/*
 * Copyright (c)
 * 2023. Salem Bouraoui . Adapted from Tutorial at : https://spring.io/guides/tutorials/rest/.
 *   Released for educational purposes only as a supplement to PluralSights Angular - Getting Started Course.
 *   The author is not responsible for any direct or indirect misuse of this software and any related
 * consequences. Use at your own risk.
 */

package com.triassic.systems.ps.dk.ng.gs.testserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class TestServerPsdkAngularCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServerPsdkAngularCourseApplication.class, args);
	}

}
