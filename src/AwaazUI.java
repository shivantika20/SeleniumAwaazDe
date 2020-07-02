import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AwaazUI {

    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/shivantika.t/Downloads/chromedriver");
        ChromeOptions options = new ChromeOptions();

        //Disabling the warnings
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Opening the Browser
        driver.get("http://weathershopper.pythonanywhere.com/");
        WebElement temperature = driver.findElement(By.xpath("//span[@id='temperature']"));
        //get the temperature
        String temp = temperature.getText();
        //Converting the temperature to integer
        temp = temp.substring(0, temp.length() - 2);
        temp = temp.trim();
        int Temp = Integer.parseInt(temp);
        System.out.println("Current Temperature is: " + Temp);
        Thread.sleep(1000);
        //Checking the temperature
        if (Temp < 19) {
            driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            Thread.sleep(3000);
            int minPriceAloe = 999, minPriceAlmond = 999;
            WebElement clickAbleAloe = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
            WebElement clickAbleAlmond = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
            String titleAloe = "", titleAlmond = "";
            String title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray[] = title.split(" ");
            for (int i = 0; i < titleArray.length; i++) {
                if (titleArray[i].equalsIgnoreCase("Aloe")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    minPriceAloe = price;
                    clickAbleAloe = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
                    titleAloe = title;
                } else if (titleArray[i].equalsIgnoreCase("Almond")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    minPriceAlmond = price;
                    clickAbleAlmond = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
                    titleAlmond = title;
                }
            }

            title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray1[] = title.split(" ");
            for (int i = 0; i < titleArray1.length; i++) {
                if (titleArray1[i].equalsIgnoreCase("Aloe")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAloe) {
                        minPriceAloe = price;
                        clickAbleAloe = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button"));
                        titleAloe = title;
                    }
                } else if (titleArray1[i].equalsIgnoreCase("Almond")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAlmond) {
                        minPriceAlmond = price;
                        clickAbleAlmond = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button"));
                        titleAlmond = title;
                    }
                }
            }

            title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray2[] = title.split(" ");
            for (int i = 0; i < titleArray2.length; i++) {
                if (titleArray2[i].equalsIgnoreCase("Aloe")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAloe) {
                        minPriceAloe = price;
                        clickAbleAloe = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/button"));
                        titleAloe = title;
                    }
                } else if (titleArray2[i].equalsIgnoreCase("Almond")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAlmond) {
                        minPriceAlmond = price;
                        clickAbleAlmond = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/button"));
                        titleAlmond = title;
                    }
                }
            }
            title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray3[] = title.split(" ");
            for (int i = 0; i < titleArray3.length; i++) {
                if (titleArray3[i].equalsIgnoreCase("Aloe")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAloe) {
                        minPriceAloe = price;
                        clickAbleAloe = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/button"));
                        titleAloe = title;
                    }
                } else if (titleArray3[i].equalsIgnoreCase("Almond")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAlmond) {
                        minPriceAlmond = price;
                        clickAbleAlmond = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/button"));
                        titleAlmond = title;
                    }
                }
            }
            title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray4[] = title.split(" ");
            for (int i = 0; i < titleArray4.length; i++) {
                if (titleArray4[i].equalsIgnoreCase("Aloe")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAloe) {
                        minPriceAloe = price;
                        clickAbleAloe = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
                        titleAloe = title;
                    }
                } else if (titleArray4[i].equalsIgnoreCase("Almond")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAlmond) {
                        minPriceAlmond = price;
                        clickAbleAlmond = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
                        titleAlmond = title;
                    }
                }
            }
            title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray5[] = title.split(" ");
            for (int i = 0; i < titleArray5.length; i++) {
                if (titleArray5[i].equalsIgnoreCase("Aloe")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAloe) {
                        minPriceAloe = price;
                        clickAbleAloe = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/button"));
                        titleAloe = title;
                    }
                } else if (titleArray5[i].equalsIgnoreCase("Almond")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceAlmond) {
                        minPriceAlmond = price;
                        clickAbleAlmond = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/button"));
                        titleAlmond = title;
                    }
                }
            }
            clickAbleAlmond.click();
            clickAbleAloe.click();
            driver.findElement(By.xpath("//button[@onclick='goToCart()']")).click();
            Cart(titleAloe, titleAlmond);
        } else {
            driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/a/button")).click();
            Thread.sleep(3000);
            int minPriceSPF30 = 999, minPriceSPF50 = 999;
            WebElement clickAbleSPF30 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
            WebElement clickAbleSPF50 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
            ;
            String titleSPF30 = "", titleSPF50 = "";
            String title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray[] = title.split(" ");
            for (int i = 0; i < titleArray.length; i++) {
                if (titleArray[i].equalsIgnoreCase("SPF-30")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    minPriceSPF30 = price;
                    clickAbleSPF30 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
                    titleSPF30 = title;
                } else if (titleArray[i].equalsIgnoreCase("SPF-50")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    minPriceSPF50 = price;
                    clickAbleSPF50 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/button"));
                    titleSPF50 = title;
                }
            }

            title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray1[] = title.split(" ");
            for (int i = 0; i < titleArray1.length; i++) {
                if (titleArray1[i].equalsIgnoreCase("SPF-30")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF30) {
                        minPriceSPF30 = price;
                        clickAbleSPF30 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button"));
                        titleSPF30 = title;
                    }
                } else if (titleArray1[i].equalsIgnoreCase("SPF-50")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF50) {
                        minPriceSPF50 = price;
                        clickAbleSPF50 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button"));
                        titleSPF50 = title;
                    }
                }
            }

            title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray2[] = title.split(" ");
            for (int i = 0; i < titleArray2.length; i++) {
                if (titleArray2[i].equalsIgnoreCase("SPF-30")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF30) {
                        minPriceSPF30 = price;
                        clickAbleSPF30 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/button"));
                        titleSPF30 = title;
                    }
                } else if (titleArray2[i].equalsIgnoreCase("SPF-50")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF50) {
                        minPriceSPF50 = price;
                        clickAbleSPF50 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/button"));
                        titleSPF50 = title;
                    }
                }
            }
            title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray3[] = title.split(" ");
            for (int i = 0; i < titleArray3.length; i++) {
                if (titleArray3[i].equalsIgnoreCase("SPF-30")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF30) {
                        minPriceSPF30 = price;
                        clickAbleSPF30 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/button"));
                        titleSPF30 = title;
                    }
                } else if (titleArray3[i].equalsIgnoreCase("SPF-50")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF50) {
                        minPriceSPF50 = price;
                        clickAbleSPF50 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/button"));
                        titleSPF50 = title;
                    }
                }
            }
            title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray4[] = title.split(" ");
            for (int i = 0; i < titleArray4.length; i++) {
                if (titleArray4[i].equalsIgnoreCase("SPF-30")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF30) {
                        minPriceSPF30 = price;
                        clickAbleSPF30 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
                        titleSPF30 = title;
                    }
                } else if (titleArray4[i].equalsIgnoreCase("SPF-50")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF50) {
                        minPriceSPF50 = price;
                        clickAbleSPF50 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button"));
                        titleSPF50 = title;
                    }
                }
            }
            title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[1]")).getText();
            System.out.println(title);
            //To check if aloe is there
            String titleArray5[] = title.split(" ");
            for (int i = 0; i < titleArray5.length; i++) {
                if (titleArray5[i].equalsIgnoreCase("SPF-30")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF30) {
                        minPriceSPF30 = price;
                        clickAbleSPF30 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/button"));
                        titleSPF30 = title;
                    }
                } else if (titleArray5[i].equalsIgnoreCase("SPF-50")) {
                    String priceText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/p[2]")).getText();
                    String priceArray[] = priceText.split(" ");
                    //Converting price in integer
                    int price = Integer.parseInt(priceArray[priceArray.length - 1]);
                    if (price < minPriceSPF50) {
                        minPriceSPF50 = price;
                        clickAbleSPF50 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/button"));
                        titleSPF50 = title;
                    }
                }
            }
            clickAbleSPF30.click();
            clickAbleSPF50.click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@onclick='goToCart()']")).click();
            Cart(titleSPF30, titleSPF50);
        }
    }

    public static void Cart(String title1, String title2) throws InterruptedException {
        String p1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr[1]/td[1]")).getText();
        String p2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr[2]/td[1]")).getText();
        if (!(p1.equals(title1) || p1.equals(title2)) && !(p2.equals(title1) || p2.equals(title2))) {
            System.out.println("Error");
        } else {
            driver.findElement(By.xpath("html/body/div[1]/div[3]/form/button/span")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/section/span[2]/div/div/main/form/div/div/div/div/div/div[1]/div[1]/div/div/div/fieldset/span/div/div[1]/input")).sendKeys("abc@gmail.com");
            driver.findElement(By.xpath("/html/body/div[2]/section/span[2]/div/div/main/form/div/div/div/div/div/div[1]/div[2]/fieldset/div[1]/div[1]/span/span[1]/div/div[1]/input]")).sendKeys("3566000020000410");
            driver.findElement(By.xpath("/html/body/div[2]/section/span[2]/div/div/main/form/div/div/div/div/div/div[1]/div[2]/fieldset/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("02/23");
            driver.findElement(By.xpath("/html/body/div[2]/section/span[2]/div/div/main/form/div/div/div/div/div/div[1]/div[2]/fieldset/div[1]/div[2]/div[2]/div[1]/input")).sendKeys("123");
            driver.findElement(By.xpath("/html/body/div[2]/section/span[2]/div/div/main/form/nav/div/div/div/button")).click();
        }
    }
}


