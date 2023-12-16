//Use of iterator and toString()
import java.util.*;
class ArrayListDemo3 {
	public static void main(String args[]){
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("C");
		a1.add("K");
		a1.add("A");
		a1.add("G");
		// Using toString()
		System.out.println("Contents after addition: " + a1);
		
		System.out.println("Contets of arraylist using iterator...");
		Iterator itr = a1.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\nContents using foreach loop....");
		for(String item:a1){
			System.out.print(item+" ");
		}
	}
}