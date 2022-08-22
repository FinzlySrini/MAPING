package ComaratorDemO;
import java.util.ArrayList;
import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		
		
	ArrayList<String> developmwnt = new ArrayList<>();
	developmwnt.add("keerthika");
	developmwnt.add("lokesh");
	developmwnt.add("thulasi");
	developmwnt.add("anand");
	developmwnt.add("bala");
	developmwnt.add("srini");
	
	ArrayList<String> devOps = new ArrayList<>();
	devOps.add("gowtham");
	devOps.add("shagil");
	devOps.add("nirmal");
	
    HashMap<String,ArrayList<String>> cabinN0 = new HashMap<>();
    cabinN0.put("1", developmwnt);
    cabinN0.put("2", devOps);
    
    HashMap<String,HashMap<String,ArrayList<String>>> hsFin = new HashMap<>();
    hsFin.put("FINZLY", cabinN0);
    
   // HashMap<String,HashMap<String,ArrayList<String>>> hsFIN = new HashMap<>();
   // hsFIN.put("FINZLY", hsDevop);
    
   // HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> hsIND = new HashMap<>();
    //hsIND.put("INDIA", hsFIN);
    
    HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> hsInd = new HashMap<>();
    hsInd.put("INDIA", hsFin);
    
    System.out.println(hsInd);
   // System.out.println(hsFIN);
    System.out.println(hsFin.get("FINZLY"));
    
	}
}
