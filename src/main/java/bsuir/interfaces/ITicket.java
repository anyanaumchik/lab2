package bsuir.interfaces;

import bsuir.repository.entity.Ticket;

import javax.ejb.Remote;
import java.util.Optional;

@Remote
public interface ITicket {

    Optional<Ticket> findTicketByNumber(Long tNumber);

    boolean checkWin(String number);
}