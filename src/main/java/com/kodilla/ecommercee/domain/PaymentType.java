package com.kodilla.ecommercee.domain;

public enum PaymentType {
    BLIK {
        public String toString() {
            return "BLIK";
        }
    },
    CREDIT_CARD {
        public String toString() {
            return "Karta kredytowa";
        }
    },
    MONEY_TRANSFER {
        public String toString() {
            return "Przelew bankowy";
        }
    },
    UPON_DELIVERY {
        public String toString() {
            return "Płatność przy odbiorze";
        }
    },
    PAYU{
        public String toString() {
            return "PayU";
        }
    }
}
