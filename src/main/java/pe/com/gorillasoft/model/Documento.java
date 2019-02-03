package pe.com.gorillasoft.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "documento", type = "documento")
public class Documento {
	
	@Id
	private int id;
	private String tableName;
	private String title;
	private String content;
	
	public Documento() {
		
	}
	
	public Documento(int id, String tableName, String title, String content) {
		super();
		this.id = id;
		this.tableName = tableName;
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [id=");
		builder.append(id);
		builder.append(",tableName=");
		builder.append(tableName);
		builder.append(",title=");
		builder.append(title);
		builder.append(",content=");
		builder.append(content);
		builder.append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
