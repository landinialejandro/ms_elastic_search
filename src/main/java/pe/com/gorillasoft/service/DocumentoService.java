package pe.com.gorillasoft.service;

import java.util.List;

import pe.com.gorillasoft.model.Documento;

public interface DocumentoService {
	
	public List<Documento> buscarDocumentos(String text);

}
