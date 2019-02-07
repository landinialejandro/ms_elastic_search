package pe.com.gorillasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gorillasoft.model.Documento;
import pe.com.gorillasoft.repository.DocumentoRepository;
import pe.com.gorillasoft.service.DocumentoService;

@Service("DocumentoService")
public class DocumentoServiceImpl implements DocumentoService{

	@Autowired
	DocumentoRepository documentoRepository;

	public List<Documento> buscarDocumentos(String text) {
		List<Documento> lDocumento = documentoRepository.findDistinctPeopleByTituloContainingOrContenidoContaining(text, text);
		return lDocumento;
	}
	
}
