package br.ufc.quixada.npi.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import br.ufc.quixada.npi.model.QuestionarioIniciacaoAcademica;

@Controller
public class IniciacaoAcademicaController {

	
private Logger log = LoggerFactory.getLogger(this.getClass());

	
	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder)
			throws ServletException {
		binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		log.info("controller: projeto - action: index");
		return "index";
	}
	
	@RequestMapping(value = "/iniciacao", method = RequestMethod.GET)
	public String cadastro(Model model) {
		model.addAttribute("questionarioIniciacaoAcademicaService", new QuestionarioIniciacaoAcademica());
		return "inscricao/iniciacao";
	}
	
	
}
