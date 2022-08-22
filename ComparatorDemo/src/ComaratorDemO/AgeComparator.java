package ComaratorDemO;

import java.util.Comparator;

public class AgeComparator implements Comparator<Compare> {

	@Override
	public int compare(Compare o1, Compare o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}

}
