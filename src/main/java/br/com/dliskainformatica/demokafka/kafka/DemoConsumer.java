package br.com.dliskainformatica.demokafka.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DemoConsumer {
	
	@KafkaListener(topics = "TOPICO_TESTE_DEMONSTRACAO", groupId = "demo-api")
	public void receberMensagem(Message<String> message) {
		log.info("Recebida a mensagem contendo: {}", message.getPayload());
	}
}
