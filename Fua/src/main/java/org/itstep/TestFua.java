package org.itstep;

import java.util.concurrent.TimeUnit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;



public class TestFua {

	//private static final FirefoxBinary PATH_TO_FIREFOX_BINARY = null;
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver",  "C:\\Users\\geckodriver.exe");
	//System.setProperty("webdriver.opera.driver",  "C:\\Users\\operadriver.exe");
	
	      driver = new ChromeDriver();
		  //driver = new FirefoxDriver();
	      //driver = new OperaDriver();
	
	//FirefoxOptions option = new FirefoxOptions(); 
	//option.setBinary(PATH_TO_FIREFOX_BINARY);
	//driver = new FirefoxDriver(option);
	
	//OperaOptions options = new OperaOptions(); 
	//options.setBinary("PATH_TO_OPERA_BINARY ");
	//driver = new OperaDriver(options);
	
    
	driver.manage(). timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver. manage().window().maximize();
    driver.get("https://www.f.ua/");
    
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testFua() {
		//Код создания авторизации:
		
		//WebElement enter = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div[2]/a"));
        //enter.click();
        
        //WebElement creatprofil = driver.findElement(By.xpath( " //*[@id=\"user_auth_form\"]/div[3]/ul/li[2]/a "));
        //creatprofil.click();
         
        //WebElement nameInput = driver.findElement(By.xpath(" //*[@id=\"register_form\"]/div[1]/div[2]/input "));
        //nameInput.sendKeys("Vier ");
        
        //WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[2]/div[2]/input"));
        //emailInput.sendKeys("profvter@meta.ua");
        
        //WebElement password = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[3]/div[2]/div[2]/input"));
        //password.sendKeys("AUF123");
        
        //WebElement passwordYet = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[3]/div[3]/div[2]/input "));
        //passwordYet.sendKeys("AUF123" );
        
        //WebElement confirmReseiptProfil = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[5]/input"));
        //confirmReseiptProfil.submit();
		
		//Авторизированный вход. после реализации данного кода осуществляющий вход, дальнейшие действия отказываются выполняться.
		//Код авторизированного входа на сайт:
        
        //WebElement enter1 = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div[2]/a"));
        //enter1.click();
        
        //WebElement enterEmailProfil = driver.findElement(By.xpath("//*[@id=\"user_auth_form\"]/div[1]/div[2]/input"));
        //enterEmailProfil.sendKeys("profvter@meta.ua ");
        
        //WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"user_auth_form\"]/div[2]/div[2]/input"));
        //enterPassword.sendKeys("AUF123");
        
        //WebElement buttonSend = driver.findElement(By.xpath("//*[@id=\"user_auth_form\"]/div[3]/input"));
        //buttonSend.submit(); //
        
        //код выбора товара без авторизации; ссыллочные переменные itTECH1/2/3/ являются как варианты к использованию. 
        
        WebElement itTECH1 = driver.findElement(By.className("item_container"));
        itTECH1.click();
        
        //WebElement itTECH2 = driver.findElement(By.xpath("//*[@id=\"ga-master-id\"]/div[2]/nav/div/div/table/tbody/tr/td[1]/div/a/b/i"));
        //itTECH2.click();                                                 
        
        //WebElement itTECH3 = driver.findElement(By.xpath("//*[@id=\"ga-master-id\"]/div[2]/nav/div/div/table/tbody/tr/td[1]/div/a "));
        //itTECH3.click();
        
        
        WebElement mobTel = driver.findElement(By.xpath(" //*[@id=\"show_subcategory_262\"]/div/div[2]/a/img"));
        mobTel.click();
        
        WebElement selectBrend1 = driver.findElement(By.xpath("//*[@id='filters_main']/div[3]/div[1]"));
        selectBrend1.click(); //выбор брэнда. 
        
        //WebElement designateBrendSamsung1 = driver.findElement(By.xpath(" //*[@id=\"filters_main\"]/div[3]/ul/li[50]/div[1]/label/a"));
        //designateBrendSamsung1.click();
        
        WebElement designateBrendSamsung2 = driver.findElement(By.xpath(" //*[@id=\"brand_samsung\"] "));
        designateBrendSamsung2.click();//выбор производителя. работает при неавторизированном входе. могут работать как и не работать designateBrendSamsung1 и designateBrendSamsung3.		
        
        //WebElement designateBrendSamsung3 = driver.findElement(By.id(" brand_samsung"));
        //designateBrendSamsung3.click();
        
        WebElement screenDiagonal = driver.findElement(By.xpath("//*[@id=\"prop_8973_5\"]"));
        screenDiagonal.click();
        
        WebElement search =  driver.findElement(By.xpath("//*[@id=\"catalog_filter_form\"]/div[2]/input"));
        search.click();
        
        //WebElement galaxyJ6 = driver.findElement(By.xpath(" //*[@id=\"item_5544874\"]/div/div/div[5]/a"));
        //galaxyJ6.click(); //бывает, что код с акционными модели не всегда работает. данная модель неакционная. код резервный.
        
        WebElement galaxyA6 = driver.findElement(By.xpath( "//*[@id=\"item_5564320\"]/div/div/div[5]/a " ));
        galaxyA6.click(); 
        
        //WebElement wantGalaxyA6 = driver.findElement(By.xpath("//*[@id=\"ga-master-id\"]/div[2]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div[10]/a"));
        //wantGalaxyA6.click(); //является рабочим вариантом для кнопки "хочу". возможно рабочими будут следующие строки с ссылочной переменной wantGalaxy
        
        //WebElement wantGalaxy = driver.findElement(By.xpath("//*[@id=\"ga-master-id\"]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[3]/div[1]/div[2]/div[10]/a"));
        //wantGalaxy.click(); //резервный рабочий код для кнопки "хочу".
        
        WebElement wantGalaxyX = driver.findElement(By.xpath("//*[@id=\"ga-master-id\"]/div[2]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[10]/a " ));
        wantGalaxyX.click(); //резервный рабочий код для кнопки "хочу".

        //WebElement toBoock = driver.findElement(By.xpath(" //*[@id=\"ga-master-id\"]/div[2]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[3]/div[1]/ul/li[2]/a "));
        //toBoock.click();//код добавления в закладки, выполняется непредсказуемо.
        
	}
}
             
	
	


	
	
	
	
	
	
	