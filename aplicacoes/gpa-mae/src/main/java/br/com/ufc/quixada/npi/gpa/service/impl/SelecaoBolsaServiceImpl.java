package br.com.ufc.quixada.npi.gpa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import br.com.ufc.quixada.npi.gpa.model.SelecaoBolsa;
import br.com.ufc.quixada.npi.gpa.service.SelecaoBolsaService;
import br.ufc.quixada.npi.enumeration.QueryType;
import br.ufc.quixada.npi.service.impl.GenericServiceImpl;

@Named
public class SelecaoBolsaServiceImpl extends GenericServiceImpl<SelecaoBolsa> implements
		SelecaoBolsaService {

	@Override
	public List<SelecaoBolsa> getSelecaoBolsasSubmetidos() {
		return find(QueryType.JPQL, "from SelecaoBolsa as p where p.status != 'NOVO' ", null);
	}
	
	@Override
	public List<SelecaoBolsa> getSelecaoBolsasAtribuidos() {
		return find(QueryType.JPQL, "from SelecaoBolsa as p where p.status = 'AGUARDANDO_PARECER' ", null);
	}

	@Override
	public List<SelecaoBolsa> getSelecaoBolsasByUsuario(Long id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		return find(QueryType.JPQL, "from SelecaoBolsa where usuario_id = :id", params);
	}
	
	@Override
	public List<SelecaoBolsa> getSelecaoBolsasAguardandoParecer() {
		return find(QueryType.JPQL, "from SelecaoBolsa as p where p.status = 'AGUARDANDO_PARECER'", null);
	}


}
