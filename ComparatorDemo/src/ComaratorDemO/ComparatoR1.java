package ComaratorDemO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatoR1 implements Comparator<Compare> {
	public static void main(String[] args) {

		List<Compare> al = new ArrayList<>();
		al.add(new Compare(1, "srini", 3, "ece"));
		al.add(new Compare(2, "gslv", 43, "cse"));
		al.add(new Compare(54, "harish", 42, "mech"));
		al.add(new Compare(23, "karthic", 25, "civil"));
		al.add(new Compare(27, "guru", 27, "eee"));
		
		Collections.sort(al,(a1,a2)->a2.name.compareTo(a1.name));
		for(Compare c : al)
			System.out.println(c);
 System.out.println("***********************");
 
 
 
		Collections.sort(al,new New());
		for(Compare c : al)
		System.out.println(c);

	}

	@Override
	public int compare(Compare o1, Compare o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
