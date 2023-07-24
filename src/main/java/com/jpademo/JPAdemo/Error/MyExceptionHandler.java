package com.jpademo.JPAdemo.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
@ExceptionHandler(EmailShouldUniqException.class)
   public ResponseEntity<ErrorEntity> EmailAlreadyExsist(EmailShouldUniqException E, WebRequest R){
        ErrorEntity Error= new ErrorEntity(HttpStatus.BAD_REQUEST,E.getMessage());
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Error);
   }
}