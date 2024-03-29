package com.fidexio.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {



     /*
    Creating a private constructor, so we are closing access to the object
     of this class from outside the clas
     */

    private Driver(){}

    /*
    We make WebDriver private, because we want to close access from
    outside the class.
    We make it static because we will use it in a static method.
     */

    // private static WebDriver driver;  // value is null by default //day 18 degistirdik

    //day 18 yukarudakinin yerine bu assagidakini yazdik
    private  static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    /*
    Create a re-usable utility method which will return same driver instance
    when we call it
     */

    public static WebDriver getDriver(){

        if (driverPool.get() == null){  //day 18--driver == null--> bu yaziyordi--parantez in cini de degistirdik

            /*
            We read browserType from configuration.properties.
            This way, we can control which browser is opened from outside our code,
            from configuration.properties
             */

            String browserType = ConfigurationReader.getProperty("browser");
            /*
             bu yukarida ki nin karsiligini configuratio.properties de olusturduk
             oraya gidip karsiligini bulup geliyor haci zrolama fazla anladin sen
             buraya sadece "browser" yaziyoruz
             cünkü configuratio.properties 'de karsiligi ne ise onu bulup gelecek cannnneeeimmm
             --sonra chrome yazili ise karsisinda;
                    assagida ki 1. case bulacak ve onun icine girecek orada ki görevleri yerine getirecek
            ama Driver ' i bundan sonra her cagirdigimizda bu döngügü takip  etmiyecek
            cünkü artik (Driver != null) yani artik direkt return yapacak ilk belirlenmis driver 'i cagiracak
                   cünkü artik browser chrome olarak tanindi

             */

            /*
            Depending on the browserType that will be return from configuration.properties file
            switch statement will determine the case, and open the matching browser
             */

            switch (browserType){
                case "chrome":
                   WebDriverManager.chromedriver().setup();
                   // ChromeOptions options = new ChromeOptions();  // bu ve bundan sonra satir dil ayari
                  //  options.addArguments("--lang=en");
                    driverPool.set(new ChromeDriver()); // yerine-->  driver = new ChromeDriver();
                    driverPool.get().manage().window().maximize(); // sadece driver. yaziyordu onu yerine
                    driverPool.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// sadece driver. yaziyordu onu yerine
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    break;
            }

        }
        return driverPool.get();
    }

    // This method will make sure our driver value is always null after using quit() method
    public static void closeDriver(){
        if (driverPool.get() != null){
            driverPool.get().quit();  // this line will terminate the existing session. value will not even be null
            driverPool.remove();
        }
    }

/**
 * yani anliyacagin kardesim buranin eski hali ile kiyaslama yapmak istersen day 18 den
 * önceki günlere git bak kiyasla  :)))
 */


}
