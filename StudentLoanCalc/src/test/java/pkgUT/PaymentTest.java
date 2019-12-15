package pkgUT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import pkgLogic.Payment;

public class PaymentTest {
	
	@Test
	public void test() {
		
		int paymentNbr = 1;
		double principle = 509.08;
		double interest = 0.04;
		double scheduledPayment = 425.75;
		double balance = 4490.92;
		LocalDate paymentStartDate = LocalDate.of(2019, 12, 12);
		double dAdditionalPayment = 100;
		
		Payment payment =  new Payment(paymentNbr, paymentStartDate, scheduledPayment, dAdditionalPayment, interest, principle, balance);
					
		assertEquals(payment.getPaymentNbr(), paymentNbr);
		assertEquals(payment.getDueDate(), paymentStartDate);
		assertEquals(payment.getPayment(), scheduledPayment);
		assertEquals(payment.getAdditionalPayment(), dAdditionalPayment);
		assertEquals(payment.getInterest(), interest);
		assertEquals(payment.getPrinciple(), principle);
		assertEquals(payment.getBalance(), balance);
	}
}
