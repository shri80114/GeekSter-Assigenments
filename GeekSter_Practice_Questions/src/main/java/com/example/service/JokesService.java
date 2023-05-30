package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.beans.Jokes;

@Service
public class JokesService {

	private List<Jokes> joke = new ArrayList<>(Arrays.asList(
			new Jokes(1, "Chuck Norris once received a blowjob from a slim lingerie model.",
					"https:api.chucknorris.io"),
			new Jokes(2, "Yeah the other cow says. “Makes me glad I’m a penguin.",
					"https://www.rd.com/list/funniest-jokes-of-all-time")));


	public void addJokes(Jokes jokes) {
		joke.add(jokes);
	}
	
	public List<Jokes> getAllJokes()
	{
		return joke;
	}
	
	public Jokes findBy(Integer Id)
	{
		System.out.println(joke.stream().filter(id -> id.getId().equals(Id)).findFirst().get());
		return joke.stream().filter(id -> id.getId().equals(Id)).findFirst().get();
	}
}
