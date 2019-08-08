package com.demo.test;

public class EnumInterfaceTest {
    public interface Food {
        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO
        }

        enum Dessert implements Food {
            FRIUT, CAKE, GELATO
        }
    }

    public static void main(String[] args) {
        for (Food.Coffee coffee : Food.Coffee.values()) {
            System.out.println(coffee + " ");
        }
    }
}
