package br.ufc.quixada.npi.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import br.ufc.quixada.npi.service.QuestionarioAuxMoradiaservice;


@Controller
public class AuxilioMoradiaController {

	@Inject
	private QuestionarioAuxMoradiaservice questionarioAuxMoradiaservice;
	
	
	
}
