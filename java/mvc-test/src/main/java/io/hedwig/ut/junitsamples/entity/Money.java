package io.hedwig.ut.junitsamples.entity;

/**
 * Created by patrick on 16/1/2.
 */
public class Money {

    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        if (amount < 0)
            throw new IllegalArgumentException("Money should be greater than 0 but your input is " + amount);
        if (currency == null || currency.isEmpty()) {
            throw new IllegalArgumentException("illegal currency: [" + currency + "]");
        }
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Money add(Money b) {
        return new Money(this.amount + b.getAmount(), this.getCurrency());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != money.amount) return false;
        return !(currency != null ? !currency.equals(money.currency) : money.currency != null);

    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
