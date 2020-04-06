package bsuir.beans;

import bsuir.interfaces.ITicket;
import bsuir.repository.TicketRepository;
import bsuir.repository.entity.Ticket;

import javax.ejb.Stateful;
import java.util.Optional;

@Stateful
public class TicketImpl implements ITicket {

    TicketRepository ticketRepository = new TicketRepository();

    public Optional<Ticket> findTicketByNumber(Long tNumber) {
        return ticketRepository.findTicketByNumber(tNumber);
    }

    public boolean checkWin(String number) {
        String firstThreeChars = number.substring(1, 3);
        String endThreeChars = number.substring(6, 8);
        return firstThreeChars.equals(endThreeChars);

    }


}
