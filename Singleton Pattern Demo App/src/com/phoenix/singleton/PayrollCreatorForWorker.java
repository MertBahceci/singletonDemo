package com.phoenix.singleton;

import com.phoenix.abstaction.Payroll;
import com.phoenix.model.PayrollModel;
import com.phoenix.process.PayrollCreator;
import com.phoenix.staff.OfficerPayroll;
import com.phoenix.staff.WorkerPayroll;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */
public class PayrollCreatorForWorker implements PayrollCreator {

    public final static Payroll PAYROLL = new WorkerPayroll();

    private PayrollCreatorForWorker() {
    }

    private static class PayrollCreatorForOfficerHelper{
        private final static PayrollCreatorForWorker PAYROLL_CREATOR_FOR_WORKER = new PayrollCreatorForWorker();
    }

    public static PayrollCreatorForWorker getInstance(){
        return PayrollCreatorForOfficerHelper.PAYROLL_CREATOR_FOR_WORKER;
    }

    @Override
    public void createPayroll(int daysWorkedInAMonth, int degree) {
        PayrollModel payrollModel = PAYROLL.calculatePayroll(daysWorkedInAMonth, degree);
        PAYROLL.showGeneratedPayroll(payrollModel);
    }
}
