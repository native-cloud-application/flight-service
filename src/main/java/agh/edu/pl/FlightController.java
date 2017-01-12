package agh.edu.pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {


    @Autowired
    private FlightService flightService;

    @RequestMapping(value = "/find/{from}/{to}", method = RequestMethod.GET)
    public FlightDetails find(@PathVariable String from,@PathVariable String to) {
        return flightService.find(from, to);
    }


}
