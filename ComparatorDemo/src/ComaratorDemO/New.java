package ComaratorDemO;

import java.util.Comparator;

public class New implements Comparator<Compare> {

	@Override
	public int compare(Compare o1, Compare o2) {
		
		return o1.age-o2.age;
	

}
}
