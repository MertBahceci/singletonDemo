package com.phoenix.model;

import java.math.BigDecimal;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */
public class PayrollModel {

    private Integer daysWorkedInAMonth;

    private Integer degree;

    private BigDecimal amount;

    public PayrollModel(Integer daysWorkedInAMonth, Integer degree, BigDecimal amount) {
        this.daysWorkedInAMonth = daysWorkedInAMonth;
        this.degree = degree;
        this.amount = amount;
    }

    public Integer getDaysWorkedInAMonth() {
        return daysWorkedInAMonth;
    }

    public void setDaysWorkedInAMonth(Integer daysWorkedInAMonth) {
        this.daysWorkedInAMonth = daysWorkedInAMonth;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
