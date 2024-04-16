package pe.company.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.company.model.Client;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{

	Optional<Client>findByClientId(String clientId);
}
