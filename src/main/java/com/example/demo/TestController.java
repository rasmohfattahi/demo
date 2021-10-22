package com.example.demo;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class TestController {

  @GetMapping(value = "/currentUser")
  public String getCurrentUser(Principal user) {
    return "Hello Nahal & Emad";
  }

}
