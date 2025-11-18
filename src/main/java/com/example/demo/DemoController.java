
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    @GetMapping("/divide")
    public int sayHello(@RequestParam int by) {
        int dividend = by - 1;
        int result = 10/dividend;
        return result;
    }
}
