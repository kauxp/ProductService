package com.paramjeet.productservice.exceptionhandlers;

import com.paramjeet.productservice.dtos.ExceptionDto;
import com.paramjeet.productservice.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDto> handleArithmeticException() {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Something went wrong!!");
        dto.setResolution("ArithmeticException");
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<ExceptionDto> handleArrayIndexOutOfBoundsException() {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Something went wrong!!");
        dto.setResolution("ArrayIndexOutOfBoundsException");
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handelGeneralException(){
        ExceptionDto dto  = new ExceptionDto();
        dto.setMessage("Something went wrong!!");
        dto.setResolution("GeneralException");
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ExceptionDto> handelProductNotFoundException(ProductNotFoundException productNotFoundException){
        ExceptionDto dto  = new ExceptionDto();
        dto.setMessage("Product Not Found Exception");
        dto.setResolution("Invalid product id "+ productNotFoundException.getId() +" passed");
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }

}
