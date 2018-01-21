package br.com.maisvida.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maisvida.model.Medico;
import br.com.maisvida.repository.MedicoRepository;

@RestController
@RequestMapping("/api")
public class MedicoController {

	@Autowired
	MedicoRepository medicoRepository;

	@GetMapping("/medicos")
	public List<Medico> getAllMedicos() {
		return medicoRepository.findAll();
	}

	@PostMapping("/medicos")
	public Medico createMedico(@Valid @RequestBody Medico medico) {
		return medicoRepository.saveAndFlush(medico);
	}

	@GetMapping("/medicos/{id}")
	public ResponseEntity<Medico> getMedicoById(@PathVariable(value = "id") Long medicoId) {
		Medico medico = medicoRepository.findOne(medicoId);
		if (medico == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(medico);
	}

	@PutMapping("/medicos/{id}")
	public ResponseEntity<Medico> updateMedico(@PathVariable(value = "id") Long medicoId,
			@Valid @RequestBody Medico medicoDetails) {
		Medico medico = medicoRepository.findOne(medicoId);
		if (medico == null) {
			return ResponseEntity.notFound().build();
		}
		medico.setFirstName(medicoDetails.getFirstName());
		medico.setLastName(medicoDetails.getLastName());
		medico.setEmail(medicoDetails.getEmail());
		medico.setCidade(medicoDetails.getCidade());
		medico.setEstado(medicoDetails.getEstado());
		medico.setEspecialidade(medicoDetails.getEspecialidade());

		Medico updateMedico = medicoRepository.save(medico);
		return ResponseEntity.ok(updateMedico);
	}
	
	@DeleteMapping("/medicos/{id}")
	public ResponseEntity<Medico> deleteMedico(@PathVariable(value = "id") Long medicoId) {
		Medico medico = medicoRepository.findOne(medicoId);
		if (medico == null) {
			return ResponseEntity.notFound().build();
		}
		medicoRepository.delete(medico);
		return ResponseEntity.ok().build();
	}

}
