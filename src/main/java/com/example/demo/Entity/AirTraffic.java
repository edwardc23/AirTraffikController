package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table( name = "Ticket")
public class AirTraffic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ticket_id")
    private int ticketID;

    @Column(name="departure_location")
    private String location;

    @Column(name="destination")
    private String destination;


    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    @Column(name="departure_time")
    private LocalDateTime depart;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    @Column(name="arrival_time")
    private LocalDateTime arrival;

    @Column(name="price")
    private String price;

    public AirTraffic(String location, String destination, LocalDateTime depart,
                      LocalDateTime arrival, String price) {
        this.location = location;
        this.destination = destination;
        this.depart = depart;
        this.arrival = arrival;
        this.price = price;
    }

    public AirTraffic() {
    }

    public void setTicketID(int id){this.ticketID=id;}

    public int getTicketID() {
        return ticketID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepart() {
        return depart;
    }

    public void setDepart(LocalDateTime depart) {
        this.depart = depart;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AirTraffic{" +
                "ticketID=" + ticketID +
                ", location='" + location + '\'' +
                ", destination='" + destination + '\'' +
                ", depart='" + depart + '\'' +
                ", arrival='" + arrival + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
