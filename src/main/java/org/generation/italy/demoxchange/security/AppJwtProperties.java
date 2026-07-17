package org.generation.italy.demoxchange.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@ConfigurationProperties(prefix = "app.jwt")
public record AppJwtProperties(
        String issuer,
        String secret,
        Duration ttl
) {}

