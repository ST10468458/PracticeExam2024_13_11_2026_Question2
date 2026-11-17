
package com.mycompany.practiceexam2024_13_11_2026_question2;


public class MovieTickets implements IMovieTickets{
    public static final double VAT_RATE = 0.14;

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double subtotal = numberOfTickets * ticketPrice;
        return subtotal + (subtotal * VAT_RATE);
    
    }

    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        if (movieTicketData.getMovieName().trim().isEmpty()) {
            return false;
        }
        
        if (movieTicketData.getTicketSales() <= 0) {
            return false;
        }
        
        if (movieTicketData.getNumberOfTickets() <= 0) {
            return false;
        }
        return true;
    
    }
    
}
