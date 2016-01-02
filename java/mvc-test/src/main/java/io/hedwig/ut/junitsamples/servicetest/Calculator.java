package io.hedwig.ut.junitsamples.servicetest;

import java.math.BigDecimal;

/**
 * Created by patrick on 16/1/2.
 */
public interface Calculator {
    BigDecimal calculateBonus(Short clientType,BigDecimal payment);
}
