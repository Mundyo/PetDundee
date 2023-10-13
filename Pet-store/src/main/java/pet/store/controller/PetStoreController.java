package pet.store.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pet.store.controller.model.PetStoreData;
import pet.store.service.PetStoreService;

@Slf4j
@RestController
@RequestMapping("/pet_store")
public class PetStoreController {
	@Autowired
    private PetStoreService petStoreService;

	@PostMapping("/PetStore")
    @ResponseStatus(code = HttpStatus.CREATED)
    public PetStoreData createPetStore(
    		@RequestBody PetStoreData petStoreData) {
        log.info("creating a petstore: {}",petStoreData );
        return petStoreService.savePetStore(petStoreData);
    }

	@PutMapping("/PetStore/{petStoreId}")
    public PetStoreData updatePetStore(
            @PathVariable Long petStoreId,
            @RequestBody PetStoreData petStoreData) {
        log.info("Updating pet store with ID: {}", petStoreId);
        petStoreData.setPetStoreId(petStoreId); // Set the pet store ID
        return petStoreService.savePetStore(petStoreData);
    }
	
}

