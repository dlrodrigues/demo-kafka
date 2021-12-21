package br.com.dliskainformatica.demokafka;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {
	
	private final DemoService service;
	
	@GetMapping("/{qtd}/{mensagem}")
	public ResponseEntity<Void> demoEnvioKafka(@PathVariable final Integer qtd,
											   @PathVariable final String mensagem) {
		this.service.enviarParaKafka(qtd, mensagem);
		return ResponseEntity.ok().build();
	}
}
