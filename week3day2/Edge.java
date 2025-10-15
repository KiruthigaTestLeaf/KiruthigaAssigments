package week3day2;

public class Edge extends Chrome {
	public void takeSnap() {
		
		System.out.println("takeSnap()");

	}
	public void clearCookies() {
		
		System.out.println("clearCookies()");
	}

	public static void main(String[] args) {
		
		Edge browser2 = new Edge();
		browser2.openURL();
		browser2.closeURL();
		browser2.navigateBack();
		browser2.openIncognito();
		browser2.clearCache();
		browser2.takeSnap();
		browser2.clearCookies();

	}

}
