
package com.mycompany.practiceexam2024_13_11_2026_question2;


class MovieTicketData {
    
    private String movieName;
    private int numberOfTickets;
    private double ticketPrice;

    public String getMovieName() {
        return movieName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTicketSales() {
        return ticketPrice;
    }
    
        public MovieTicketData(String movieName, int numberOfTickets, double ticketSales) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketSales;
    }
    

    
}
