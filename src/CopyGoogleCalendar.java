import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CopyGoogleCalendar {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Устанавливаем настройки Selenide
        Configuration.browser = "chrome";


        open("https://www.google.com"); /** открываем браузер Google.com*/
        $(By.xpath("//a[text()='Почта']")).click(); /** Нажать кнопку 'Почта' */
    }
}