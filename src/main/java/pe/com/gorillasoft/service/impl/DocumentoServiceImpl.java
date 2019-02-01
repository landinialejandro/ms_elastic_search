package pe.com.gorillasoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gorillasoft.repository.DocumentoRepository;
import pe.com.gorillasoft.service.DocumentoService;

@Service("DocumentoService")
public class DocumentoServiceImpl implements DocumentoService{

	@Autowired
	DocumentoRepository documentoRepository;
	
}
