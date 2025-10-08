package week2.day2;

public class HomeAssignments4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "We learn Java basics as part of java sessions in java week1";
		int a = 0;
		String[] splitName = name.split(" ");
		System.out.println(splitName);
	
		//using  for loop
	for (int i =0; i < splitName.length; i++) {
		for (int j=i+1; j<splitName.length; j++) {
			if (splitName[i].equalsIgnoreCase(splitName[j])) {
				splitName[j]=" ";
				a+=1;
		}
		
	}
	}
		if (a>0) {
			
			for(int i=0;i<splitName.length;i++) {
				String word = splitName[i];
				System.out.print(word);
				System.out.print(" ");	
		}
			
}
}
}
