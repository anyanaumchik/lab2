package bsuir.repository.entity;

import java.util.Objects;

public class Ticket {

    private Long number;
    private Integer win;
    private boolean chance;

    public Ticket(Long number, Integer win) {
        this.number = number;
        this.win = win;
    }

    public Ticket(Long number, Integer win, boolean chance) {
        this.number = number;
        this.win = win;
        this.chance = chance;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public boolean isChance() {
        return chance;
    }

    public void setChance(boolean chance) {
        this.chance = chance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return chance == ticket.chance &&
                number.equals(ticket.number) &&
                win.equals(ticket.win);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, win, chance);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", win=" + win +
                ", chance=" + chance +
                '}';
    }
}
