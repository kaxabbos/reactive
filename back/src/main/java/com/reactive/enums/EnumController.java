package com.reactive.enums;

import com.reactive.system.Result;
import com.reactive.system.StatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/enums")
public class EnumController {

    @GetMapping("/roles")
    public Result getRoles() {
        Map<String, String> res = new HashMap<>();
        for (Role i : Role.values()) res.put(i.name(), i.getName());
        return new Result(
                true,
                StatusCode.SUCCESS,
                "Roles",
                res
        );
    }

}
