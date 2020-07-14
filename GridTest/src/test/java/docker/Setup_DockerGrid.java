package docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_DockerGrid {
	
  @BeforeTest
  public void startDockerGrid() {

		try {
			Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	
  }
  
  @AfterTest
  public void stopDockerGrid() {

		try {
			Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	
	}
	  
  }

