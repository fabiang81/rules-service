package com.fabiang.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.fabiang.rules.entities.Rule;
import com.fabiang.rules.repos.RuleRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/rules")
public class RuleController {
	
	@Autowired
	RuleRepository repository;
	
	@GetMapping
	public List<Rule> getRules(){
		return repository.findAll();
	}
	
	@PostMapping
	public List<Rule> createRule(@RequestBody Rule rule) {
		repository.save(rule);
		return repository.findAll();
	}

}
