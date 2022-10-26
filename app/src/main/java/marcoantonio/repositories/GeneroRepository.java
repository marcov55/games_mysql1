package marcoantonio.repositories;

import org.springframework.data.repository.CrudRepository;

import marcoantonio.models.Genero;

public interface GeneroRepository extends CrudRepository<Genero, Integer> {
    
}