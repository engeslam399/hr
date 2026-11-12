package com.example.hr.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record EmployeeRequest(
        @NotBlank @Size(max = 100) String firstName,
        @NotBlank @Size(max = 100) String lastName,
        @NotBlank @Email @Size(max = 150) String email,
        @Size(max = 20) String phoneNumber,
        @NotNull @DecimalMin("0.00") @Digits(integer = 8, fraction = 2) BigDecimal salary
) {
}
