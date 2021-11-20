/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TesteAutomacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String question = "Science: Computers"; // Variável para pesquisa 
    
    File file = new File("C:\\Users\\David\\Downloads\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); //Especifica o driver de navegação
    WebDriver driver = new ChromeDriver(); //Iniciando driver de navegação
    driver.get("https://opentdb.com/browse.php");// Link para busca 
    
    driver.findElement(By.id("query")).sendKeys(question);//Selecionar a label de pesquisa pelo ID
    driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button")).click();//Selecionar botão pelo caminho xpath
    driver.close();//Fechar o driver após a execução das atividades
    }
    
}
