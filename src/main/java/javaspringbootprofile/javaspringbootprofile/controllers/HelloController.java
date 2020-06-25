package javaspringbootprofile.javaspringbootprofile.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @Value("${hello}")
    private String message;

    @GetMapping("/")
    public ResponseEntity<? > hello(){
      return new ResponseEntity<>("Hello Word : " + message, HttpStatus.OK);
    }
}
