package model.service;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		amount += (amount * 2 / 100);
		return amount;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		amount += (amount * months / 100);
		
		return amount;
	}

}
