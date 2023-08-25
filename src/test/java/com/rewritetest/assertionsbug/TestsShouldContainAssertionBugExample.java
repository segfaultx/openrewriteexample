package com.rewritetest.assertionsbug;

import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestsShouldContainAssertionBugExample {

    @Mock
    ExampleService exampleService;

    @Test
    void testContainingVerifyNoInteractionsInMethod() {
        verifyNoMoreInteractions();
    }

    void verifyNoMoreInteractions() {
        Mockito.verifyNoMoreInteractions(exampleService);
    }

    @Test
    void testContainingVerifyNoMoreInteractionsDirectly() {
        Mockito.verifyNoInteractions(exampleService);
    }

    @Test
    void testVerify() {
        exampleService.testMethod();
        Mockito.verify(exampleService, times(1)).testMethod();
    }

}
