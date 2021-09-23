import java.util.ArrayList;

public class ToArrayTest {
	
	public static void main(String[] arags) {
		
		 ArrayList<String> partyGuests = new ArrayList<String>();
		 
		 partyGuests.add("Devanshu");
		 partyGuests.add("Bhavesh");
		 partyGuests.add("Salman");
		 partyGuests.add("Shahrukh");
		 
		 Object[] arrayGuests = partyGuests.toArray();
		 
		 System.out.println("Element at Index 0 for Array: " + arrayGuests[0]);
		
		 System.out.println("HashCode of the array: " + arrayGuests.hashCode());
	}

}
