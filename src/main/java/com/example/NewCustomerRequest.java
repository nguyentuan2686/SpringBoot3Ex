package com.example;

public record NewCustomerRequest(
        String name,
        String email,
        Integer age
) {
}
