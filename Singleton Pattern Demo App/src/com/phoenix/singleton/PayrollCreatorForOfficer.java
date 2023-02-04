package com.phoenix.singleton;

import com.phoenix.abstaction.Payroll;
import com.phoenix.model.PayrollModel;
import com.phoenix.process.PayrollCreator;
import com.phoenix.staff.OfficerPayroll;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */
public class PayrollCreatorForOfficer implements PayrollCreator {

    public final static Payroll PAYROLL = new OfficerPayroll();

    private PayrollCreatorForOfficer() {
    }

    private static class PayrollCreatorForOfficerHelper{
        private final static PayrollCreatorForOfficer PAYROLL_CREATOR_FOR_OFFICER = new PayrollCreatorForOfficer();
    }

    public static PayrollCreatorForOfficer getInstance(){
        return PayrollCreatorForOfficerHelper.PAYROLL_CREATOR_FOR_OFFICER;
    }

    @Override
    public void createPayroll(int daysWorkedInAMonth, int degree) {
        PayrollModel payrollModel = PAYROLL.calculatePayroll(daysWorkedInAMonth, degree);
        PAYROLL.showGeneratedPayroll(payrollModel);
    }
}
