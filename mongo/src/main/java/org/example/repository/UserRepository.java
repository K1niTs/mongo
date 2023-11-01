package org.example.repository;

import org.example.entity.Adress;
import org.example.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    void deleteByAdress (Adress adress);

    boolean existsByAdress(Adress adress);
}
