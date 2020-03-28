package com.kodilla.ecommercee.domain;

public enum DeliveryType {
    TO_HOME {
        public String toString() {
            return "Dostawa do domu";
        }
    },
    SELF_PICKUP {
        public String toString() {
            return "Odbiór osobisty";
        }
    }
}
