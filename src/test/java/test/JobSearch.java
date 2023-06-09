package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class JobSearch extends TеstBase{

    @Test
    @DisplayName("Проверка перехода через вкладку Работа в IT")
    void tabWorkInIT() {

        step("Открытие страницы gradle clean", () -> {
            open("/career");
        });
        step("Нажимаем на вкладку Работа в IT", () -> {
            $(".cbdWmaCAy").$(byText("Работа в IT")).click();
        });
        step("Проверяем, что страница успешно открыта", () -> {
            $("[role=\"main\"]").shouldHave(text("Работа в ИТ Тинькофф"));
        });
    }

    @Test
    @DisplayName("Проверка перехода через вкладку Бизнес и процессы")
    void tabBusinessAndProcesses() {

        step("Открытие страницы Работа в Тинькофф", () -> {
            open("/career");
        });
        step("Нажимаем на вкладку Бизнес и процессы", () -> {
            $(".cbdWmaCAy").$(byText("Бизнес и процессы")).click();
        });
        step("Проверяем, что страница успешно открыта", () -> {
            $("[role=\"main\"]").shouldHave(text("Бизнес и процессы"));
        });
    }

    @Test
    @DisplayName("Проверка перехода через вкладку Работа с клиентами")
    void tabWorkingWithClients() {

        step("Открытие страницы Работа в Тинькофф", () -> {
            open("/career");
        });
        step("Нажимаем на вкладку Работа с клиентами", () -> {
            $(".cbdWmaCAy").$(byText("Работа с клиентами")).click();
        });
        step("Проверяем, что страница успешно открыта", () -> {
            $("[role=\"main\"]").shouldHave(text("Приходите работать в лучший онлайн-банк"));
        });
    }

    @Test
    @DisplayName("Проверка выбора в популярных специализациях Мобильная разработка")
    void choiceMobileDevelopment() {

        step("Открытие страницы Работа в ИТ Тинькофф", () -> {
            open("/career/it/about/");
        });
        step("Нажимаем кнопку Смотреть вакансии", () -> {
            $("[role=\"main\"]").$(byText("Смотреть вакансии")).click();
        });
        step("В поле Популярные специализации нажимаем на Android", () -> {
            $("[data-qa-type=\"atom-desktop-vacancy-tags\"]").$(byText("Android")).click();
        });
        step("Проверяем, что выбрана Мобильная разработка", () -> {
            $(".botPw2").shouldHave(text("Мобильная разработка"));
        });
    }

    @Test
    @DisplayName("Проверка перехода на страницу Митапы в Тинькофф")
    void pageMeetupInTinkoff() {

        step("Открытие страницы Работа в ИТ Тинькофф", () -> {
            open("/career/it/about/");
        });
        step("Нажимаем кнопку Смотреть вакансии", () -> {
            $("[role=\"main\"]").$(byText("Смотреть вакансии")).click();
        });
        step("Нажимаем кнопку Посмотреть митапы", () -> {
            $("[role=\"banner\"]").$(byText("Посмотреть митапы")).click();
        });
        step("Проверяем, что страница успешно открыта", () -> {
            $("[role=\"article\"]").shouldHave(text("Митапы в Тинькофф"));
        });
    }

    @Test
    @DisplayName("Выбор темы митапа на странице Митапы в Тинькофф")
    void topicSearch() {

        step("Открытие страницы Работа в ИТ Тинькофф", () -> {
            open("/career/it/about/");
        });
        step("Нажимаем кнопку Смотреть вакансии", () -> {
            $("[role=\"main\"]").$(byText("Смотреть вакансии")).click();
        });
        step("Нажимаем кнопку Посмотреть митапы", () -> {
            $("[role=\"banner\"]").$(byText("Посмотреть митапы")).click();
        });
        step("Указываем тему митапа через кнопку QA", () -> {
            $(".IndependentMeetupsSearch__keywordsContainer_GLPJi").$(byText("QA")).click();
        });
        step("Проверяем, что установлена тема митапа QA", () -> {
            $(".InputBox-module__box_qydX6").shouldHave(text("QA"));
        });
    }
}
