package com.example.price_aggregator.card;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "artist")
    private String artist;

    @Column(name = "artistids")
    private String artistIds;

    @Column(name = "asciiname")
    private String asciiName;

    @Column(name = "attractionlights")
    private String attractionLights;

    @Column(name = "availability")
    private String availability;

    @Column(name = "boostertypes")
    private String boosterTypes;

    @Column(name = "bordercolor")
    private String borderColor;

    @Column(name = "cardparts")
    private String cardParts;

    @Column(name = "coloridentity")
    private String colorIdentity;

    @Column(name = "colorindicator")
    private String colorIndicator;

    @Column(name = "colors")
    private String colors;

    @Column(name = "defense")
    private String defense;

    @Column(name = "dueldeck")
    private String duelDeck;

    @Column(name = "edhrecrank")
    private Integer edhRecRank;

    @Column(name = "edhrecsaltiness")
    private Double edhRecSaltiness;

    @Column(name = "faceconvertedmanacost")
    private Double faceConvertedManaCost;

    @Column(name = "faceflavorname")
    private String faceFlavorName;

    @Column(name = "facemanavalue")
    private Double faceManaValue;

    @Column(name = "facename")
    private String faceName;

    @Column(name = "finishes")
    private String finishes;

    @Column(name = "flavorname")
    private String flavorName;

    @Column(name = "flavortext")
    private String flavorText;

    @Column(name = "frameeffects")
    private String frameEffects;

    @Column(name = "frameversion")
    private String frameVersion;

    @Column(name = "hand")
    private String hand;

    @Column(name = "hasalternativedecklimit")
    private Boolean hasAlternativeDeckLimit;

    @Column(name = "hascontentwarning")
    private Boolean hasContentWarning;

    @Column(name = "hasfoil")
    private Boolean hasFoil;

    @Column(name = "hasnonfoil")
    private Boolean hasNonFoil;

    @Column(name = "isalternative")
    private Boolean isAlternative;

    @Column(name = "isfullart")
    private Boolean isFullArt;

    @Column(name = "isfunny")
    private Boolean isFunny;

    @Column(name = "isonlineonly")
    private Boolean isOnlineOnly;

    @Column(name = "isoversized")
    private Boolean isOversized;

    @Column(name = "ispromo")
    private Boolean isPromo;

    @Column(name = "isrebalanced")
    private Boolean isRebalanced;

    @Column(name = "isreprint")
    private Boolean isReprint;

    @Column(name = "isreserved")
    private Boolean isReserved;

    @Column(name = "isstarter")
    private Boolean isStarter;

    @Column(name = "isstoryspotlight")
    private Boolean isStorySpotlight;

    @Column(name = "istextless")
    private Boolean isTextless;

    @Column(name = "istimeshifted")
    private Boolean isTimeShifted;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "language")
    private String language;

    @Column(name = "layout")
    private String layout;

    @Column(name = "leadershipskills")
    private String leadershipSkills;

    @Column(name = "life")
    private String life;

    @Column(name = "loyalty")
    private String loyalty;

    @Column(name = "manacost")
    private String manaCost;

    @Column(name = "manavalue")
    private Double manaValue;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @Column(name = "originalprintings")
    private String originalPrintings;

    @Column(name = "originalreleasedate")
    private String originalReleaseDate;

    @Column(name = "originaltext")
    private String originalText;

    @Column(name = "originaltype")
    private String originalType;

    @Column(name = "otherfaceids")
    private String otherFaceIds;

    @Column(name = "power")
    private String power;

    @Column(name = "printings")
    private String printings;

    @Column(name = "promotypes")
    private String promoTypes;

    @Column(name = "rarity")
    private String rarity;

    @Column(name = "rebalancedprintings")
    private String rebalancedPrintings;

    @Column(name = "relatedcards")
    private String relatedCards;

    @Column(name = "securitystamp")
    private String securityStamp;

    @Column(name = "setcode")
    private String setCode;

    @Column(name = "side")
    private String side;

    @Column(name = "signature")
    private String signature;

    @Column(name = "sourceproducts")
    private String sourceProducts;

    @Column(name = "subsets")
    private String subSets;

    @Column(name = "subtypes")
    private String subTypes;

    @Column(name = "supertypes")
    private String superTypes;

    @Column(name = "text")
    private String text;

    @Column(name = "toughness")
    private String toughness;

    @Column(name = "type")
    private String type;

    @Column(name = "types")
    private String types;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "variations")
    private String variations;

    @Column(name = "watermark")
    private String watermark;
}
