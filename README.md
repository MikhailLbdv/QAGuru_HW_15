# Проект по автоматизации тестовых сценариев для страницы "Работа в Тинькофф"
____
## Содержание:

- Технологии и инструменты
- Тест-кейсы
- Команды для запуска из терминала
- Cборка в Jenkins
- Allure отчет
- Интеграция с Allure TestOps
- Интеграция с Jira
- Уведомления в Telegram с использованием бота
- Примеры видео выполнения тестов на Selenoid
____
## Технологии и инструменты:

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>
Тесты в данном проекте написаны на языке <code>Java</code>, сборщик - <code>Gradle</code>. Так же были использованы фреймворки <code>JUnit 5</code> и <code>Selenide</code>.
При прогоне тестов браузер запускается не локально, а в <code>Selenoid</code>.
Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота. Так же реализована интеграция с <code>Allure TestOps</code> и <code>Jira</code>.

____

## Тест-кейсы:
- *Проверка перехода через вкладку 'Работа в IT'*
- *Проверка перехода через вкладку 'Бизнес и процессы'*
- *Проверка перехода через вкладку 'Работа с клиентами'*
- *Проверка выбора в популярных специализациях Мобильная разработка*
- *Проверка перехода на страницу 'Митапы в Тинькофф'*
- *Выбор темы митапа на странице 'Митапы в Тинькофф'*

____

## Команды для запуска из терминала

***Локальный запуск:***
```bash  
gradle clean test
```

***Удалённый запуск через Jenkins:***
```bash  
clean test
-Dbrowser="${BROWSER}"
-DbrowserVersion="${BROWSERVERSION}"
-DbrowserSize="${BROWSERSIZE}"
-DbaseUrl="${BASEURL}"
-DselenoidUrl="${SELENOIDURL}"
```

____

## Сборка в Jenkins
<p align="center">  
<img src="images/screen/jenkins_dashboard.png" alt="Jenkins" width="950"/></a>  
</p>

____

## Allure отчет
### Основная страница
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/jenkins_overview.png" width="850"></a>  
</p>  

### *Тест-кейсы*
<p align="center">  
<img title="Allure Tests" src="images/screen/allure_tests.png" width="850">  
</p>

____

## Интеграция с Allure TestOps
### Dashboards

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/allure_overview.png" width="850">  
</p>

### Результат выполнения автотеста

<p align="center">  
<img title="Allure Tests" src="images/screen/tests.png" width="850">  
</p>

____

## Интеграция с Jira

<p align="center">  
<img title="Jira" src="images/screen/jira.png" width="">  
</p>

____

## Уведомления в Telegram с использованием бота

<p align="center">  
<img title="TG Bot" src="images/screen/telegram_bot.png" width="">  
</p>

____

## Примеры видео выполнения тестов на Selenoid

<p align="center">
<img title="Selenoid Video" src="images/video/d9fbc0991.gif" width="550" height="350"  alt="video">   
</p>