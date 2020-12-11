package store.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import store.entities.Store;
import store.services.StoreService;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    StoreService storeService;

    @PostMapping("/addStore")
    @Operation(
            summary = "add Store",
            description = "Add store",
            responses = {
                    @ApiResponse(responseCode = "204", description = "The store is added successfully.")
            }
    )
    public void addStore(@RequestBody Store store)
    {
        storeService.addStore(store);
    }


    @GetMapping("/getAllStore")
    @Operation(
            summary = "Get all store",
            description = "Get all store",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Store.class)))})
            }
    )
    public Iterable<Store> getAllStore()
    {
        return storeService.getAllStore();
    }


    @GetMapping("/getAllStoreByGroupId/{id}")
    @Operation(
            summary = "Get a store by groupId",
            description = "Get a store by groupId",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Store.class)))})
            }
    )
    public List<Store> getAllStoreByGroupId(@PathVariable Long groupId)
    {
        return storeService.getAllStoreByGroupId(groupId);
    }

    @GetMapping("/findById/{id}")
    @Operation(
            summary = "Get a store by id",
            description = "Get a store by id",
            responses = {
                    @ApiResponse(responseCode = "200", description = "The response for the user request", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Store.class))})
            }
    )
    public Store findById(@PathVariable Long id){
        return storeService.findById(id);
    }
}
