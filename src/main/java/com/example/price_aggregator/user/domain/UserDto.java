package com.example.price_aggregator.user.domain;

import java.time.LocalDate;
import java.util.UUID;

public record UserDto(
        UUID id,
        String firstName,
        String lastName,
        LocalDate creationDate,
        String email,
        String password
) {
}
