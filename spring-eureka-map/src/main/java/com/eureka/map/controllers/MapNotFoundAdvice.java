package com.eureka.map.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class MapNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(MapNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String mapNotFoundHandler(MapNotFoundException ex) {
    return ex.getMessage();
  }
}