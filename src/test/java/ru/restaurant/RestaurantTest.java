package ru.restaurant;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testShowMenu() {
        Restaurant restaurant = new Restaurant();
        restaurant.showMenu(); // Проверяем что метод выполняется без ошибок
    }

    @Test
    public void testCookReducesPears() {
        Restaurant restaurant = new Restaurant();
        restaurant.cook("Тестовое блюдо");
        assertEquals(-1, restaurant.getPearsCount());
    }
}
