package CreditManagement.business;

import CreditManagement.entities.Customer;

public class CustomerManager {
	
	private Customer customer;
	private CreditManager creditManager;
	
	public CustomerManager(Customer customer, CreditManager creditManager) {
		
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri kaydedildi.");
	}
	
	public void delete() {
		System.out.println("Müşteri silindi.");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi.");
		creditManager.save();
	}

}
