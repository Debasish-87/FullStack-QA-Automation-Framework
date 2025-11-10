package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // Disable Chrome popups / password prompts
        options.addArguments("--disable-features=PasswordManagerOnboarding,PasswordManagerUI,CredentialProviderExtension");
        options.addArguments("--password-store=basic");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--no-first-run");
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        // ✅ HEADLESS Mode for CI/CD (GitHub Actions / Jenkins / Docker)
        if (System.getProperty("headless", "false").equalsIgnoreCase("true")) {
            options.addArguments("--headless=new"); // new stable headless mode (Chrome 109+)
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--no-sandbox");
            options.addArguments("--window-size=1920,1080");
        } else {
            // Normal full UI mode when running locally
            options.addArguments("--start-maximized");
        }

        driver.set(new ChromeDriver(options));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
