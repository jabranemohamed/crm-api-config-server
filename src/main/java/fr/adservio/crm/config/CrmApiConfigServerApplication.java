package fr.adservio.crm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableDiscoveryClient
@EnableConfigServer
public class CrmApiConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApiConfigServerApplication.class, args);
    }

}
