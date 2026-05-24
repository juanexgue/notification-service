package com.juanex.notification_service.event;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentCreatedEvent(
        Long paymentId,
        Long customerId,
        BigDecimal amount,
        String status,
        LocalDateTime createdAt
) {
}
