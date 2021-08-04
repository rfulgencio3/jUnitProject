package service;

import tddProject.model.Employee;
import tddProject.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {

    @Test
    void bonusMustBeZeroToEmployeeWithHighSalary(){
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class,
                () -> service.calculateBonus(new Employee("Ricardo", LocalDate.now(),new BigDecimal("25000")))
        );
    }

    @Test
    void bonusMustBeTenPercentOffEmployeeSalary(){
        BonusService service = new BonusService();
        BigDecimal raise = service.calculateBonus(new Employee("Ricardo", LocalDate.now(),new BigDecimal("9000")));

        assertEquals(new BigDecimal("900.00"), raise);
    }

    @Test
    void bonusMustBeTenPercentOffTheEmployeeWithTenThousandSalary(){
        BonusService service = new BonusService();
        BigDecimal raise = service.calculateBonus(new Employee("Ricardo", LocalDate.now(),new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), raise);
    }

}
