package common;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long pid;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private Timestamp paymentDate;
    private Double amount;
    private Long orderId;
}