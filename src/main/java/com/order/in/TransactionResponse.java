package com.order.in;

import common.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Long orderId;
    private Double amount;
    private PaymentStatus paymentStatus;
    private String transactionId;
    private String orderName;
}
