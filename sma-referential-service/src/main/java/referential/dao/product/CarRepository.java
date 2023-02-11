package referential.dao.product;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import referential.entities.product.Car;


public interface CarRepository extends PagingAndSortingRepository<Car, Long> , JpaSpecificationExecutor<Car> {

}
