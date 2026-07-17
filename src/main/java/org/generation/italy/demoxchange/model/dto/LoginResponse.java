package org.generation.italy.houseCup.model.dto;

import java.util.List;

public record LoginResponse(
        String token,
        List<String> roles
) {}

