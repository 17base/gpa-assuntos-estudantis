package br.com.ufc.quixada.npi.gpa.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ufc.quixada.npi.gpa.model.Documento;
import br.com.ufc.quixada.npi.gpa.model.Pessoa;
import br.com.ufc.quixada.npi.gpa.service.DocumentoService;
import br.com.ufc.quixada.npi.gpa.utils.Constants;


@Controller
@RequestMapping("documento")
public class DocumentoController {
	
	@Inject
	private DocumentoService documentoService;
	
	
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public void getArquivo(@PathVariable("id") Long id, HttpServletResponse response, HttpSession session){
		try{
			Documento documento = documentoService.find(Documento.class, id);
			
		}
		
	}
	
	
	
	
	private Pessoa getPessoaLogada(HttpSession session){
		if(session.getAttribute(Constants.USUARIO_LOGADO)==null){
			Pessoa pessoa = Ser
		}
		return "";
	}
	
}
