package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    List<Car> listOfCars = new ArrayList<>(Arrays.asList(
            new Car("Mersedes", 5_000_000, 2007),
            new Car("BMW", 6_000_000, 2014),
            new Car("Volvo", 2_000_000, 2008),
            new Car("Mitsubisi", 2_300_000, 2015),
            new Car("Renault", 1_500_000, 2005)));


    @Override
    public List<Car> getOfCars(int count) {
        if (count < 5 && count > 0) return listOfCars;
        return listOfCars.stream().limit(count).collect(Collectors.toList());
    }
}
