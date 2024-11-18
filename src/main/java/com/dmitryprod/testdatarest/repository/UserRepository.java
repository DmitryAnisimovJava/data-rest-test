package com.dmitryprod.testdatarest.repository;

import com.dmitryprod.testdatarest.dto.UserDto;
import com.dmitryprod.testdatarest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", itemResourceRel = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""
            SELECT u
            FROM User u
            JOIN FETCH u.cards
            WHERE u.username = :username""")
    UserDto findByUsername(@Param("username") String username);
}
