[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java](https://img.shields.io/badge/Java-11%2B-blue)
![JUnit](https://img.shields.io/badge/JUnit-4-red)

# Restaurant Project 🍐

Java-приложение для управления рестораном с системой учета ингредиентов и меню

## 🚀 Запуск проекта

### Требования
- Java 11+
- Maven 3.6+
- Git

### 1. Клонирование репозитория
```bash
git clone git@github.com:Versaria/restaurant-project.git
cd restaurant-project
```

### 2. Сборка проекта
```bash
mvn clean package
```

### 3. Запуск приложения
```bash
mvn exec:java -Dexec.mainClass="ru.restaurant.Praktikum"
```

### 4. Запуск тестов
```bash
mvn test
```

## 🏗️ Структура проекта
```
restaurant-project/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ru/
│   │           └── restaurant/
│   │               ├── Restaurant.java  # Основной класс ресторана
│   │               └── Praktikum.java   # Точка входа
│   └── test/
│       └── java/
│           └── ru/
│               └── restaurant/
│                   └── RestaurantTest.java  # Юнит-тесты
├── pom.xml          # Конфигурация Maven
└── README.md        # Этот файл
```

## 📋 Функционал
- Просмотр меню ресторана
- Учет количества ингредиентов (груш)
- Автоматическое пополнение запасов
- Система приготовления блюд

## 🧪 Пример работы
```java
Restaurant restaurant = new Restaurant();
restaurant.showMenu(); 
// Выведет:
// Сегодня у нас в меню: Шарлотка грушевая
// Сегодня у нас в меню: Компот грушевый
// ...

restaurant.cook("Салат из груш и лисичек");
restaurant.checkPears();
```

## 👩‍💻 Разработчик
[Ваше имя] | [Ваш email] | [GitHub профиль](https://github.com/Versaria)

## 📜 Лицензия

Этот проект распространяется под лицензией MIT. Подробности см. в файле [LICENSE](LICENSE).
```text
MIT License

Copyright (c) 2023 Versaria

Разрешается свободное использование, копирование, модификация и 
распространение программного обеспечения при условии сохранения 
уведомления об авторских правах.
```

## 🤝 Как внести вклад
1. Форкните репозиторий
2. Создайте ветку (`git checkout -b feature/your-feature`)
3. Сделайте коммит (`git commit -am 'Add some feature'`)
4. Запушьте ветку (`git push origin feature/your-feature`)
5. Создайте Pull Request

