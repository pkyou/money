package org.mad.money.homework;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.BiFunction;

@Component
public class DiscountFunction implements BiFunction<BigDecimal,BigDecimal,BigDecimal> {
    private BigDecimal threshold = new BigDecimal(100);
    @Override
    public BigDecimal apply(BigDecimal originPrice, BigDecimal discountPercent) {
        if (originPrice.compareTo(threshold) == -1){
            return originPrice;
        }

        return originPrice.add(originPrice.multiply(discountPercent).negate());
    }
}
