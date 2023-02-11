package referential.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import referential.entities.Customer;
import referential.services.CustomerService;

import java.util.List;

@CrossOrigin()
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/addCustomer")
    @Operation(
            summary = "add customer ",
            description = "add customer",
            responses = {
                    @ApiResponse(responseCode = "204", description = "The request is OK")
            }
    )
    public void addCustomer(@RequestBody Customer customer)
    {
        customerService.addCustomer(customer);
    }

    @GetMapping("/getAllCustomer")
    @Operation(
            summary = "Get all customer ",
            description = "Get all customer",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Customer.class)))})
            }
    )
    public Iterable<Customer> getAllCustomer()
    {
        return customerService.findAll();
    }

    @GetMapping("/getAllActiveCustomer")
    @Operation(
            summary = "Get all active customer ",
            description = "Get all active customer",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Customer.class)))})
            }
    )
    public List<Customer> getAllActiveCustomer()
    {
        return customerService.findAllByActiveIsTrue();
    }

    @GetMapping("/findById/{id}")
    @Operation(
            summary = "Get customer by Id ",
            description = "Get customer by id",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Customer.class))})
            }
    )
    public Customer findById(@PathVariable Long id){
        return customerService.findById(id);
    }
}
