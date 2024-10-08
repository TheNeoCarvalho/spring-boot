package com.manoel.os.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoel.os.domain.Tecnico;
import com.manoel.os.dtos.TecnicoDTO;
import com.manoel.os.repositories.TecnicoRepository;
import com.manoel.os.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnico findById(Integer id) {

		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado id: " + id + ", tipo: " + Tecnico.class.getName()));

	}

	public List<Tecnico> findAll() {
		List<Tecnico> obj = repository.findAll();
		return obj;
	}

	public Tecnico create(TecnicoDTO objDTO) {
		Tecnico newObj = new Tecnico(null, objDTO.getNome(), objDTO.getCpf(), objDTO.getTelefone());
		return repository.save(newObj);

	}
}
