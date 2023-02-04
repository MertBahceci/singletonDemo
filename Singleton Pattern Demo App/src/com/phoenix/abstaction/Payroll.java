package com.phoenix.abstaction;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */

import com.phoenix.model.PayrollModel;

/**
 * This is an interface contains only a monthly payroll calculation method which will be implemented differently by any kind of newly added worker type.
 */
public interface Payroll {
    PayrollModel calculatePayroll(int daysWorkedInAMonth, int degree);

    void showGeneratedPayroll(PayrollModel payrollModel);

}
