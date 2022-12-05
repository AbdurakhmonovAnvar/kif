package uz.anvar.kif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.anvar.kif.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
