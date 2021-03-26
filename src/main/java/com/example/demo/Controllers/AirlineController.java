package com.example.demo.Controllers;

import com.example.demo.Entity.AirTraffic;
import com.example.demo.Repository.DAOAir;
import com.example.demo.Services.AirImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AirlineController {
    private final AirImpl airImpl;
    private final DAOAir DAOAir;

    public AirlineController(AirImpl airImpl, DAOAir DAOAir)
    {
        this.airImpl = airImpl;
        this.DAOAir = DAOAir;
    }

    @GetMapping("/air")
    public List<AirTraffic>airTrafficList(){return airImpl.flightList();}

    @PostMapping("/addTicket")
    public String addTicket(@RequestBody AirTraffic airTraffic)
    {
        airTraffic.toString();
        return DAOAir.saveAirTicket(airTraffic);
    }

    @PutMapping("/editTicket/{id}")
    public String editTicket(@PathVariable int id)
    {
       // DAOAir.updateTicket(id);
        return "";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id)
    {

        return DAOAir.deleteTicket(id);
    }

}
