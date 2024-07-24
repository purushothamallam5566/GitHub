import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetClassONE {

	public static void main(String[] args) {
		HashMap<Integer,String> set = new HashMap<Integer,String>();
		set.put(1, "samba");
		set.put(2, "ravi");
		set.put(3, "leela");
		set.put(4, "guru");
		set.put(null, "tulasi");
		
		set.get(5);
		System.out.println(set.entrySet());
//		
//		Iterator<String> i = set.iterator();
//		while (i.hasNext()) {
//		//	System.out.println(i.next());
//			String strr=i.next();
//			System.out.println(strr);
//		}
	}
}


