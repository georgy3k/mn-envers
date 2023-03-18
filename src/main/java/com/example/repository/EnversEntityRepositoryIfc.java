package com.example.repository;

import com.example.model.EnversEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface EnversEntityRepositoryIfc extends CrudRepository<EnversEntity, Long> {
}
