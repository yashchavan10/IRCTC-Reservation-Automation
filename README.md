# IRCTC-Reservation-Automation
This project automates the process of booking railway tickets on the IRCTC website using Python and Selenium. It streamlines the booking process by filling in the necessary details and navigating through the various steps required to complete a reservation.



<b>Prerequisites
Before you begin, ensure you have met the following requirements:</b>

Java Development Kit (JDK) installed on your machine. You can download it from [here: ](https://www.oracle.com/java/technologies/downloads/?er=221886)
<br />Eclipse IDE installed. You can download it from [here:](https://www.eclipse.org/downloads/packages/release/2022-09/r/eclipse-ide-java-developers)
<br />Maven installed. You can download it from [here: ](https://maven.apache.org/download.cgi)
<br /><br /><b>Running the Project</b>
<br />Open Eclipse IDE:
<br />Import the Maven project by selecting File -> Import -> Existing Maven Projects.
<br />Browse to the location of your project and click Finish.
<br />Run the Java Class:
<br />Right-click on IRCTCAutomation.java.
<br />Select Run As -> Java Application.
<br />The script will automatically navigate through the IRCTC website and perform the ticket booking process as per the given instructions.
<br /><br /><b>Notes</b>
<br />WebDriver Path: Ensure the path to the chromedriver.exe is correctly set in the System.setProperty("webdriver.chrome.driver", "C:\\webAutomation\\chromedriver.exe"); line.
<br /> Replace "username" and "password" with your own IRCTC credentials.
