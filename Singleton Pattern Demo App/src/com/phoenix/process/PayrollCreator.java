package com.phoenix.process;

import com.phoenix.abstaction.Payroll;
import com.phoenix.model.PayrollModel;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */
public interface PayrollCreator {

    /*Payroll payroll;

    public PayrollCreator(Payroll payroll) {
        this.payroll = payroll;
    }

    public void createPayroll (int daysWorkedInAMonth, int degree){
        PayrollModel payrollModel = payroll.calculatePayroll(daysWorkedInAMonth, degree);
        payroll.showGeneratedPayroll(payrollModel);
    }*/
    public void createPayroll (int daysWorkedInAMonth, int degree);
}
