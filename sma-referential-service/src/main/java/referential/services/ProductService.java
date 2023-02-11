package referential.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import referential.dao.product.CarRepository;
import referential.entities.product.Car;
import referential.entities.product.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private CarRepository carRepository;

    public Product findById(Long id){
        return carRepository.findById(id).get();
    }

    public Iterable<Car> findAll(){
        return carRepository.findAll();
    }



    public void addProduct(Car car){
        carRepository.save(car);
    }
}
