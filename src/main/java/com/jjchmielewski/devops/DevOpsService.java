package com.jjchmielewski.devops;

import org.springframework.stereotype.Service;

@Service
public class DevOpsService {

    public int add(int x1, int x2){
        return x1+x2;
    }

    public int subtract(int x1, int x2){
        return x1-x2;
    }

    public int multiply(int x1, int x2){
        return x1*x2;
    }

    public double divide(double x1, double x2){
        return x1/x2;
    }
}
