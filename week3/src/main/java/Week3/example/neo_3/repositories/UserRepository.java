package Week3.example.neo_3.repositories;

import Week3.example.neo_3.entities.UserEntity;
import Week3.example.neo_3.entities.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    Optional<UserEntity> findByUsername(String username);
//    Optional<UserEntity> findByUsernameAndDeletedIsNull(String username);
//    Optional<UserEntity> findByUsernameAndIsActive(String Username, boolean active);
//    List<UserEntity> findAllByRoleAndDeletedIsNull(UserRole role);

}
