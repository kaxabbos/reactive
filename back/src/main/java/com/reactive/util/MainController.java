package com.reactive.util;

import com.reactive.system.Result;
import com.reactive.system.StatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public Result Main() {
        return new Result(
                true,
                StatusCode.SUCCESS,
                "Server is up!"
        );
    }

}
