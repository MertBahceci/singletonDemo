package com.phoenix.staff;

import com.phoenix.abstaction.Payroll;
import com.phoenix.model.PayrollModel;
import com.phoenix.constants.StaffConstants;

import java.math.BigDecimal;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */

public class OfficerPayroll implements Payroll {

    @Override
    public PayrollModel calculatePayroll(int daysWorkedInAMonth, int degree) {
        BigDecimal payroll = BigDecimal.valueOf(Long.parseLong(String.valueOf(daysWorkedInAMonth)))
                .multiply(BigDecimal.valueOf(Long.parseLong(String.valueOf(degree))))
                .multiply(StaffConstants.officerConstant)
                .multiply(StaffConstants.baseStaffSalary);
        return new PayrollModel(daysWorkedInAMonth,degree,payroll);
    }

    @Override
    public void showGeneratedPayroll(PayrollModel payrollModel) {
        System.out.println("Payroll of " + payrollModel.getDaysWorkedInAMonth() + " days worked officer from " + payrollModel.getDegree() + ". degree amount is : " + payrollModel.getAmount());
    }

}
