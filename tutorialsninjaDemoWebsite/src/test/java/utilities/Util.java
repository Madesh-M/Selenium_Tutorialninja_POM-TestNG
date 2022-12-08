package utilities;

public class Util {
	public static final String FIREFOX_PATH = "D:\\Tools\\GeckoDriver\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe";
	public static final String CHROME_PATH="D:\\Tools\\ChromeDriver\\chromedriver_win32\\chromedriver.exe";
	
	public static final String BASE_URL = "http://tutorialsninja.com/demo/index.php?route=common/home";
	public static final String LOGIN_URL="http://tutorialsninja.com/demo/index.php?route=account/login";
    
	// Time to wait when searching for a GUI element 
	public static final int WAIT_TIME = 2000; 
											

	//FirstName and LastName with Email as Firstname.Lastname@gmail.com
		public static final String FIRST_NAME="madara";
		public static final String LAST_NAME="uchiha";
		public static final String EMAIL=FIRST_NAME.concat(".").concat(LAST_NAME).concat("@gmail.com");
		
	//Password and confirm password
		public static final String PASSWORD="Madara@123";
		
	//telephone
		public static final String PHONE="9874563210";
		
    //method to choose between login and register
	
}
