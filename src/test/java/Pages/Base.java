package Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Base {

    WebDriver driver;
    public Actions action;

    public Base(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
