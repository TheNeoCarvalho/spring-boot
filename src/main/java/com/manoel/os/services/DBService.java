package com.manoel.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoel.os.domain.Cliente;
import com.manoel.os.domain.OS;
import com.manoel.os.domain.Tecnico;
import com.manoel.os.domain.enums.Prioridade;
import com.manoel.os.domain.enums.Status;
import com.manoel.os.repositories.ClienteRepository;
import com.manoel.os.repositories.OSRepository;
import com.manoel.os.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;

	public void instanciaDB() {

		Tecnico t1 = new Tecnico(null, "Manoel", "010.059.773-48", "8899968-9957");
		Cliente c1 = new Cliente(null, "Maria Jocirene", "925.557.000-56", "8899878-8987");
		OS os1 = new OS(null, Prioridade.ALTO, "Teste de OS", Status.ABERTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));

		osRepository.saveAll(Arrays.asList(os1));

	}

}
