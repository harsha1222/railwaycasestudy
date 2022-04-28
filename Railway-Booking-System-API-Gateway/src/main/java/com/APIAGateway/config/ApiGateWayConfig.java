package com.APIAGateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEurekaClient
public class ApiGateWayConfig {
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p
                        .path("/fare/findAll")
                        .uri("http://localhost:8081"))
				.route(p ->p
						.path("/fare/find/{trainNo}")
						.uri("http://localhost:8081"))
				.route(p ->p
						.path("/fare/add")
						.uri("http://localhost:8081"))
				.route(p ->p
						.path("/fare/update/{trainNo}")
						.uri("http://localhost:8081"))
				.route(p ->p
						.path("/fare/delete/{trainNo}")
						.uri("http://localhost:8081"))
				.route(p ->p
						.path("/fare/updateSeats/{trainNo}/{noOfPassengers}")
						.uri("http://localhost:8081"))
				.route(p ->p
						.path("/fare/findBy/{startPoint}/{endPoint}/{trainDate}")
						.uri("http://localhost:8081"))
				.route(p ->p
						.path("/fare/signup")
						.uri("http://localhost:8081"))
		       .build();
	}
	
	@Bean
	public RouteLocator myRoutes1(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p
                        .path("/search/alltrains")
                        .uri("http://localhost:8084"))
				.route(p ->p
                        .path("/search/status/")
                        .uri("http://localhost:8084"))
				.route(p ->p
                        .path("/search/trainNo/")
                        .uri("http://localhost:8084"))
				.route(p ->p
                        .path("/search/findBy/")
                        .uri("http://localhost:8084"))
				.route(p ->p
                        .path("/search/findBy/{startPoint}/{endPoint}/{trainDate}")
                        .uri("http://localhost:8084"))
		       .build();
	}
	
	@Bean
	public RouteLocator myRoutes2(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p
                        .path("/user/getAll")
                        .uri("http://localhost:8082"))
				.route(p ->p
                        .path("/user/get/{pnrNo}")
                        .uri("http://localhost:8082"))
				.route(p ->p
                        .path("/user/book/add")
                        .uri("http://localhost:8082"))
				.route(p ->p
                        .path("/user/cancel/")
                        .uri("http://localhost:8082"))
		       .build();
	}

	@Bean
	public RouteLocator myRoutes3(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p
                        .path("/pay/getAll")
                        .uri("http://localhost:8083"))
				.route(p ->p
                        .path("/pay/addPayment/")
                        .uri("http://localhost:8083"))
				.route(p ->p
                        .path("/pay//cancel/{pnrNo}")
                        .uri("http://localhost:8083"))
		       .build();
	}
	
	@Bean
	public RouteLocator myRoutes4(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p
                        .path("/checkIn/get/checkin/{pnrNo}")
                        .uri("http://localhost:8086"))
				.route(p ->p
                        .path("/checkIn/getAllCheckins")
                        .uri("http://localhost:8086"))
		       .build();
	}
}
