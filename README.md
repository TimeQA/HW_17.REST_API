# Проект по автоматизации тестирования сайта reqres.in
## 📑Содержание
- [Стек проекта](https://github.com/Ir4fin/graduation_project_api_reqres#%EF%B8%8F-%D1%81%D1%82%D0%B5%D0%BA-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B0)
- [Текущее тестовое покрытие](https://github.com/Ir4fin/graduation_project_api_reqres#%EF%B8%8F-%D1%82%D0%B5%D0%BA%D1%83%D1%89%D0%B5%D0%B5-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5-%D0%BF%D0%BE%D0%BA%D1%80%D1%8B%D1%82%D0%B8%D0%B5)
- [Запуск тестов](https://github.com/Ir4fin/graduation_project_api_reqres#-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2)
- [Проект в Allure TestOps](https://github.com/Ir4fin/graduation_project_api_reqres#keyboard-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82-%D0%B2-allure-testops)
- [Пример Allure-отчёта по пройденным тестам](https://github.com/Ir4fin/graduation_project_api_reqres#-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-allure-%D0%BE%D1%82%D1%87%D0%B5%D1%82%D0%B0-%D0%BF%D0%BE-%D0%BF%D1%80%D0%BE%D0%B9%D0%B4%D0%B5%D0%BD%D0%BD%D1%8B%D0%BC-%D1%82%D0%B5%D1%81%D1%82%D0%B0%D0%BC)
- [Уведомления](https://github.com/Ir4fin/graduation_project_api_reqres#telephone_receiver-%D1%83%D0%B2%D0%B5%D0%B4%D0%BE%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F)

## ⚙️ Стек проекта

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/Java.svg">
<img width="6%" title="Allure Report" src="images/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/Gradle.svg">
<img width="6%" title="GitHub" src="images/GitHub.svg">
<img width="6%" title="Jenkins" src="images/Jenkins.svg">
<img width="6%" title="Telegram" src="images/Telegram.svg">
<img width="6%" title="REST-Assured" src="images/19369327.png">
<img width="6%" title="Allure_TO" src="images/Allure_TO.svg">
</p>

## ▶️ Текущее тестовое покрытие

**API автотесты:**

:white_check_mark: Получение данных о существующих пользователях

:white_check_mark: Успешная регистрация

:white_check_mark: Попытка регистрации без email - проверка ошибки

:white_check_mark: Поиск несуществующего пользователя

Дополнительно в тестах применены модели Pojo и Lombok, спецификации вынесены в отдельный класс.

## 🧮 Запуск тестов

**Локально** 

Запуск всех тестов осуществляется командой в терминале

```bash  
gradle clean test
```

**Jenkins**

Для проекта сделана [сборка в Jenkins](https://jenkins.autotests.cloud/job/014-Ir4fin-%20graduation_project_api_reqres/) 

## 📊 Пример Allure-отчета по пройденным тестам

Для каждого теста отображаются данные, которые он отправляет посредством API.

![This is an image](https://github.com/Ir4fin/graduation_project_api_reqres/blob/main/images/Screenshot_3.jpg)

## :telephone_receiver: Уведомления

К проекту подключены уведомления в Telegram - после прохождения тестов в Jenkins бот присылает в чат результаты прогона.

![This is an image](https://github.com/Ir4fin/graduation_project_api_reqres/blob/main/images/Screenshot_14.jpg)



