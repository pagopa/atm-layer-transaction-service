package it.gov.pagopa.atmlayer.transaction.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class TransactionUpdateDTO {
    @NotBlank
    private String transactionId;
    @NotNull
    private String transactionStatus;
    @NotNull
    private String functionType;
}
