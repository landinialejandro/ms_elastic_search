package pe.com.gorillasoft.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import pe.com.gorillasoft.model.Documento;

@Repository
public interface DocumentoRepository extends ElasticsearchRepository<Documento, String> {

	public List<Documento> findByTitulo(String titulo);
	
	public List<Documento> findByContenido(String contenido);
	
	public List<Documento> findDistinctPeopleByTituloOrContenido(String titulo, String contenido);
	
}
