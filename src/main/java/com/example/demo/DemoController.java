
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    @GetMapping("/divide")
    public int sayHello(@RequestParam int by) {
        int divisor = by - 1;
        int dividend = 10;
        int result = dividend/divisor;
        return result;
    }
}
