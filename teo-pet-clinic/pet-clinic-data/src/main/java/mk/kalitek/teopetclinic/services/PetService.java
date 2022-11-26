package mk.kalitek.teopetclinic.services;

import mk.kalitek.teopetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
