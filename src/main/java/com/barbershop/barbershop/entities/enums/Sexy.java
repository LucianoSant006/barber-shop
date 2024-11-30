package com.barbershop.barbershop.entities.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.springframework.stereotype.Component;

@Enumerated(EnumType.STRING)
public enum Sexy {
    MAN,
    SHE,
    NON_BINARY,
    TRANSGENDER,
    OTHER;

}
