package pe.com.gorillasoft.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "documento", type = "documento")
public class Documento {
	
	@Id
	private int id;
	
	public Documento() {
		
	}
	
	public Documento(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
}
