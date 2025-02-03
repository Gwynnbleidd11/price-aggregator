package com.example.price_aggregator.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    public Card saveCard(final Card card) {
        return cardRepository.save(card);
    }

    public Card getCard(final Integer cardId) throws CardNotFoundException {
        return cardRepository.findById(cardId).orElseThrow(CardNotFoundException::new);
    }

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public void deleteCard(final Integer cardId) {
        cardRepository.deleteById(cardId);
    }
}
