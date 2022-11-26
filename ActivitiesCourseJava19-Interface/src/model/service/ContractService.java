package model.service;

import java.util.Calendar;
import java.util.Date;

import entitties.Contract;
import entitties.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}



	public void processContract(Contract contract, Integer months) {
		Date date;
		Double amount, amountFinal;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getDate());
		
			for(int contador = 1; contador <= months; contador++) {
				calendar.add(Calendar.MONTH, 1);
				date = calendar.getTime();
				amount = paymentService.interest(contract.getTotalValue() / months, contador);
				amountFinal = paymentService.paymentFee(amount);
				
				contract.getInstallment().add(new Installment(date, amountFinal));
			}
	}

}
