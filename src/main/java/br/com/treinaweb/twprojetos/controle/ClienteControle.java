package br.com.treinaweb.twprojetos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.twprojetos.repositorios.ClienteRepositorio;

@Controller
@RequestMapping("/clientes")
public class ClienteControle {

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@GetMapping
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("cliente/home");
		
		modelAndView.addObject("clientes", clienteRepositorio.findAll());
		
		return modelAndView;
	}
}
