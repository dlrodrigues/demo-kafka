package br.com.dliskainformatica.demokafka.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DemoProducer {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	public void enviar(final String mensagem) {
		Message<String> message = MessageBuilder
				.withPayload(mensagem)
				.setHeader(KafkaHeaders.TOPIC, "TOPICO_TESTE_DEMONSTRACAO")
				.build();
		
		this.kafkaTemplate.send(message);
	}
}
