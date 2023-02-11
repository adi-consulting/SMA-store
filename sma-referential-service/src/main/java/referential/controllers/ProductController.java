package referential.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import referential.entities.product.Car;
import referential.entities.product.Product;
import referential.services.ProductService;

@CrossOrigin()
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getAllProduct")
    @Operation(
            summary = "Get all product ",
            description = "Get all product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Product.class)))})
            }
    )
    public Iterable<Car> getAllProduct()
    {
        return productService.findAll();
    }

    /*@GetMapping("/getProductByType/{type}")
    @Operation(
            summary = "Get all product ",
            description = "Get all product",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Product.class)))})
            }
    )
    public Iterable<Product> getProductByType(@PathVariable String type)
    {
        return productService.findAllByProductType(type);
    }*/

    @PostMapping("/addProduct")
    @Operation(
            summary = "add product",
            description = "Add product",
            responses = {
                    @ApiResponse(responseCode = "204", description = "The product is added successfully.")
            }
    )
    public void addProduct(@RequestBody Car product)
    {
        productService.addProduct(product);
    }
}
