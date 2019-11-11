package com.vinnyfs89.jhipstergateway.repository;

import com.vinnyfs89.jhipstergateway.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
