package com.dmitryprod.testdatarest.dto;

import com.dmitryprod.testdatarest.entity.Card;

import java.time.LocalDate;
import java.util.List;

public interface UserDto {

    Long getId();

    String getName();

    String getUsername();

    LocalDate getBirthday();

    List<Card> getCards();
}



