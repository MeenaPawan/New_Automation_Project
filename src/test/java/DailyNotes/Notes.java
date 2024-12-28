package DailyNotes;

public class Notes 
 {
	/* Manual -Done
	Sql -Done
	API -Done
	J meter -Done
	Jira -Done
	Java --  95 % Done 
	Automation -- WIP 

	Mobile Testing 
	Project 
	Profile and Resume Creation 

	========================================================

	feature ABC [Dev : 3 QA : 2]

	QA -- Test case --- 20 TC 

	-- peer review --- 25 TC 
	-- PO Meeting review --- 25 TC 

	----Testing Start 
	bug raise -- subbug --- Retest -- resolved  ---

	Testing -- Ready for demo --- Done 

	==============================================

	PO Meeting --- 25 TC --- 2 Regression 3 Critical Regression == 5 TC 

	Release 12.4.0 ---
	Code fridge --Regression Testing  --  Main Relese 

	12.4.1 ---- point release 
	code fridege --Critical Regression Suite -- release 


	---Automation Testing -------
	Testing any application feature with the help of Automation Tool 

	Tool :
	protector
	Appium  --- mobile Automation
	Selenium
	Sahi
	Sahi pro
	Ranorex 

	Manual Testing Disadvantage :
	----------------------
	1. required more resources 
	2.crossBrowser Testing time consuming and its difficult to test--- 10 min * 3 Browser == 30 min 
	3.Regression Test -- time consuming 
	4.Test cycle duration --increase 

	Advantages of Automation Test :
	---------------------
	1. Required less resources 
	2. crossbrowser testing Regresion Testing -- required less time 
	3. Test cycle duration - decrease 


	-------============----------------

	Why Selenium ?

	1. Open source tool -- No Licence required 
	2. Support multiple languages -- C# ,Java ,Pearl ,Ruby ,Python .....
	3.Support multiple O. S.
	4.Crossbrpwser testing is easy to implimate 

	Disadvantage :
	------------

	1.Selenium only automate Web Application .can not automate 
	Desktop or Stadalone Applicatin EX.Calculator

	2.we can not automate Captcha and Barcode 
	3.File Upload and download task we can not implimante using selenium 
	  Third party tool -AutoIT

	4.We can not perform Adhoc Testing 

	======================================================

	Selenium WebDriver Arch 

	SearchContext(I) -extends--WebDriver (I)--implements--RemoteWebDriver (C)
	-extends--ChromiumDriver -extends -ChromeDriver/EdgeDriver...

	=========================================================
	Navigation :

	        driver.navigate().to("https://demo.guru99.com/popup.php");
			
			driver.navigate().back();
			
			Thread.sleep(5000); // 5 sec
			driver.navigate().forward();
			
			Thread.sleep(5000); // 5 sec
			driver.navigate().refresh();

	diffrence between get ("") and navigate ().to("")

	get() : used to navigate particular URL .it waits till URL load

	Navigate() : used to navigate particluar URL .it does not wait 
	           Maintain Browser history --- we can navigate Back ,Forward ,refresh 
	           

	diffrence close() and quit() method

	close() -- close current browser open window
	quit() -close current as well as open browser window 

	====================================================
	WebElement : 

	Anything on Webpage --WebElement 

	text field 
	Button
	link
	Image
	checkbox
	Radio Button 
	DropDown 

	Locators :
	----------------
	we can identify the WebElement 

	8 Types of Locators 

	1.ID

	WebElement element=driver.findElement(By.id("id value"));

	2.Name
	3.Tagname
	4.Css Selector
	5.Xpath 
	6.linktext
	7.partial link text
	8.ClassName 

	DOM -Document Object model 

	WebElement element=driver.findElement(By.id("id value"));

	Automate : Registration page using Name Locator 

	Url : https://demo.guru99.com/test/newtours/register.php

	====================================
	Xpath Locator : 

	1.Tagname -- anything after < --- ex. <input ,<li ,<a
	2 .attribute name
	attribute value

	attribute name="attribute value"
	ex . name="phone"

	3.
	text   --- >define<
	 ex. >Forgotten password?<


	Absolute Xpath : (/)
	--------------------
	navigation start from parent node --- immidiate child node ---element 

	WebElement email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	email.sendKeys("Test");

	WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
	password.sendKeys("12345678");

	DisAdvantages : 
	1. UI changes -- Xpath expression collapse -- No such Element exception
	2.Lengthly expression -- difficult to maintain 

	=========================
	Relative XPath (//)

	Navigate parent to any child / Child node -- identify 

	Xpath By Attribute 
	---------------------
	1. Attribute name="Attribute value"
	------------------------
	<.... ---Tagname 

	//tagname[@Attribute name='attribute value']

	//input[@id='email']
	//input[@id='pass']

	WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	WebElement element=driver.findElement(By.xpath("//tagname[@Attribute name='attribute value']"));

	=============================
	2.Xpath By text() 

	>define<

	//tagname[text()='text value']

	//a[text()='Forgotten password?']

	WebElement element=driver.findElement(By.xpath("//tagname[text()='text value']"));

	WebElement FP=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	FP.click();

	==========================================

	Xpath By Contains():

	id="test_456"

	//tagname[contains(@attributename,'partail value static')]

	WebElement element=driver.findElement(By.xpath("//tagname[contains(@attributename,'partail value static')]"));
	element.click();

	//tagname[contains(text(),'partial text value')]

	WebElement element=driver.findElement(By.xpath("//tagname[contains(text(),'partial text value')]"));

	Xpath By Index :

	(xpath Expression)[index]
	driver.findElement(By.xpath("(xpath Expression)[index]"));

	WebElement surname=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	==================

	List<WebElement> element=driver.findElements(By.xpath("//input[@type='text']"));

	element.get(1);
	element.get(2);

	================================================
	How to handle Drop Down in selenium 
	---------------------
	WebElement ---DropDown ----tagname --select

	Select Class

	WebElement element=driver.findElement(By.xpath("xpath Expression"));
	Select drophandle=new Select(element);

	drophandle.selectByIndex(5); //
	drophandle.selectByvalue("");
	drophandle.selectByVisibletext("");

	==================================================
	How to capture screenshot 

	full page screenshot

	WebDriver driver=new ChromeDriver();

	TakesScreenshot ts=(TakesScreenshot)driver;

	ChromeDriver driver=new ChromeDriver();

	TakesScreenshot ts=driver;
	File src=ts.getscreenshotAs(outputType.File);
	File destn=new File("location//test.png");
	FileUtils.copyfile(src,destn);


	WebElement/Section Screenshot

	WebElement element=driver.findElement(By.xpath("xpath expression"));
	File src=element.getscreenshotAs(outputType.file);
	File destn=new File("location\\logo.png");
	FileUtils.copyfile(src,destn);

	========================================
	Actions class 

	mouse movement /keyboard  --- Actions 

	elemement + mouseHover +click +options 

	element +right click + options 

	double click element 

	drag and drop 

	capital letters --- Shift + data + Shift 

	Copy paste -- Ctrl +a /ctrl +c /ctrl +v


	Actions act=new Actions(driver);

	act.moveToElement(element).click().build().perform();

	==============
	Drag and drop 

	Actions act=new Actions(driver);
	WebElement element =driver.findELement(By.xpath(""));
	WebElement traget =driver.findELement(By.xpath(""));

	act.DragandDrop(element,traget).build().perform();

	Actions --- keyboard Action perform 

	element -- upper case data send -- keyboard 

	KeyDown()
	KeyUp()

	Scenario : Send value to ELement in Upper case using Actions class

	Actions act=new Actions(driver);

	act.KeyDown(elemet,Keys.SHIFT).sendkeys("test").keyUp(Keys.SHIFT).build().perform();
	==================================================
	How to Handle Alert :

	Alert Interface : 

	3 Types :
	Simple Alert :
	warning message --- OK button 
	Prompt Alert :

	user input accept -- sendkeys();

	Confirmation Alert :

	confimation message --- action perform -OK/Cancel

	Alert alt=driver.switchto().alert();

	alt.accept(); // ok button
	alt.dismiss(); // Cancel Button
	alt.gettext(); // Alert text 
	alt.sendkeys("Alert input"); //

	=============================================
	Child Browser window Handle :

	String parentID=driver.getwindowhandle(); returntype-string// provide parent window ID/Address
	Set<String> ALLID=driver.getwindowhandles(); set<String> // provide parent +child window ID/Address

	List<String> list=new ArrayList<String>(ALLID);
	list.get(0); // parent id
	list.get(1); // child window id

	driver.switchto().window(list.get(1));

	driver.switchto().window(parentID);

	============================================================
	Scrolling :

	Pixel 
	Element

	JavaScriptEXecutor js =driver;

	//Top-bottom
	js.executeScript("window.scrollBy(0,400)","");

	//bottom-top
	js.executeScript("window.scrollBy(0,-400)","");

	============================================
	Element
	WebElement element=driver.findElement(By.xpath(""));
	js.executeScript("arguments[0].scrollIntoView();",element);

	========================================

	How to read test data from Excel
	------------
	1. Apache Poi -jar 
	2. Project add -Excel 
	3. String RefVar ="Location";
	   FileInputStream fis=new FileInputStream(RefVar);
	   XSSFWorkBook WB=new XSSFWorkBook(fis);
	   String Data=WB.getsheet("Sheet1").getrow(0).getcell(0).getstringcellvalue();
	   
	==============================================

	webpage =Frame /Iframe 

	frame : UI devloper split screen horizantially and vertically framset

	HTML 5 : deprecated frame and frameset tag 

	Iframe : Webpage -- diffrent resouces content display 

	Mainpage --->Frame 1
	driver.switchto().frame(); // WebElement/Id or name/index

	Frame1 ---->Mainpage
	driver.switchto().deafultcontent();

	mainpage -->Frame2
	driver.switchto().frame(); // WebElement/Id or name/index
	==============================================
	TestNG - Test Next genration

	Test Management tool / TestNG Framework 

	1. class -10 TC --  12 Classes -120 TC --- Testng.xml -runner file 
	2. multiple  annotation -- @Before @After @Test @parameters 
	3. provides multiple keywords 
	   priority 
	   Inocationcount=3
	   enabled=false
	   dependsonmethods 
	  
	  100 --- 60 Regression - 40 Critical regression 
	  execute -- 60 / 40

	5. groups ---> 
	6.Testng.xml -runner file 
	  exclude /include 
	7.result of an operation verify -- Assert
	8. Report genration -- emailable report/ Index.html 

	=================================================
	annotation :
	metadata -- provide --- jvm /compiler

	 @BeforeSuite
	 @BeforeTest
	 @BeforeClass
	 @BeforeMethod
	 @Test
	 @AfterMethod
	 @AfterClass
	 @AfterTest
	 @AfterSuite

	------------------------------

	Assert (Hard Assert)
	------------------
	TestNG class
	Result of an operation verify - Assert 

	Assert.assertequals(actual,expected);

	Soft Assert (Verify)
	---------------------------
	Result of an operation verify - Soft Assert

	SoftAssert --class

	we need to create object of SoftAssert class

	SoftAssert soft=new SoftAssert();
	 
	 soft.assertequals(actual,Expected);
	 ==============================================
	 Git --- Versi0n control system tool

	Github -- Repository 

	Download git ?
	------------------------
	https://git-scm.com/downloads?ref=devkoriel

	Url Project : https://github.com/GovindPatil75/Batch_26_27_AutomationProject.git

	Clone -- Local system -- import -Eclipse --- Project Script 

	git bash cmd
	----------------
	git clone ProjectUrl 

	Jira Assign TC001 - Script 

	git branch BranchName
	git checkout Branchname
	git pull origin master
	git branch

	Switch ---

	Script write --->


	git add .
	git commit -m "Message"
	git push origin Branchname

	-----> 

	Raise Pull request -- PR 
	Add reviewer --Code -- approve
	merge localbranch--->Master

	================================
	*/ 
}

