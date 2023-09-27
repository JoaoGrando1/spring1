package com.senai.JoaoGrando.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.JoaoGrando.entities.Cliente;
import com.senai.JoaoGrando.services.ClienteServices;

@RestController
@RequestMapping("/clients")
public class ClienteControllers {
	private final ClienteServices clienteServices;

	@Autowired
	public ClienteControllers(ClienteServices clienteServices) {
		this.clienteServices = clienteServices;
	}

	@PostMapping
	public Cliente createClients(@RequestBody Cliente cliente) {
		return clienteServices.saveCliente(cliente);
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return clienteServices.getAllClientes();
	}

	@GetMapping("/{idcCliente}")
	public Cliente getCliente(@PathVariable Long idcCliente) {
		return clienteServices.getClienteById(idcCliente);
	}

	@DeleteMapping("/{idcCliente}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteServices.deleteCliente(idcCliente);
	}

}