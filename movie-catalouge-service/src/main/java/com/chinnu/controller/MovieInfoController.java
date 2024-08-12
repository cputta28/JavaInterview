package com.chinnu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinnu.entity.MovieInfo;
import com.chinnu.repository.MovieInfoRepository;

@RestController
public class MovieInfoController {
	
	@Autowired
	private MovieInfoRepository repository;
	
	@PostMapping("/movie-info/save")
		public List<MovieInfo>	saveAll(@RequestBody List<MovieInfo> movieInfolist){
		return repository.saveAll(movieInfolist);
	}
	
	@GetMapping("/movie-info/list")
	public List<MovieInfo> getAll( ){
		return repository.findAll();
	}
	@GetMapping("/movie-info/find-path-by-id/{movieInfoId}")
	public String findPathById(@PathVariable Long movieInfoId  ) {
		Optional<MovieInfo> findById = repository.findById(movieInfoId);
		return findById.map(MovieInfo::getPath).orElse(null);
	}
	

}
