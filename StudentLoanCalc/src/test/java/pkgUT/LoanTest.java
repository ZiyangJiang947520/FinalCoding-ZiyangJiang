package pkgUT;

import pkgLogic.Loan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class LoanTest {
	
	@Test
	public void test() {
		
		double loanAmount = 5000;
		double interestRate = 0.04;
		double pmt = 425.75;
		int term = 2;
		LocalDate firstPaymentDate = LocalDate.of(2019, 1, 12);
		double additionalPayment = 100;
		
		Loan loan =  new Loan(loanAmount, interestRate, pmt, term, firstPaymentDate, additionalPayment);
			
		assertEquals(loan.getLoanAmount(), loanAmount);
		assertEquals(loan.getInterestRate(), interestRate);
		assertEquals(loan.getPMT(), pmt);
		assertEquals(loan.getTerm(), term);
		assertEquals(loan.getFirstPaymentDate(), firstPaymentDate);
		assertEquals(loan.getAdditionalPayment(), additionalPayment);
	}
}
