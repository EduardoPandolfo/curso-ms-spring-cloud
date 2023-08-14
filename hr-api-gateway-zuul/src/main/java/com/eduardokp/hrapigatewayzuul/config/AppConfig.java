package com.eduardokp.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class AppConfig {

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter token = new JwtAccessTokenConverter();
        token.setSigningKey("MY-SECRET-KEY");
        return token;
    }

    @Bean
    public JwtTokenStore tokenStore() {
        return new JwtTokenStore(this.accessTokenConverter());
    }
}