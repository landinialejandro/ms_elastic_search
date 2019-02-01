package pe.com.gorillasoft.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.gorillasoft.expose.response.Response;
import pe.com.gorillasoft.service.DocumentoService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/elastic")
public class ElasticSearchController {

	@Autowired
	DocumentoService documentoService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/search")
	public Mono<Response<String>> buscarDocumento(){
		Response<String> documentoResponse = new Response<String>();
		
		return Mono.just(documentoResponse);
	}
}
