package com.kodilla.ecommercee.domain;

public enum OrderStatus {
    ORDER_PLACED {
        public String toString() {
            return "Zamówienie przyjęte";
        }
    },
    ORDER_CONFIRMED {
        public String toString() {
            return "Zamówienie potwierdzone";
        }
    },
    PREPARING_ORDER {
        public String toString() {
            return "Zamówienie przyjęte do realizacji";
        }
    },
    ORDER_SENT {
        public String toString() {
            return "Zamówienie wysłane";
        }
    },
    ORDER_CANCELED {
        public String toString() {
            return "Zamówienie anulowane";
        }
    }
}
