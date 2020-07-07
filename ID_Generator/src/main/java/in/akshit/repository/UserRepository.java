package in.akshit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.akshit.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByEmail(String email);
	public boolean existsByEmail(String email);
	
	// CRUD VS  JpaRepository
}
