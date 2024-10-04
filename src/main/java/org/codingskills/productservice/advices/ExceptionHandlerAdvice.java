package org.codingskills.productservice.advices;

import org.codingskills.productservice.dtos.ErrorResponseExceptionDto;
import org.codingskills.productservice.exceptions.ArithmeticOperationException;
import org.codingskills.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponseExceptionDto> handleProductNotFoundException(ProductNotFoundException e) {
        ErrorResponseExceptionDto errorResponseExceptionDto = new ErrorResponseExceptionDto("Product Not Found", e.getLocalizedMessage());
        return new ResponseEntity<>(errorResponseExceptionDto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ArithmeticOperationException.class)
    public ResponseEntity<ErrorResponseExceptionDto> handleArithmeticException(ArithmeticException e) {
        ErrorResponseExceptionDto arithmeticException = new ErrorResponseExceptionDto("Arithmetic Exception", e.getMessage());
        return new ResponseEntity<>(arithmeticException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseExceptionDto> handleException(Exception e) {
        ErrorResponseExceptionDto errorResponseExceptionDto = new ErrorResponseExceptionDto("Internal Server Error", e.getMessage());
        return new ResponseEntity<>(errorResponseExceptionDto, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
