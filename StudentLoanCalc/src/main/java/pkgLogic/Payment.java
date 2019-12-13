package pkgLogic;
import java.time.LocalDate;

public class Payment {
	
	private int PaymentNbr;
	private LocalDate DueDate;
	private double Payment;
	private double AdditionalPayment;
	private double Interest;
	private double Principle;
	private double Balance;

	
	public Payment(int paymentNbr, LocalDate dueDate, double payment, double additionalPayment, double interest, double principle, double balance){
		super();
		PaymentNbr = paymentNbr;
		DueDate = dueDate;
		Payment = payment;
		AdditionalPayment = additionalPayment;
		Interest = interest;
		Principle = principle;
		Balance = balance;
	}

	public int getPaymentNbr() {
		return PaymentNbr;
	}

	public void setPaymentNbr(int paymentNbr) {
		PaymentNbr = paymentNbr;
	}

	public LocalDate getDueDate() {
		return DueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		DueDate = dueDate;
	}

	public double getPayment() {
		return Payment;
	}

	public void setPayment(double payment) {
		Payment = payment;
	}

	public double getAdditionalPayment() {
		return AdditionalPayment;
	}

	public void setAddPay(double additionalPayment) {
		AdditionalPayment = additionalPayment;
	}

	public double getInterest() {
		return Interest;
	}

	public void setInterest(double interest) {
		Interest = interest;
	}

	public double getPrinciple() {
		return Principle;
	}

	public void setPrinciple(double principle) {
		Principle = principle;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	
}
