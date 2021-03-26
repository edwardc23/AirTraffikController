package com.example.demo.Repository;


import com.example.demo.Entity.AirTraffic;

import java.time.LocalDateTime;
import java.util.List;

public interface DAOAir {
    String saveAirTicket(AirTraffic ticket);
    List<AirTraffic> flightList();
    AirTraffic findTicket(int id);
    String deleteTicket(int id);
    String updateTicket(String label,String info, int id);
    String updateTicket(String label, LocalDateTime time, int id);
    String updateTicket(String label, Double price, int id);

}
