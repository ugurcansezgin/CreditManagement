package CreditManagement;

import CreditManagement.business.CarCreditManager;
import CreditManagement.business.CustomerManager;
import CreditManagement.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();

	}

}
