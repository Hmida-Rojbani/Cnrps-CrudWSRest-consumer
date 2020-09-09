package tn.cnrps.ws.rest.white;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WhiteWsRestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhiteWsRestConsumerApplication.class, args);
	}

}
