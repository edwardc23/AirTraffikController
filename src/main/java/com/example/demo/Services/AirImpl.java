package com.example.demo.Services;


import com.example.demo.Entity.AirTraffic;
import com.example.demo.Repository.DAOAir;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AirImpl implements DAOAir {

    private EntityManager entityManager;
    @Autowired
    public AirImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public String saveAirTicket(AirTraffic ticket)
    {
        Session current = entityManager.unwrap(Session.class);
        current.save(ticket);

        System.out.println(ticket.toString());
        return "done";
    }

    @Transactional
    public List<AirTraffic> flightList(){
        Session current = entityManager.unwrap(Session.class);
        Query<AirTraffic> myQuery = current.createQuery("from AirTraffic ");
        List<AirTraffic> flights = myQuery.list();
        for (int i= 0;i<flights.size();i++) {
            flights.get(i).setTicketID(i+1);
            System.out.println(flights.get(i));
        }
        return flights;
    }

    @Override
    public AirTraffic findTicket(int id) {
        Session current = entityManager.unwrap(Session.class);
        AirTraffic ticket= current.get(AirTraffic.class,id);
        return ticket;
    }

    @Override
    public String deleteTicket(int id) {
        Session current = entityManager.unwrap(Session.class);
        Transaction transaction = current.beginTransaction();
        AirTraffic ticket = findTicket(id);
        if(ticket!=null){
            current.delete(ticket);
            transaction.commit();

             return "Deleted Ticket "+ticket.getTicketID();
        }
        return "Id not found";
    }

    @Override
    public String updateTicket(String label, String info, int id) {
        Session current = entityManager.unwrap(Session.class);
        Transaction transaction = current.beginTransaction();
        switch (label){
            case "location":
                current.get(AirTraffic.class,id).setLocation(info);
                transaction.commit();
                return "Location updated ";
            case "destination":
                current.get(AirTraffic.class,id).setDestination(info);
                transaction.commit();
                return "Destination updated ";


        }
        return null;
    }
    @Override
    public String updateTicket(String label, LocalDateTime info, int id) {
        Session current = entityManager.unwrap(Session.class);
        Transaction transaction = current.beginTransaction();
        switch (label){

            case "depart":
                current.get(AirTraffic.class,id).setDepart(info);
                transaction.commit();
                return "Departure time updated ";
            case "arrival":
                current.get(AirTraffic.class,id).setArrival(info);
                transaction.commit();
                return "Arrival time updated ";


        }
        return null;
    }
    @Override
    public String updateTicket(String label, Double info, int id) {
        Session current = entityManager.unwrap(Session.class);
        Transaction transaction = current.beginTransaction();


                current.get(AirTraffic.class,id).setPrice(info);
                transaction.commit();
                return "Price updated ";



    }



}
