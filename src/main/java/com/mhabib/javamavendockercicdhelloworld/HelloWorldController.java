package com.mhabib.javamavendockercicdhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

 @GetMapping("/hello")
 public String sayHello(){
  return "Hello I am alive here";
 }
}
