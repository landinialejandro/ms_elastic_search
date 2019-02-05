package pe.com.gorillasoft.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "documento", type = "documento")
public class Documento {
	
	@Id
	private String codigo;
	private int identificador;
	private String tabla;
	private String titulo;
	private String contenido;
	
	public Documento() {
		
	}
	
	public Documento(String codigo, int identificador, String tabla, String titulo, String contenido) {
		super();
		this.codigo = codigo;
		this.identificador = identificador;
		this.tabla = tabla;
		this.titulo = titulo;
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [codigo=");
		builder.append(codigo);
		builder.append(",identificador=");
		builder.append(identificador);
		builder.append(",tabla=");
		builder.append(tabla);
		builder.append(",titulo=");
		builder.append(titulo);
		builder.append(",contenido=");
		builder.append(contenido);
		builder.append("]");
		return builder.toString();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
