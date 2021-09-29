package code.com.desafio.appLeandro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import code.com.desafio.appLeandro.model.domain.Relogio;

@Repository
public interface RelogioRepository extends CrudRepository<Relogio, Integer>{

}
