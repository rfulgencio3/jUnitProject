package tddProject.service;

import tddProject.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

	public BigDecimal calculateBonus(Employee employee) {
		BigDecimal raise = employee.getSalary().multiply(new BigDecimal("0.1"));
		if (raise.compareTo(new BigDecimal("1000")) > 0) {
			raise = BigDecimal.ZERO;
		}
		return raise.setScale(2, RoundingMode.HALF_UP);
	}

}
