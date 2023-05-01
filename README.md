# Проект по автоматизации тестовых сценариев для страницы "Работа в Тинькофф"
## Содержание:
____
- Технологии и инструменты
- Тест-кейсы
- Cборка в Jenkins
- Запуск из терминала
- Allure отчет
- Интеграция с Allure TestOps
- Интеграция с Jira
- Уведомление в Telegram при помощи бота
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
___
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
<a href="https://jenkins.autotests.cloud/job/QAGuru_HW_15/"><img src="images/screen/jenkins_dashboard.png" alt="Jenkins" width="950"/></a>  
</p>

____

## Allure отчет
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/QAGuru_HW_15/5/allure/"><img title="Allure Overview Dashboard" src="images/screen/jenkins_overview.png" width="850">  
</p>  
