package pe.com.gorillasoft.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.com.gorillasoft.expose.response.Response;
import pe.com.gorillasoft.model.Documento;
import pe.com.gorillasoft.service.DocumentoService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/elastic")
public class ElasticSearchController {

	@Autowired
	DocumentoService documentoService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/search")
	public Mono<Response<List<Documento>>> buscarDocumento(@RequestParam(value = "text", required = false, defaultValue = "") String text){
		Response<List<Documento>> documentoResponse = new Response<List<Documento>>();
		try {
		List<Documento> lDocumento = documentoService.buscarDocumentos(text);
		
		documentoResponse.setSuccess(true);
		documentoResponse.setResult(lDocumento);
		}
		catch(Exception e) {
			documentoResponse.setMessage(e.getMessage());
		}
		return Mono.just(documentoResponse);
	}
}
