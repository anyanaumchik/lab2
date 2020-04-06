package bsuir.repository;

import bsuir.repository.entity.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketRepository {
    private List<Ticket> tickets;

    public TicketRepository() {
        this.tickets = new ArrayList<>();
        tickets.add(new Ticket(12322123L, 1_200_000));
        tickets.add(new Ticket(13322133L, 1_100_000));
        tickets.add(new Ticket(14322143L, 1_000_000, true));
        tickets.add(new Ticket(15322153L, 1_000_000, true));
        tickets.add(new Ticket(16322163L, 1_000_000, true));
        tickets.add(new Ticket(17322173L, 1_000_000));
        tickets.add(new Ticket(18322183L, 1_000));
        tickets.add(new Ticket(10022183L, 1_000));
        tickets.add(new Ticket(10822183L, 1_000));
        tickets.add(new Ticket(12322183L, 1_000));
        tickets.add(new Ticket(10022183L, 1_000));
        tickets.add(new Ticket(15522183L, 1_000));
        tickets.add(new Ticket(19922183L, 1_000));
        tickets.add(new Ticket(19322193L, 1_000));
        tickets.add(new Ticket(10322103L, 1_111_000));
        tickets.add(new Ticket(13422134L, 1_122_000));
        tickets.add(new Ticket(14522145L, 1_900_000, true));
        tickets.add(new Ticket(15622156L, 1_800_000, true));
        tickets.add(new Ticket(16722167L, 1_700_000));
        tickets.add(new Ticket(17822178L, 1_600_000));
        tickets.add(new Ticket(18922189L, 1_500_000));
    }

    public Optional<Ticket> findTicketByNumber(Long tNumber) {
        Optional<Ticket> ticket = tickets.stream()
                .filter(a -> a.getNumber().equals(tNumber))
                .findAny();

        return ticket;
    }
}
