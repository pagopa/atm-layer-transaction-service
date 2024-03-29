package it.gov.pagopa.atmlayer.transaction.service.service;

import io.smallrye.mutiny.Uni;
import it.gov.pagopa.atmlayer.transaction.service.entity.TransactionEntity;
import it.gov.pagopa.atmlayer.transaction.service.model.PageInfo;
import it.gov.pagopa.atmlayer.transaction.service.dto.TransactionUpdateDTO;

import java.util.List;


public interface TransactionEntityService {

    Uni<TransactionEntity> insertTransactionEntity(TransactionEntity transactionEntity);

    Uni<TransactionEntity> updateTransactionEntity(TransactionUpdateDTO transactionUpdateDTO);

    Uni<TransactionEntity> findById(String transactionId);

    Uni<PageInfo<TransactionEntity>> searchTransactions(int pageIndex, int pageSize, String transactionId, String functionType, String acquirerId, String branchId, String terminalId, String transacionStatus);

    Uni<List<TransactionEntity>> getAllTransactions();
}
