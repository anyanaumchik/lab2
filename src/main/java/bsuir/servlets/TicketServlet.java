package bsuir.servlets;

import bsuir.beans.TicketImpl;
import bsuir.repository.entity.Ticket;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "TemperatureServlet", urlPatterns = "/")
public class TicketServlet extends HttpServlet {

    @EJB
    private TicketImpl ticket = new TicketImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/ticket.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long tNumber = Long.valueOf((req.getParameter("tNumber")));
        Optional<Ticket> ticket = this.ticket.findTicketByNumber(tNumber);
        if (ticket.isPresent()) {
            if (this.ticket.checkWin(String.valueOf(ticket.get().getNumber()))) {
                req.setAttribute("result", "Your are won");
                req.setAttribute("tNumber", ticket.get().getNumber());
                req.setAttribute("resultWin", ticket.get().getWin());
                req.setAttribute("resultChance", ticket.get().isChance() ? "Continue" : "Stop");
            } else {
                req.setAttribute("result", "Your are lose");
                req.setAttribute("tNumber", ticket.get().getNumber());
                req.setAttribute("resultWin", 0);
                req.setAttribute("resultChance", ticket.get().isChance() ? "Continue" : "Stop");
            }
        } else {
            req.setAttribute("result", "Don't find");
            req.setAttribute("tNumber", tNumber);
            req.setAttribute("resultWin", 0);
            req.setAttribute("resultChance", "Don't find");
        }
        req.getRequestDispatcher("/WEB-INF/ticket.jsp").forward(req, resp);
    }
}
