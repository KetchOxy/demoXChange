package org.generation.italy.demoxchange.model.dto;

import java.util.List;

public record LoginResponse(
        String token,
        List<String> roles
) {}

