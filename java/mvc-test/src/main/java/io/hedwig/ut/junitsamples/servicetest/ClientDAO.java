package io.hedwig.ut.junitsamples.servicetest;

import java.math.BigDecimal;

public interface ClientDAO {
    Short getClientType(long clientId);

    void saveBonusHistory(long clientId, BigDecimal bonus);
}
