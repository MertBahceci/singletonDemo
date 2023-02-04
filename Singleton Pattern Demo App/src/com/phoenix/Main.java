package com.phoenix;

import com.phoenix.process.PayrollCreator;
import com.phoenix.singleton.PayrollCreatorForMedicalStaff;
import com.phoenix.singleton.PayrollCreatorForOfficer;
import com.phoenix.singleton.PayrollCreatorForWorker;

public class Main {

    public static void main(String[] args) {

        /*PayrollCreator payrollCreatorOfficer = new PayrollCreator(new Officer());
        PayrollCreator payrollCreatorWorker = new PayrollCreator(new Worker());
        PayrollCreator payrollCreatorMedicalStaff = new PayrollCreator(new MedicalStaff());

        payrollCreatorOfficer.createPayroll(30,3);
        payrollCreatorWorker.createPayroll(30,3);
        payrollCreatorMedicalStaff.createPayroll(30,3);*/

        PayrollCreator payrollCreatorForOfficer = PayrollCreatorForOfficer.getInstance();
        payrollCreatorForOfficer.createPayroll(30,3);

        PayrollCreator payrollCreatorForWorker = PayrollCreatorForWorker.getInstance();
        payrollCreatorForWorker.createPayroll(30,3);

        PayrollCreator payrollCreatorForMedicalStaff = PayrollCreatorForMedicalStaff.getInstance();
        payrollCreatorForMedicalStaff.createPayroll(30,3);

        PayrollCreator payrollCreatorForOfficer2 = PayrollCreatorForOfficer.getInstance();
        payrollCreatorForOfficer2.createPayroll(10,3);

        PayrollCreator payrollCreatorForWorker2 = PayrollCreatorForWorker.getInstance();
        payrollCreatorForWorker2.createPayroll(10,3);

        PayrollCreator payrollCreatorForMedicalStaff2 = PayrollCreatorForMedicalStaff.getInstance();
        payrollCreatorForMedicalStaff2.createPayroll(10,3);
    }
}
