package com.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloLambdaTest {

    @Test
    public void shouldReturnHelloMessage() {
        var sut = new HelloLambda();
        assertEquals("Hello from Lambda!", sut.handleRequest());
    }
}