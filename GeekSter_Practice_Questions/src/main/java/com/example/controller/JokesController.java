package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Jokes;
import com.example.service.JokesService;

@RestController
public class JokesController {

	@Autowired
	JokesService jokesService;

	@PutMapping("/addJokes")
	public void addJoke(@RequestBody Jokes jokes) {
		jokesService.addJokes(jokes);
	}

	@PostMapping("/getAllJokes")
	public List<Jokes> getAllJokes() {
		return jokesService.getAllJokes();
	}

	@PostMapping("/fingById/{Id}")
	public Jokes findById(@PathVariable("Id") Integer Id) {
		return jokesService.findBy(Id);
	}
}
