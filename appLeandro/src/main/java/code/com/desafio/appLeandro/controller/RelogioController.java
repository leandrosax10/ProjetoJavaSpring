package code.com.desafio.appLeandro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import code.com.desafio.appLeandro.model.domain.Relogio;
import code.com.desafio.appLeandro.model.service.RelogioService;

@Controller
public class RelogioController {
	
	
	@Autowired
	private RelogioService relogioService;
	
	@GetMapping (value = "/")
	public String inicializa () {
		return "index";
		
	}
	
	@GetMapping (value ="/relogio")
	public String telaCadastro() {
		return "relogio/cadastro";
	}
	
	@GetMapping (value = "/relogio/{id}/excluir")
	public String excluir(Model model, @PathVariable Integer id) {
		
		Relogio relogioExluido = relogioService.obterPorId(id);		
		
		relogioService.excluir(id);
		
		model.addAttribute("mensagem", "Produto " + relogioExluido.getMarca() +" excluído com sucesso!");
		
		return obterLista(model);
	}
	
	@PostMapping(value = "/relogio/incluir")
	public String incluir (Model model, Relogio relogio) {
		
		
		relogioService.incluir(relogio);
		
		model.addAttribute("mensagem", "O produto  " + relogio.getMarca() +"  foi cadastrado com sucesso!");
				
		return obterLista(model);
		
	}
	
	@GetMapping (value = "/relogio/consultar")
	public String consultar() {
		return "";
	}
	
	@GetMapping (value = "/relogio/lista")
	public String obterLista(Model model) {
				
		model.addAttribute("relogios", relogioService.obterLista());
		
		
		return "relogio/lista";
		
	}

}
