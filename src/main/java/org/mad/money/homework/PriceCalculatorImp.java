package org.mad.money.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PriceCalculatorImp implements IPriceCalculator {
    @Autowired
    private DiscountFunction discountFunction;
    @Autowired
    private TaxFunction taxFunction;
    @Override
    public BigDecimal Calculate(BigDecimal originPrice, BigDecimal discountPercent, BigDecimal rate) {
        BigDecimal discountedPrice = discountFunction.apply(originPrice, discountPercent);
        return taxFunction.apply(discountedPrice,rate);
    }
}
