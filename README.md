# Проект по автоматизации тестирования сайта reqres.in
## 📑Содержание
- [Стек проекта](https://github.com/Ir4fin/graduation_project_api_reqres#%EF%B8%8F-%D1%81%D1%82%D0%B5%D0%BA-%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B0)
- [Текущее тестовое покрытие](https://github.com/Ir4fin/graduation_project_api_reqres#%EF%B8%8F-%D1%82%D0%B5%D0%BA%D1%83%D1%89%D0%B5%D0%B5-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2%D0%BE%D0%B5-%D0%BF%D0%BE%D0%BA%D1%80%D1%8B%D1%82%D0%B8%D0%B5)
- [Запуск тестов](https://github.com/Ir4fin/graduation_project_api_reqres#-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2)
- [Пример Allure-отчёта по пройденным тестам](https://github.com/Ir4fin/graduation_project_api_reqres#-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-allure-%D0%BE%D1%82%D1%87%D0%B5%D1%82%D0%B0-%D0%BF%D0%BE-%D0%BF%D1%80%D0%BE%D0%B9%D0%B4%D0%B5%D0%BD%D0%BD%D1%8B%D0%BC-%D1%82%D0%B5%D1%81%D1%82%D0%B0%D0%BC)
- [Уведомления](https://github.com/Ir4fin/graduation_project_api_reqres#telephone_receiver-%D1%83%D0%B2%D0%B5%D0%B4%D0%BE%D0%BC%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F)

## ⚙️ Стек проекта

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/Java.svg">
<img width="6%" title="Allure Report" src="images/Allure.svg">
<img width="6%" title="Gradle" src="images/Gradle.svg">
<img width="6%" title="GitHub" src="images/GitHub.svg">
<img width="6%" title="Jenkins" src="images/Jenkins.svg">
<img width="6%" title="Telegram" src="images/Telegram.svg">
<img width="6%" title="REST-Assured" src="images/Rest-Assured.svg">
</p>

## ▶️ Текущее тестовое покрытие

**API автотесты:**

:white_check_mark: Получение данных о существующих пользователях

:white_check_mark: Успешная регистрация

:white_check_mark: Попытка регистрации без email - проверка ошибки

:white_check_mark: Поиск несуществующего пользователя

Дополнительно в тестах применены модели Lombok, спецификации вынесены в отдельный класс.

## Запуск тестов

**Локально** 

Запуск всех тестов осуществляется командой в терминале

```bash  
gradle clean test
```

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/diplomAPI/">**Сборка в Jenkins**</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/diplomAPI/"><img src="images/JenkinsJob.png" alt="Jenkins"/></a>  
</p>


## <img src="images/Allure.svg" width="25" height="25"  alt="Allure"/></a> *Allure* <a target="_blank" href="https://jenkins.autotests.cloud/job/diplomAPI/3/allure/">*отчёт*</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/Allure_Report_Overview.png">  
</p>  

### *Тест кейсы*

<p align="center">  
<img title="Allure Tests" src="images/Test_cases.png">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/Allure_Graphs.png">  
</p>


## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> *Уведомление в Telegram при помощи Alert bot*
<p align="center">  
<img src="images/Telegram_bot.png">  
</p>

