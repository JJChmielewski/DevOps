package com.jjchmielewski.devops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {

    private final DevOpsService devOpsService;

    @Autowired
    public DevOpsController(DevOpsService devOpsService) {
        this.devOpsService = devOpsService;
    }

    @GetMapping("/add/{x1}/{x2}")
    public int add(@PathVariable ("x1") int x1, @PathVariable ("x2") int x2){
        return devOpsService.add(x1,x2);
    }

    @GetMapping("/subtract/{x1}/{x2}")
    public int subtract(@PathVariable ("x1") int x1, @PathVariable ("x2") int x2){
        return devOpsService.subtract(x1,x2);
    }

    @GetMapping("/multiply/{x1}/{x2}")
    public int multiply(@PathVariable ("x1") int x1, @PathVariable ("x2") int x2){
        return devOpsService.multiply(x1,x2);
    }

    @GetMapping("/divide/{x1}/{x2}")
    public double divide(@PathVariable ("x1") double x1, @PathVariable ("x2") double x2){
        return devOpsService.divide(x1,x2);
    }
}
