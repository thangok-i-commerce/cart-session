package thangok.icommerce.cartsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CartSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartSessionApplication.class, args);
	}

}
