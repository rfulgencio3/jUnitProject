package tddProject.service;

import tddProject.model.Employee;
import tddProject.model.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {

    public void grantReadjustment(Employee employee, Performance performance){
        if (performance == Performance.TO_BE_DESIRED) {
            BigDecimal readjustment = employee.getSalary().multiply((new BigDecimal("0.03")));
            employee.readjustSalary(readjustment);
        } else if (performance == performance.GOOD) {
            BigDecimal readjustment = employee.getSalary().multiply(new BigDecimal("0.15"));
            employee.readjustSalary(readjustment);
        } else if (performance == performance.EXCELLENT) {
            BigDecimal readjustment = employee.getSalary().multiply(new BigDecimal("0.30"));
            employee.readjustSalary(readjustment);
        } else
            employee.readjustSalary(new BigDecimal("0.00"));
    }
}
