package com.dmitryprod.testdatarest.repository;

import com.dmitryprod.testdatarest.dto.CardDto;
import com.dmitryprod.testdatarest.entity.Card;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDateTime;

@RepositoryRestResource(path = "cards", collectionResourceRel = "cards")
public interface CardRepository extends JpaRepository<Card, Long> {

    @Query("""
            SELECT c.id AS id, c.cardNumber AS cardNumber 
            FROM Card c
            WHERE c.createDate >= :date""")
    Page<CardDto> dateFinder(@Param("date") LocalDateTime date, Pageable pageable);

//    Page<CardDto> findCardByCreateDateAfter(@Param("createDate") LocalDateTime createDate, Pageable pageable);
//
//    @Operation(responses = {@ApiResponse(content = @Content(schema = @Schema(implementation = CardDto.class)))})
//    CardDto findCardById(@Param("id") long id);
}
