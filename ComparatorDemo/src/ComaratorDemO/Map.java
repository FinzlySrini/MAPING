package ComaratorDemO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map {
	public static void main(String[] args) {
		Map s = new Map();
		//System.out.println(s.m1());
		
		  HashMap<String, ArrayList<String>> h = s.m1().get("FINZLY"); 
		  for(String ss:h.keySet()) {
		  System.out.println(h.get(ss)); }
		 
	}	
		  HashMap<String, HashMap<String, ArrayList<String>>> m1() {
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
			devOps.add("Nirmal");
			
		    HashMap<String,ArrayList<String>> cabinNo = new HashMap<>();
		    cabinNo.put("1", developmwnt);
		    cabinNo.put("2", devOps);
			
			
			  for (String g:cabinNo.keySet()) {
				  System.out.println(cabinNo.get(g)); 
				  }
  
		    HashMap<String,HashMap<String,ArrayList<String>>> hsFin = new HashMap<>();
		    hsFin.put("FINZLY", cabinNo);
		    
		   // HashMap<String,HashMap<String,ArrayList<String>>> hsFIN = new HashMap<>();
		   // hsFIN.put("FINZLY", hsDevop);
		    
		   // HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> hsIND = new HashMap<>();
		    //hsIND.put("INDIA", hsFIN);
		    
		    HashMap<String,HashMap<String,HashMap<String,ArrayList<String>>>> hsInd = new HashMap<>();
		    hsInd.put("INDIA", hsFin);
		  
		    
		   //  System.out.println(hsInd);
		   //  System.out.println(hsFIN);
		   //  System.out.println(hsFin.get("FINZLY"));
		   //  System.out.println(hsInd.get("INDIA"));
		  // System.out.println(cabinNo.get(name));
		    return hsFin;
		
}
}
