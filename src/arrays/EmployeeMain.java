package arrays;

class Employee {
	private String name;
	private String email;
	private String empID;

	public Employee(String name, String email, String empID) {
		super();
		this.name = name;
		this.email = email;
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getEmpID() {
		return empID;
	}

}

class Details {
	Employee[] employee;

	public Details(int size) {// 5
		employee = new Employee[size];
	}

	public void insertData(int index, Employee emp) { // = new Employee("Abc", "abc@", "tc142");
		try {

			if (employee[index] == null) {
				employee[index] = emp;
				System.out.println("The employee name: " + emp.getName() + " is added");
			} else {
				System.out.println("The cell is already filled");
			}

		} catch (Exception e) {
			System.out.println("Invalid index");
		}
	}

	public void traverse() {
		for (int i = 0; i < employee.length; i++) {
			if (employee[i] != null) {
				System.out.println(employee[i].getName());
			}
		}
	}

	public void searchByName(String searchName) {
		for (int i = 0; i < employee.length; i++) {
			if (employee[i] != null && employee[i].getName().equalsIgnoreCase(searchName)) {
				System.out.println("The employee name is present");
				return;
			}
		}
		System.out.println("The employee name is not present");
	}

}

public class EmployeeMain {
	public static void main(String[] args) {
		Details dt = new Details(5);
		dt.insertData(0, new Employee("Abc", "abc@", "tc142"));
		dt.insertData(1, new Employee("Abc1", "abc@", "tc142"));
		dt.insertData(2, new Employee("Abc", "abc@", "tc142"));
		dt.insertData(5, new Employee("Abc1", "abc@", "tc142"));

		dt.traverse();
		dt.searchByName("abc1");

	}
}

//program of any class type in a array