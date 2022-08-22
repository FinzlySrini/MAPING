package ComaratorDemO;

import java.util.Comparator;

public class NameComparator implements Comparator<Compare>{

	@Override
	public int compare(Compare o1, Compare o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
