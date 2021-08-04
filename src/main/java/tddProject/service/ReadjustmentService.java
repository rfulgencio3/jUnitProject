package tddProject.service;

import tddProject.model.Employee;
import tddProject.model.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {

    public void grantReadjustment(Employee employee, Performance performance){
            BigDecimal percentage = performance.readjustmentPercentage();
            BigDecimal readjustment = employee.getSalary().multiply(percentage);
            employee.readjustSalary(readjustment);
    }
}
