package com.example.demo.Controllers;

import com.example.demo.Entity.AirTraffic;
import com.example.demo.Repository.DAOAir;
import com.example.demo.Services.AirImpl;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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
        return DAOAir.saveAirTicket(airTraffic);
    }

    @PutMapping("/editTicket/{label}/{info}/{id}")
    public String editTicket(@PathVariable int id, @PathVariable String label,@PathVariable String info)
    {
       DAOAir.updateTicket(label,info,id);
        return "";
    }

    @PutMapping("/editTicket/{label}/{time}/{id}")
    public String editTicket(@PathVariable int id, @PathVariable String label, @PathVariable LocalDateTime time)
    {
       DAOAir.updateTicket(label,time,id);
        return "";
    }

    @PutMapping("/editTicket/{label}/{price}/{id}")
    public String editTicket(@PathVariable int id,@PathVariable Double price, @PathVariable String label)
    {
       DAOAir.updateTicket(label,price,id);
        return "";
    }

    @DeleteMapping("/buy")
    public String delete(@RequestParam int id)
    {
        return DAOAir.deleteTicket(id);
    }

}
