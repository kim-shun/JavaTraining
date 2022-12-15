package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Izakaya {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Customer> customers = new ArrayList<Customer>();

		for (int i = 0; i < n; i++) {
			int age = sc.nextInt();
			if (age < 20) {
				customers.add(new Customer());
			} else {
				customers.add(new Adult());
			}
		}

		for (int i = 0; i < k; i++) {
			int index = sc.nextInt() - 1;
			String s = sc.next();
			int m = sc.nextInt();
			if (s.equals("food")) {
				customers.get(index).takeFood(m);
			} else if (s.equals("softdrink")) {
				customers.get(index).takeSoftDrink(m);
			} else if (s.equals("alcohol")) {
				customers.get(index).takeAlcohol(m);
			}
		}

		for (Customer customer : customers) {
			System.out.println(customer.amount);
		}

	}

}

class Customer {

	int amount;

	Customer() {
		amount = 0;
	}

	void takeFood(int m) {
		amount += m;
	}

	void takeSoftDrink(int m) {
		amount += m;
	}

	void takeAlcohol(int m) {}
}

class Adult extends Customer {

	boolean drunk;

	Adult() {
		super();
		drunk = false;
	}

	void takeFood(int m) {
		if (drunk) {
			m -= 200;
		}
		super.takeFood(m);
	}

	void takeAlcohol(int m) {
		drunk = true;
		amount += m;
	}
}
