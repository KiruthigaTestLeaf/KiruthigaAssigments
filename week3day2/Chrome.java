package week3day2;

public class Chrome extends Browser{
	
	public void openIncognito() {
	
		System.out.println("openIncognito()");

	}
	public void clearCache() {
		
		System.out.println("clearCache()");
	}

	public static void main(String[] args) {

    Chrome browser1 = new Chrome();
    browser1.openURL();
    browser1.closeURL();
    browser1.navigateBack();
    browser1.openIncognito();
    browser1.clearCache();
    
    

	}

}
