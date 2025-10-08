package week2.day2;

public class HomeAssignments1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] chars = test.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if (i%2==1) {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
			for (char c: chars) {
				System.out.print(c);
			}
		

		}
	}


