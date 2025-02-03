package com.example.price_aggregator.card;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping(value = "{cardId}")
    public ResponseEntity<CardDto> getCard(@PathVariable Integer cardId) throws CardNotFoundException {
        return ResponseEntity.ok(cardMapper.mapToCardDto(cardService.getCard(cardId)));
    }

    @GetMapping
    public ResponseEntity<List<CardDto>> getAllCards() {
        return ResponseEntity.ok(cardMapper.mapToCardDtoList(cardService.getAllCards()));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addCard(@RequestBody CardDto cardDto) {
        cardService.saveCard(cardMapper.mapToCard(cardDto));
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<CardDto> changeCard(@RequestBody CardDto cardDto) {
        Card card = cardMapper.mapToCard(cardDto);
        Card savedCard = cardService.saveCard(card);
        return ResponseEntity.ok(cardMapper.mapToCardDto(savedCard));
    }
}
