package org.codingskills.productservice.dtos;

public class ErrorResponseExceptionDto {
    private String message;
    private String detail;

    public ErrorResponseExceptionDto(String message, String detail) {
        this.message = message;
        this.detail = detail;
    }
}
