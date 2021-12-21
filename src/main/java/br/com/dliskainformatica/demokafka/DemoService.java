package br.com.dliskainformatica.demokafka;

import br.com.dliskainformatica.demokafka.kafka.DemoProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {
	
	private final DemoProducer demoProducer;
	
	public void enviarParaKafka(final Integer qtd,
								final String mensagem) {
		Integer qt = 0;
		while (qt < qtd) {
			demoProducer.enviar(mensagem.concat(" ").concat(qt.toString()));
			qt++;
		}
	}
}
