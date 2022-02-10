import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("Sandhya");
		lst.add("Ashvini");
		lst.add("Rhushi");
		
		for(String s:lst) {
			System.out.println(s);
		}
		
		lst.remove(0);
		System.out.println(lst);
		
		System.out.println(lst.contains("Ashvini"));
		
	}

}
