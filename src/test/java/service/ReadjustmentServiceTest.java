package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddProject.model.Employee;
import tddProject.model.Performance;
import tddProject.service.ReadjustmentService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    private ReadjustmentService readjustmentService;
    private Employee employee;

    @BeforeEach
    public void startTestParams() {
        this.readjustmentService = new ReadjustmentService();
        this.employee = new Employee("Ana", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    public void readjustmentMustBeThreePercentWhenPerformanceEqualsToBeDesired() {
        readjustmentService.grantReadjustment(employee, Performance.TO_BE_DESIRED);
        assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

    @Test
    public void readjustmentMustBeThreePercentWhenPerformanceEqualsToGood() {
        readjustmentService.grantReadjustment(employee, Performance.GOOD);
        assertEquals(new BigDecimal("1150.00"), employee.getSalary());
    }

    @Test
    public void readjustmentMustBeThreePercentWhenPerformanceEqualsToExcellent() {
        readjustmentService.grantReadjustment(employee, Performance.EXCELLENT);
        assertEquals(new BigDecimal("1200.00"), employee.getSalary());
    }
}
