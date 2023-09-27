package com.senai.JoaoGrando.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.JoaoGrando.entities.Cliente;
import com.senai.JoaoGrando.repositories.ClienteRepository;

@Service
public class ClienteServices {
	
	private ClienteRepository clienteRepository;
	
	@Autowired
	public void ClienteService (ClienteRepository clienteRepository ) {
	    this.clienteRepository = clienteRepository;
     }
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}

	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
	
 
}
