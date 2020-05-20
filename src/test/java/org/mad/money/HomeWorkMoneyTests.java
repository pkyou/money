package org.mad.money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mad.money.homework.IPriceCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class HomeWorkMoneyTests {
    @Autowired
    private IPriceCalculator calculator;

    BigDecimal discountPercent = new BigDecimal("0.2");
    BigDecimal rate = new BigDecimal("0.1");

    @Test
    public void ShouldReturnCorrectFinalPriceWhenTaxOnlyTest(){
        BigDecimal originPrice = new BigDecimal(90);
        BigDecimal expectedPrice = new BigDecimal(99);
        BigDecimal finalPrice = calculator.Calculate(originPrice,discountPercent,rate);
        Assertions.assertEquals(expectedPrice.intValue(),finalPrice.intValue());
    }

    @Test
    public void ShouldReturnCorrectFinalPriceWhenDiscountTest(){
        BigDecimal originPrice = new BigDecimal(100);
        BigDecimal expectedPrice = new BigDecimal(88);
        BigDecimal finalPrice = calculator.Calculate(originPrice,discountPercent,rate);
        Assertions.assertEquals(expectedPrice.intValue(),finalPrice.intValue());
    }
}
