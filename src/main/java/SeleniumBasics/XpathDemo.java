package SeleniumBasics;

public class XpathDemo {

	/*
	 * Xpath:
	 * XML Path
	 * it is the path to the element
	 * 
	 * Xpath are of 2 types:
	 * 1. Absolute XPath: it starts from the root(html tag)
	 * this is not recommended
	 * start with single slash /
	 * /html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
	 * 
	 * 
	 * html
	 * 	body
	 * 		div
	 * 		div
	 * 			input mobileNo
	 * 		div
	 * 			input username
	 * 		div
	 * 
	 * Abs Xpath of username field
	 *  /html/body/div[2]/input
	 * 
	 * 2. Relative XPath: it starts from the middle of the document(anywhere)
	 * this is recommended
	 * starts with double slash //
	 * 
	 * //*[@id="email"]
	 * 
	 * 1. Basic XPath
	 * Syntax:
	 *  //tagName[@attribute = 'value']
	 *  
	 *  input	id = email
	 *  div		id = email
	 *  
	 *  UserName:
	 *  //input[@id = 'email']
	 *  
	 *  //*[@id="pass"] - copied
	 *  
	 *  Functions
	 *  
	 *  
	 *  2. Contains()
	 *  
	 *  xpath = //htmltag[contains(@attribute, 'value')]
	 *  
	 *  log1
	 *  logn
	 *  log2
	 *  log3
	 *  login
	 *  
	 *  //button[@name = 'login']
	 *  //button[contains(@name, 'log')]
	 *  
	 *  u_0_5_tC
	 *  u_0_5_97
	 *  u_0_5_Gc
	 *  u_0_5_ik
	 *  Xpath for Login button using attribute ID
	 *  id
	 *  
	 *  
    //button[contains(@id, 'u_0_5_')]

	 *  
	 *  3. Using or & and
	 *  
	 *  Test Environments
	 *  Dev -  > developers work
	 *  QA - > Testing is performed
	 *  Pre Prod, UAT - > Client performs the UAT
	 *  Prod - actual live server
	 *  
	 *  QA: 
	 *  Button, name = login
	 *  
	 *  UAT:
	 *  Button, name = submit
	 *  
	 *  //button[@name = 'login']
	 *  on QA >> it will work
	 *  on UAT >> it will not work
	 *  
	 *  Common code
	 *  xpath = //button[@name = 'login' or @name = 'submit']
	 *  
	 *  starts-with
	 *  
	 *  id of a variable changes
	 *  id = message1
	 *  id = message2
	 *  id = message3
	 *  id = message4
	 *  For above case: 
	 *  xpath = //button[starts-with(@id, 'message')]
	 *  
	 *  id = message1
	 *  id = message2
	 *  id = 45message
	 *  id =  4message34
	 *  
	 * for this case
	 *  xpath = //button[contains(@id, 'message')]
	 *  
	 *  
	 *  4. Text()
	 *  //HTMLTag[text() = 'text_displayed']
	 *  
	 *  //a[text() = 'Forgotten password?']
	 *  
	 *  XPATH Axes Method
	 *  child
	 *  parent
	 *  
	 *  
	 *  div - with no attributes
	 *  	input - with id = name
	 *  
	 *  
	 *  //div[] - not possible as there are no attibutes
	 *  find the child and then I will get the parent of the child
	 *  
	 *  //input[@id= 'name']/parent::div
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 * 
	 * 
	 * 
	 */
}
