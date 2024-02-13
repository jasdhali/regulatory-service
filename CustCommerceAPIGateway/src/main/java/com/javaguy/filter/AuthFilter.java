package com.javaguy.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
@RefreshScope
public class AuthFilter implements GatewayFilter {

    @Value("${authentication.enabled}")
    private boolean authEnabled;
    
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
    	if( !authEnabled ) {
    		System.out.println("Authentication is disabled. To enable it, make \\\"authentication.enabled\\\" property as true");
    		return chain.filter(exchange);
    	}
    	return chain.filter(exchange);
    }
}
