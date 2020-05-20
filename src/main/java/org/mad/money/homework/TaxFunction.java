package org.mad.money.homework;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.BiFunction;

@Component
public class TaxFunction implements BiFunction<BigDecimal,BigDecimal,BigDecimal> {
    @Override
    public BigDecimal apply(BigDecimal originPrice, BigDecimal rate) {
        return originPrice.add(originPrice.multiply(rate));
    }
}
