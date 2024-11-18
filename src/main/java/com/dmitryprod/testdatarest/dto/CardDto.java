package com.dmitryprod.testdatarest.dto;

import com.dmitryprod.testdatarest.entity.User;

import java.time.LocalDateTime;
import java.util.UUID;

public interface CardDto {

    Long getId();

    UUID getCardNumber();

}
