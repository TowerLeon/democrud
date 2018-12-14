/**
 * FileName: HelloWorldController
 * Author:   Lenovo
 * Date:     12/14/2018 5:14 PM
 * Description:
 * History:
 */
package com.example.democrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
