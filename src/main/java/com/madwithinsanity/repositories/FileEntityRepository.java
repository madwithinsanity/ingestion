package com.madwithinsanity.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.madwithinsanity.entities.FileEntity;

@RepositoryRestResource(collectionResourceRel = "file", path = "file")
public interface FileEntityRepository extends MongoRepository<FileEntity, String> {
}
