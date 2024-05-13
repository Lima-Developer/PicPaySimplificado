package com.picpaysimplificado.picpaysimplificado.dtos;

import java.math.BigDecimal;

//DTO = Data Transfer Object
public record TransactionDTO (BigDecimal value, Long senderId, Long receiverId) {

}
