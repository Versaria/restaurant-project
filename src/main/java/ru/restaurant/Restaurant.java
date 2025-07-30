package ru.restaurant;

public class Restaurant {
    private int pearsCount;
    private final String[] menu = {
        "Шарлотка грушевая",
        "Компот грушевый",
        "Салат из груш и лисичек",
        "Рулет с грушами"
    };

    public void showMenu() {
        for (String item : menu) {
            System.out.println("Сегодня у нас в меню: " + item);
        }
    }

    public void checkPears() {
        if (pearsCount < 5) {
            System.out.println("Пора заказать ещё груш");
            pearsCount += 5;
        } else {
            System.out.println("Груш пока достаточно");
        }
    }

    public void cook(String name) {
        System.out.println("Готовим " + name);
        pearsCount--;
    }

    // Геттер для тестов
    public int getPearsCount() {
        return pearsCount;
    }
}
