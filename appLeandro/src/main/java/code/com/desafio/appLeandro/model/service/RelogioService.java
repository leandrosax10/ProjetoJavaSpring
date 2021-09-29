package code.com.desafio.appLeandro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.com.desafio.appLeandro.model.domain.Relogio;
import code.com.desafio.appLeandro.model.repository.RelogioRepository;

@Service
public class RelogioService {
	
	@Autowired
	private RelogioRepository relogioRepository;
	
	public List<Relogio> obterLista(){				
		return (List<Relogio>) relogioRepository.findAll();
	}
	
	public void incluir(Relogio relogio) {
		relogioRepository.save(relogio);		
	}
	
	public void excluir(Integer id) {
		relogioRepository.deleteById(id);		
	}
	
	public Relogio obterPorId(Integer id) {
		return relogioRepository.findById(id).orElse(null);
		
	}
}
