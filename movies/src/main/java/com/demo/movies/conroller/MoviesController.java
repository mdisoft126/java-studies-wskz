package com.demo.movies.conroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.movies.dto.DirectorDto;
import com.demo.movies.service.director.DirectorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MoviesController {
	
	private final DirectorService directorService;
	
	@PostMapping("save-director")
	private ResponseEntity<String> saveDirector(@RequestBody DirectorDto directorDto) {
		directorService.saveDirector(directorDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
