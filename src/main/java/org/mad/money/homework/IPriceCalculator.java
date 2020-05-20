package org.mad.money.homework;

import java.math.BigDecimal;

public interface IPriceCalculator {
    BigDecimal Calculate(BigDecimal originPrice,BigDecimal discountPercent,BigDecimal rate);
}
