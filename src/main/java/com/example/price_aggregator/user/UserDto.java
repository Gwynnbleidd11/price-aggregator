package com.example.price_aggregator.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.UUID;

public record UserDto(
        UUID id,
        String firstName,
        String lastName,
        LocalDate creationDate,
        String email,
        @JsonIgnore
        String password,
        String role
) {
}
