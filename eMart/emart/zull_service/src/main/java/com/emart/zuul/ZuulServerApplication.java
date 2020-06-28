/**
 * 
 */
package com.emart.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author HongPengWen
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

}
