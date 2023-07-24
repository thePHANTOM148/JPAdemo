package com.jpademo.JPAdemo.Error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorEntity {
    private HttpStatus status;
    private String Msg;
}
