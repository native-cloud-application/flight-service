package agh.edu.pl;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class FlightService {


    private Random random = new Random();

    public FlightDetails find(String from, String to) {

        FlightDetails flightDetails = new FlightDetails();
        flightDetails.setFrom(from);
        flightDetails.setTo(to);

        LocalDate localDate = LocalDate.now();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(5000) + random.nextDouble());

        flightDetails.setFromDate(localDate.plusDays(random.nextInt(5)));
        flightDetails.setToDate(localDate.plusDays(random.nextInt(10) + 5));
        flightDetails.setPriceInEuro(price);

        return flightDetails;

    }


}
