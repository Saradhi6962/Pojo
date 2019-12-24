package org.hexa;

import java.util.concurrent.TimeUnit;

public class Executable extends Base{

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("https://www.adactin.com/HotelApp/index.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Adactln a=new Adactln();
		
		getText(a.getUser().get(0), "Sarankesav");
		
		
		getText(a.getPass().get(0), "Idiot@6962");
		
		clik(a.getBtn());
		
		AdactIn1 a1=new AdactIn1();
		
		dropDown(a1.getDrop1(), "Melbourne");	
		
		dropDown(a1.getDrop2(), "Hotel Sunshine");
		
		dropDown(a1.getDrop3(), "Super Deluxe");
		
		dropDown(a1.getDrop4(), "1");
		
		
		
		dropDown(a1.getDrop7(), "1");
		
		dropDown(a1.getDrop8(), "3");
		
		clik(a1.getBtn1());
		
		Thread.sleep(3000);
		
		Adactln2 a2=new Adactln2();
		
		clik(a2.getRbtn());
		
		clik(a2.getCtn());
		
		Thread.sleep(3000);
		
		
		
		Adactln3 a3=new Adactln3();
		
		scrollDown(a3.getDown());
		
		Thread.sleep(5000);
				
		getText(a3.getFname(), "Saranya");
		
		getText(a3.getLname(), "Adhikesavan");
		
		getText(a3.getAddrs(), "Nookampalayam Rd, Nookampalayam, Arasankazhani, Sithalapakkam");
		
		getText(a3.getCard(), "2365478914589632");
		
		dropDown(a3.getCtype(), "VISA");
		
		dropDown(a3.getEmonth(), "4");
		
		dropDown(a3.getEyear(), "2022");
		
		getText(a3.getCvv(), "333");
		
		clik(a3.getBook());
		
		Thread.sleep(5000);
		
		Adactln4 a4=new Adactln4();
		
		
		clik(a4.getIt());
		
		
		
		
		
		
		
		
		
	}
}
