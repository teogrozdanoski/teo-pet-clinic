package mk.kalitek.teopetclinic.services;

import mk.kalitek.teopetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
