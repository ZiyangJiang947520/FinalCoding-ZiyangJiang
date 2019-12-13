package app.controller;

import app.StudentCalc;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import pkgLogic.Loan;
import pkgLogic.Payment;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class LoanCalcViewController implements Initializable   {

	private StudentCalc SC = null;
	
	@FXML
	private TextField LoanAmount;
	
	@FXML
	private TextField InterestRate;
	
	@FXML
	private TextField NbrOfYears;
	
	@FXML
	private DatePicker PaymentStartDate;
	
	@FXML
	private TextField AdditionalPayment;
	
	@FXML
	private Label lblTotalPayemnts;
	
	@FXML
	private Label lblTotalInterest;
	
	@FXML
	private Label lblScheduledNumberOfPayments;
	
	@FXML
	private Label lblActualNumberOfPayments;
	
	@FXML
	private Label lblTotalEarlyPayments;

	@FXML
	private TableView<Payment> tvResults;
	
	@FXML
	private TableColumn<Payment, Integer> colPaymentNumber;
	
	@FXML
	private TableColumn<Payment, LocalDate> colPaymentDate;
	
	@FXML
	private TableColumn<Payment, Double> colBalance;
	
	@FXML
	private TableColumn<Payment, Double> colPayment;
	
	@FXML
	private TableColumn<Payment, Double> colAdditionalPayment;
	
	@FXML
	private TableColumn<Payment, Double> colPrinciple;
	
	@FXML
	private TableColumn<Payment, Double> colInterest;
	
	
	
	
	
	
	private ObservableList<Payment> paymentList = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		colPaymentNumber.setCellValueFactory(new PropertyValueFactory<>("PaymentNbr"));
				
		colPaymentDate.setCellValueFactory(new PropertyValueFactory<>("PaymentDate"));
		
		colPayment.setCellValueFactory(new PropertyValueFactory<>("Payment"));
		
		colAdditionalPayment.setCellValueFactory(new PropertyValueFactory<>("AdditionalPayment"));
		
		colInterest.setCellValueFactory(new PropertyValueFactory<>("Interest"));
		
		colPrinciple.setCellValueFactory(new PropertyValueFactory<>("Principle"));
		
		colBalance.setCellValueFactory(new PropertyValueFactory<>("Balance"));		
		
		
		tvResults.setItems(paymentList);
	}

	public void setMainApp(StudentCalc sc) {
		this.SC = sc;
	}
	
	/**
	 * btnCalcLoan - Fire this event when the button clicks
	 * 
	 * @version 1.0
	 * @param event
	 */
	@FXML
	private void btnCalcLoan(ActionEvent event) {
		double balance = 0;
		double principle = 0;
		double totalPayment = 0;
		double totalInterest = 0;
		double interest = 0;
		double totalEarlyPayments = 0;
		//	Examples- how to read data from the form
		double dLoanAmount = Double.parseDouble(LoanAmount.getText());
		
		lblTotalPayemnts.setText("123");
		
		LocalDate localDate = PaymentStartDate.getValue();
		
		double dInterestRate = Double.parseDouble(InterestRate.getText());
		
		int diNbrOfYears = Integer.parseInt(NbrOfYears.getText());
		
		double dAdditionalPayment = Double.parseDouble(AdditionalPayment.getText());
		
		double dpmt = Math.abs(FinanceLib.pmt(dInterestRate, diNbrOfYears * 12, dLoanAmount, 0, false));
		
		Loan loan = new Loan(dLoanAmount, dInterestRate, dpmt, diNbrOfYears, localDate, dAdditionalPayment);
		
		/*
		 * When this button is clicked, you need to do the following:
		 * 
		 * 1) Clear the table
		 * 2) Clear the results fields (Total Payments, Total Interest)
		 * 3) You're going to create 'n' payments based on the data you give.  You'll calculate and
		 * 		carry forward 'balance', because you're going to have to hand calculate that month's
		 * 		interest.
		 * Payment# - you'll set this, counting from 1 to N
		 * Due Date - based on the given date.  method .plusMonths(1) will calculate date + 1 month.
		 * Payment  - Calculate based on PMT function (which is your minimum payment)
		 * Additional Payment - based on Additional Payment given by user
		 * Interest - Calculate based on 
		 */
		tvResults.getItems().clear();
		balance = balance - principle;
		if (balance <= 0) {
			balance = 0;
			dAdditionalPayment = 0;
		}
		else {
		totalPayment = totalPayment + principle;
		totalInterest = totalInterest + interest;
		totalEarlyPayments = totalEarlyPayments + dAdditionalPayment;
		}
		
	}
	
}
