import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {

		double hours;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inform the hours:");
		hours = input.nextDouble();
		
		Employee emp = new Employee();
		emp.setHours(hours);
		emp.setTotalPay();
		System.out.println("Total Pay: " + emp.getTotalPay());

	}

}
