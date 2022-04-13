import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() {
		
		Employee emp1 = new Employee();
		
		emp1.setHours(41);
		emp1.setTotalPay();
		assertEquals(616.5, emp1.getTotalPay());
		
		Employee emp2 = new Employee();
		
		emp2.setHours(40);
		emp2.setTotalPay();
		assertEquals(600, emp2.getTotalPay());
		
		Employee emp3 = new Employee();
		
		emp3.setHours(39.5);
		emp3.setTotalPay();
		assertEquals(592.5, emp3.getTotalPay());
		
		Employee emp4 = new Employee();
		
		emp4.setHours(40.5);
		emp4.setTotalPay();
		assertEquals(608.25, emp4.getTotalPay());
		
		
	}

}
