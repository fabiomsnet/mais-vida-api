package br.com.maisvida.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maisvida.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
