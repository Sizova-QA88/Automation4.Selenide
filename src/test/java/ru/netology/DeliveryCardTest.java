package ru.netology;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class DeliveryCardTest {
    @Test
    public void orderCardDelivery() {
        open("http://localhost:9999");
        //$("[город?]").setValue("Дагестан");
        //$("[дата?]").click();
        $("['data-test-id=name']").setValue("Бурлакова Фрося");
        $("['data-test-id=phone']").setValue("+79997771122");
        $("['data-test-id=agreement']").click();
        $("button").click();
        $(withText("Успешно!")).shouldBe(visible, Duration.ofSeconds(15));
    }
}