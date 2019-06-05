
package com.example.gitLab.resorces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gitLab.models.GitLabPushEvents;
import com.example.gitLab.repository.PushEventesRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;;

@RestController
@RequestMapping(value="/api")
@Api(value="API Rest Eventos")
@CrossOrigin(origins="*")
public class PushEventsResorce {
	
	@Autowired
	PushEventesRepository pushEventesRepository;
	
	@GetMapping("/eventos")
	@ApiOperation(value="Retorna Lista de Eventos")
	public List<GitLabPushEvents> listEventos(){
		return pushEventesRepository.findAll();
	}
	@GetMapping("/evento/{id}")
	@ApiOperation(value="Retorna um Evento")
	public GitLabPushEvents unicoGitLabPushEvents(@PathVariable(value="id") long id) {
		return pushEventesRepository.findById(id);
	}
	
	@PostMapping("/evento")
	@ApiOperation(value="Salva Evento")
	public GitLabPushEvents salvaEvento(@RequestBody GitLabPushEvents evento) {
		return pushEventesRepository.save(evento);
	}
	@DeleteMapping("/evento")
	@ApiOperation(value="Delete um Evento")
	public void deletaEvento(@RequestBody GitLabPushEvents evento) {
		pushEventesRepository.delete(evento);
	}
	@PutMapping("/evento")
	@ApiOperation(value="Atualiza um Evento")
	public GitLabPushEvents updateEvento(@RequestBody GitLabPushEvents evento) {
		return pushEventesRepository.save(evento);
	}
	
}
