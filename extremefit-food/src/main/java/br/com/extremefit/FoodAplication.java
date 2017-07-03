/**
 * 
 */
package br.com.extremefit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author leonardo.pinho
 *
 */
@SpringBootApplication
public class FoodAplication {

	/**
	 * Bootstraps the application in standalone mode (i.e. java -jar).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FoodAplication.class, args);
	}
}
