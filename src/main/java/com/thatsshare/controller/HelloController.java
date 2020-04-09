package com.thatsshare.controller;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thatsshare.model.HelloObject;

@RestController
public class HelloController {
  private AtomicLong counter = new AtomicLong();

  @GetMapping("/hello")
  public HelloObject getHelloWordObject() {
      HelloObject hello = new HelloObject();
      hello.setMessage("Hi there! you are number " + counter.incrementAndGet());
      return hello;
  }
}