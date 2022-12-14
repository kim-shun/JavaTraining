package example;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int inputTimes = sc.nextInt();
        ArrayList<Employee> employee = new ArrayList<Employee>();
        for (int i = 0; i < inputTimes; i++) {
        	String input = sc.next();
        	if (input.equals("make")) {
        		int num = sc.nextInt();
        		String name = sc.next();
        		employee.add(new Employee(num, name));
        	} else if (input.equals("getnum")) {
        		int num = sc.nextInt();
        		System.out.println(employee.get(num-1).getNum());
        	} else if (input.equals("getname")) {
        		int num = sc.nextInt();
        		System.out.println(employee.get(num-1).getName());
        	} else if (input.equals("change_num")) {
        		int num = sc.nextInt();
        		int changeNum = sc.nextInt();
        		employee.get(num-1).changeNum(changeNum);
        	} else if (input.equals("change_name")) {
        		int num = sc.nextInt();
        		String changeName = sc.next();
        		employee.get(num-1).changeName(changeName);
        	}
        }

	}

}

class Employee {
	int number;
	String name;

	Employee(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	int getNum() {
		return number;
	}
	
	String getName() {
		return name;
	}
	
	void changeNum(int number) {
		this.number = number;
	}
	
	void changeName(String name) {
		this.name = name;
	}
}
