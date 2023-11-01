package org.example.repository;

import org.example.entity.Adress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdressRepository extends MongoRepository<Adress, String> {
}
