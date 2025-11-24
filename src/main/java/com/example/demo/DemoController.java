
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    @GetMapping("/divide-ten")
    public int sayHello(@RequestParam int by) {
        try {
            int divisor = by - 1;
            int dividend = 10;
            int result = dividend/divisor;
            return result;
        } catch (Exception e) {
            // Catch any exception and throw a new one
            throw new RuntimeException("A very ambiguous exception", e);
        }

    }
}
