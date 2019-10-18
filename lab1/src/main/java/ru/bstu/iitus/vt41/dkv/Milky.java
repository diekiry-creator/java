package ru.bstu.iitus.vt41.dkv;

import java.util.Calendar;

public abstract class Milky extends Product {
    protected Calendar eatDate;

    public Calendar getEatDate() {
        return eatDate;
    }

    public boolean canBuyByDate(Calendar date) {
        return eatDate.compareTo(date) >= 0;
    }
}
