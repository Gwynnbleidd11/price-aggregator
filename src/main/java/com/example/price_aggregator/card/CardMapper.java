package com.example.price_aggregator.card;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper(componentModel = "spring")
public interface CardMapper {

    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);

    Card mapToCard(CardDto cardDto);
    CardDto mapToCardDto(Card card);
    List<CardDto> mapToCardDtoList(List<Card> cardsList);
}
