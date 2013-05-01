package es.uniovi.asw.entrecine6.tpv.model;

public class CashSale extends AbstractSale {

	public CashSale(Long id, int numberOfSeats, Session session) {
		this.id = id;
		this.numberOfSeats = numberOfSeats;
		this.session = session;
	}

	@Override
	public String getPaymentInfo() {
		return "Cash";
	}

}