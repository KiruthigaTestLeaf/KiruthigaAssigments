package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Kiruthiga";
		
		String varName = new String("Kiruthiga Soundar Rajan");
		
		System.out.println("No. of characters in name - " + name.length());
		
		//equal
		if (name.equals(varName)) {
			System.out.println("Both the values are equal");
		}
		else {
		System.out.println("Both the values are not equal");
	}
		//equalignorecase
		String refName = "Kiruthiga";
		String newRefName = "kIrutHIgA";
		
		if (refName.equalsIgnoreCase(newRefName)) {
			System.out.println("Ref values are equal");
		}
		else {
		System.out.println("Ref values are not equal");
		}
		//contains()
		boolean contains = refName.contains("I");
		System.out.println("Contains");
		
		//tochararray()
		String companyName = "TestLeaf";
		char[] charArray = companyName.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
					
			System.out.println(charArray[i]);

		}
	

}
}