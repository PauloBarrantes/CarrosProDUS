package application.repository;

import application.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<Users,Integer>{
    List<Users> findByName(String name);


}
