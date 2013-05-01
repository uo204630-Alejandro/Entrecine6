package es.uniovi.asw.entrecine6.central.persistence.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import es.uniovi.asw.entrecine6.central.model.Sale;
import es.uniovi.asw.entrecine6.central.model.Ticket;
import es.uniovi.asw.entrecine6.central.persistence.exception.DuplicatedTicketException;
import es.uniovi.asw.entrecine6.central.persistence.exception.SessionFullException;

public interface SaleDao {

	void setConnection(Connection con);

	void saveTicket(Ticket ticket) throws SQLException, DuplicatedTicketException;

	Ticket findTicketByCode(String ticketCode);

	void saveSale(Sale sale);

	List<Sale> findAll();

	Long getLastSaleId();

	void saveSeats(Sale encodedSale, int numberOfSeats) throws SessionFullException;
	
	int[] getSeats(Sale sale);
	
}