
public class LaunchBrowser {

	public static void main(String[] args){
		   //We need to point the chromedriver exe to the path of the executable
		   System.setProperty("webdriver.chrome.driver","/home/khadkasnareshgm/Downloads/chromedriver.exe");   
		   //Create an instance of ChromeDriver to launch chrome browser
		   ChromeDriver driver = new ChromeDriver();
		   //To navigate to the application url
		   driver.get("https://www.calculator.net/calorie-calculator.html");
		   
		}
}