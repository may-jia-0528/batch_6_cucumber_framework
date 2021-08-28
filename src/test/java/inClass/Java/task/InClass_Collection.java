package inClass.Java.task;

import java.util.Map;

public class InClass_Collection {
	
	
	
	 //1.https://codingbat.com/prob/p128461
	 public Map<String, String> topping3(Map<String, String> map) {
   if (map.get("potato")!=null){
  map.put("fries",map.get("potato"));}
   if (map.get("salad")!=null){
  map.put("spinach",map.get("salad"));
  }
  return map;
}
	 
	// 2.https://codingbat.com/prob/p196458
	 
	 public Map<String, String> topping2(Map<String, String> map) {
		  if (map.get("ice cream")!=null){
		  map.put("yogurt",map.get("ice cream"));}
		   if (map.get("spinach")!=null){
		  map.put("spinach","nuts");
		  }
		  return map;
		}
	 
	// 3.https://codingbat.com/prob/p115011
	 
	 public Map<String, String> mapAB2(Map<String, String> map) {

		  if (map.get("a")!=null && map.get("b")!=null&& map.get("a").equals(map.get("b"))){
		  map.remove("a");
		  map.remove("b");
		    
		  }
		  
		  return map;
		}
		  
	 //4.optional
	 
}
