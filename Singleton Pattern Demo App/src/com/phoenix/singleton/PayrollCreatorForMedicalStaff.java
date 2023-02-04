package com.phoenix.singleton;

import com.phoenix.abstaction.Payroll;
import com.phoenix.model.PayrollModel;
import com.phoenix.process.PayrollCreator;
import com.phoenix.staff.MedicalStaffPayroll;
import com.phoenix.staff.WorkerPayroll;

/**
 * @author mert on 4.02.2023
 * @project Singleton Pattern Demo App
 */
public class PayrollCreatorForMedicalStaff implements PayrollCreator {

    public final static Payroll PAYROLL = new MedicalStaffPayroll();

    private PayrollCreatorForMedicalStaff() {
    }

    private static class PayrollCreatorForMedicalStaffHelper{
        private final static PayrollCreatorForMedicalStaff PAYROLL_CREATOR_FOR_MEDICAL_STAFF = new PayrollCreatorForMedicalStaff();
    }

    public static PayrollCreatorForMedicalStaff getInstance(){
        return PayrollCreatorForMedicalStaffHelper.PAYROLL_CREATOR_FOR_MEDICAL_STAFF;
    }

    @Override
    public void createPayroll(int daysWorkedInAMonth, int degree) {
        PayrollModel payrollModel = PAYROLL.calculatePayroll(daysWorkedInAMonth, degree);
        PAYROLL.showGeneratedPayroll(payrollModel);
    }
}
