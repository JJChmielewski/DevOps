package com.jjchmielewski.devops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDevOpsService {

    private DevOpsService devOpsService = new DevOpsService();

    @Test
    public void onePlusOneShouldBeTwo(){

        DevOpsService service = devOpsService;

        Assertions.assertEquals(2, service.add(1,1));

    }


    @Test
    public void oneMinusOneShouldBeZero(){

        DevOpsService service = devOpsService;

        Assertions.assertEquals(0, service.subtract(1,1));

    }

    @Test
    public void oneTimesOneShouldBeOne(){

        DevOpsService service = devOpsService;

        Assertions.assertEquals(1, service.multiply(1,1));

    }

    @Test
    public void oneDividedByOneShouldBeOne(){

        DevOpsService service = devOpsService;

        Assertions.assertEquals(1, service.divide(1,1));

    }
}
