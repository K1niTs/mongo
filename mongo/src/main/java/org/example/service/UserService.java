package org.example.service;

import org.example.controller.AverageAgeResult;
import org.example.entity.Adress;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public UserService(UserRepository userRepository, MongoTemplate mongoTemplate) {
        this.userRepository = userRepository;
        this.mongoTemplate = mongoTemplate;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(String id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public double getAverageAge() {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.group().avg("age").as("averageAge")
        );

        AggregationResults<AverageAgeResult> result = mongoTemplate.aggregate(aggregation, "user", AverageAgeResult.class);

        double averageAge = 0.0;
        if (!result.getMappedResults().isEmpty()) {
            averageAge = result.getMappedResults().get(0).getAverageAge();
        }

        return averageAge;
    }
    public Map<String, String> deleteByAdress(Adress adress) {
        Map<String, String> result = new HashMap<>();
        boolean hasRecords = userRepository.existsByAdress(adress);
        if (hasRecords) {
            userRepository.deleteByAdress(adress);
            result.put("status", "Ready");
            result.put("data", "Adress(user) delete");
        }
        return result;
    }
}

