package pkgLogic;

import java.time.LocalDate;

public class Loan {
	
	private double LoanAmount;
	private double InterestRate;
	private double PMT;
	private int Term;
	private LocalDate FirstPaymentDate;
	private double AddtionalPayment;
	
	
	
	public Loan(double loanAmount, double interestRate, double pmt, int term, LocalDate firstPaymentDate, double addtionalPayment) {
		super();
		LoanAmount = loanAmount;
		InterestRate = interestRate;
		PMT= pmt;
		Term = term;
		FirstPaymentDate = firstPaymentDate;
		AddtionalPayment = addtionalPayment;
	}
	
	
	public double getLoanAmount() {
		return LoanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}
	
	public double getInterestRate() {
		return InterestRate;
	}
	
	public void seInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	
	public double getPMT() {
		return PMT;
	}
	
	public void setPMT(double pmt) {
		PMT = pmt;
	}
	
	public int getTerm() {
		return Term;
	}
	
	public void setTerm(int term) {
		Term = term;
	}
	
	public LocalDate getFirstPaymentDate() {
		return FirstPaymentDate;
	}
	
	public void setFirstPaymentDate(LocalDate firstPaymentDate) {
		FirstPaymentDate = firstPaymentDate;
	}
	
	public double getAdditionalPayment() {
		return AddtionalPayment;
	}
	
	public void setAdditionalPayment(double addtionalPayment) {
		AddtionalPayment = addtionalPayment;
	}

}
