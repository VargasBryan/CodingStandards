package maven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Estimator {
	
	public Estimator(){
		Map<String, Integer> popularCities = createPopularCities();
		int baseCost = 1000;
		String destination;
		int travelers;
		int durationInDays;
		
		
		
		
		} 
	
	
	private HashMap<String, Integer> createPopularCities(){
		Map<String, Integer> cities = new HashMap<String,Integer>();
		cities.put("Paris", 500);
		cities.put("New York City", 600);
		return (HashMap<String, Integer>) cities;
	}
	
	private boolean isContain(Map<String, Integer> cities){
		Iterator<Map.Entry<Integer, String>> iterator = cities.entrySet().iterator();
		while (iterator.hasNext()) { 
            Map.Entry<Integer, String> 
                entry = iterator.next(); 
            if (keyToBeChecked == entry.getKey()) { 

                isKeyPresent = true; 
            } 
        } 
	}
	
	private int getAditionalCost(String destination) {
		if (destination in popularCities) {
			return
		}else {
			return 0;
		}
			
	}
	
	
	public static void main(String[] args) {
		
	}

}

