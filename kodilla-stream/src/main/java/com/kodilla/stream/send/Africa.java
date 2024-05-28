package com.kodilla.stream.send;

import java.math.BigDecimal;

public final class Africa implements SandStorage{

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sendQuantity = new BigDecimal("99999999901234567890");
        return sendQuantity;
    }


}
