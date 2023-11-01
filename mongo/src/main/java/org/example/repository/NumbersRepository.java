package org.example.repository;

import org.example.entity.Numbers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NumbersRepository extends MongoRepository<Numbers, String> {
}
