package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class SQRcalculateTest {

    @ParameterizedTest
    @CsvSource(value = {
            "testPositive,200,300,3",
            "testNegativeNumber,-5,1000,22",
            "testNull,0,99,0",
    })
    void shouldCalculate(
            String testName,
            int lowerBound,
            int upperBound,
            int testResult
    ) {
        SQRService service = new SQRService();
        long actual = service.calculate(lowerBound, upperBound);

        assertEquals(testResult, actual);
    }
}