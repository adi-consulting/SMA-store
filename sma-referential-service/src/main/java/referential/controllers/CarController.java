package referential.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import net.kaczmarzyk.spring.data.jpa.domain.*;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import referential.entities.product.Car;
import referential.entities.product.Product;

import java.net.http.HttpHeaders;
/**
 * test
 */
@CrossOrigin()
@RestController
public class CarController {

    @GetMapping("/getCars")
    @Operation(
            summary = "Get all product ",
            description = "Get all product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Product.class)))})
            }
    )
    public Iterable<Car> getCars(
            @And({
                    @Spec(path = "brand", spec = Like.class),
                    @Spec(path = "model", spec = Like.class),
                    @Spec(path = "kindOfCar", params = "type", spec = Like.class),
                    @Spec(path = "priceAllTaxIncluded", params = "price", spec = Equal.class),
                    @Spec(path = "kilometer", params = "killometerMax", spec = LessThan.class),
                    @Spec(path = "manufacturedDate", params = {"createDateGt", "createDateLt"}, spec = Between.class)
            }) Specification<Car> spec,
            Sort sort,
            @RequestHeader HttpHeaders headers)
    {
        return productService.findAll();
    }
}
