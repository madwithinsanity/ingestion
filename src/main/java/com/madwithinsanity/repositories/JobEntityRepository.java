package com.madwithinsanity.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.madwithinsanity.entities.JobEntity;

@RepositoryRestResource(collectionResourceRel = "job", path = "job")
public interface JobEntityRepository extends MongoRepository<JobEntity, String> {
}
