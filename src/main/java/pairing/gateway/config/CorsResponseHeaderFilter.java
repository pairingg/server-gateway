//package pairing.gateway.config;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class CorsResponseHeaderFilter implements GlobalFilter, Ordered {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//            ServerHttpResponse response = exchange.getResponse();
//            HttpHeaders headers = response.getHeaders();
//
//            headers.set("Access-Control-Allow-Origin", exchange.getRequest().getHeaders().getOrigin());
//            headers.add("Access-Control-Allow-Headers", "Authorization, Content-Type");
//            headers.add("Access-Control-Allow-Methods","GET, PATCH, POST, PUT, DELETE, OPTIONS");
//            headers.add("Access-Control-Allow-Credentials","true");
//
//        }));
//    }
//
//    @Override
//    public int getOrder() {
//        return Ordered.LOWEST_PRECEDENCE;
//    }
//}
