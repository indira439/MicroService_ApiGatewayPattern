package com.stackroute.apigatewaypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * With this annotation, this artifact will act like a Zuul service proxy and will enable all the features of a API gateway layer
 */
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayPatternApplication.class, args);
    }

}
