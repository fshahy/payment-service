package fshahy.delifery.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeliFeryPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliFeryPaymentServiceApplication.class, args);
	}

}
