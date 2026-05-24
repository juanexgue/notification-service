package com.juanex.notification_service.consumer;

import com.juanex.notification_service.event.PaymentCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaymentConsumer {
    @KafkaListener(
            topics = "payment-created-topic",
            groupId = "notification-group-v2"
    )
    public void consume(PaymentCreatedEvent event) {

        log.info("Evento recibido desde Kafka: {}", event);

        log.info(
                "Notificación enviada al cliente {} por pago {} con monto {}",
                event.customerId(),
                event.paymentId(),
                event.amount()
        );
    }
}
