package com.simmi1969.my1stjhipsterapp1.repository;

import com.simmi1969.my1stjhipsterapp1.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
