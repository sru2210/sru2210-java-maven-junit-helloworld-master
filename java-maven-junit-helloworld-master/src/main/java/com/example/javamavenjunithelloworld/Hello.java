package com.example.javamavenjunithelloworld;


/**
 * Simple class that says "Hello!".
 */
public class Hello {

public int evaluate(String expression) {
    int sum = 0;
    for (String summand : expression.split("\\+"))
        sum += Integer.valueOf(summand);
    return sum;
}
}
