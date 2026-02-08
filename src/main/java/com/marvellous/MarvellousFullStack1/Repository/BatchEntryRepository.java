package com.marvellous.MarvellousFullStack1.Repository;

import com.marvellous.MarvellousFullStack1.Entity.BatchEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, String> {
    // No need to write any code , CRUD methods are available by default.
}
