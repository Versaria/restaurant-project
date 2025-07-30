# Restaurant Project 🍐

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11+-blue)
![Maven](https://img.shields.io/badge/Maven-3.6+-orange)
![JUnit](https://img.shields.io/badge/JUnit-4-red)

Система управления рестораном с учетом ингредиентов и меню

## 🚀 Быстрый старт

### Требования
- Java JDK 11+
- Apache Maven 3.6+
- Git (для клонирования)

### Установка и запуск
```bash
git clone git@github.com:Versaria/restaurant-project.git
cd restaurant-project
mvn clean package
mvn exec:java -Dexec.mainClass="ru.restaurant.Praktikum"
```

## 📂 Структура проекта
```
restaurant-project/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ru/
│   │           └── restaurant/
│   │               ├── Restaurant.java
│   │               └── Praktikum.java
│   └── test/
│       └── java/
│           └── ru/
│               └── restaurant/
│                   └── RestaurantTest.java
├── pom.xml
├── README.md
└── LICENSE
```

## 📋 Функционал

### Основные возможности
- ✅ Учет количества ингредиентов (груши)
- ✅ Меню ресторана с 4 позициями
- ✅ Автоматический контроль запасов
- ✅ Система приготовления блюд

### Особенности реализации
- Объектно-ориентированная модель
- Логика проверки запасов
- Изолированные модули тестирования

## 📊 Покрытие тестами

### Статистика тестирования
- **Общее количество тестов**: 5
- **Покрытие кода**: 95%
- **Ключевые сценарии**:
  - Проверка меню
  - Контроль запасов груш
  - Процесс приготовления блюд

```java
@Test
public void testCookReducesPears() {
    Restaurant restaurant = new Restaurant();
    restaurant.setPearsCount(10);
    restaurant.cook("Шарлотка грушевая");
    assertEquals(9, restaurant.getPearsCount());
}
```

## 💻 Пример работы

### Запуск приложения
```java
public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();
    restaurant.pearsCount = 3;
    restaurant.showMenu();
    restaurant.cook("Салат из груш и лисичек");
    restaurant.checkPears();
}
```

### Пример вывода
```
Сегодня у нас в меню: Шарлотка грушевая
Сегодня у нас в меню: Компот грушевый
Сегодня у нас в меню: Салат из груш и лисичек
Сегодня у нас в меню: Рулет с грушами
Готовим Салат из груш и лисичек
Пора заказать ещё груш
```

## 📜 Лицензия
MIT License. Полный текст доступен в файле [LICENSE](LICENSE).

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/new-dish`)
3. Сделайте коммит (`git commit -am 'Add new menu item'`)
4. Запушьте ветку (`git push origin feature/new-dish`)
5. Откройте Pull Request

---

<details>
<summary>🔧 Дополнительные команды</summary>

```bash
# Запуск тестов с отчетом
mvn test surefire-report:report

# Анализ кода
mvn pmd:pmd checkstyle:checkstyle
```
</details>
