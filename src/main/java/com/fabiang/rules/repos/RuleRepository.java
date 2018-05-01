package com.fabiang.rules.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiang.rules.entities.Rule;

public interface RuleRepository extends JpaRepository<Rule, Integer> {

}
