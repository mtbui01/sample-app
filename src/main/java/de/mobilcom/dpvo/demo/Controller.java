package de.mobilcom.dpvo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dpvo/calc")
public class Controller {

  @GetMapping("/fibonacci/{number}")
  public ApiRespone calcFib(@PathVariable int number) {
    return new ApiRespone(Long.toString(Calculator.fibonaci(number)));
  }
}
