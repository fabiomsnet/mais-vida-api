package br.com.maisvida.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maisvida.model.Users;

public interface UserRepository extends JpaRepository<Users, String>{
	
	public Users findByUsername(String username);	
}
