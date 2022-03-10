package learn.java.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/* 
Problem 1: Find the highest stock price
Problem 2: Find the average stock price
Problem 3: Remove companies with stock price below 50 
*/
public class HashMapExercise {
    
	public static void main(String args[]) {

		Map<String, Integer> stockPrice = new HashMap<>();

		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);
		stockPrice.put("Google", 421);
		stockPrice.put("Ford", 456);
		stockPrice.put("Novartis", 43);
		stockPrice.put("TCS", 23);
		
		//Finding the highest Stock Price
		int max = 0;
		String company ="";
		Set<Entry<String,Integer>> entry = stockPrice.entrySet();
		for (Entry<String,Integer> e : entry) {
			if(e.getValue()>max){
				company=e.getKey();
				max = e.getValue();
			}
		}
		System.out.println("The highest Stock Price Company is "+company);

		//Finding the Average Stock Price
		Collection<Integer> stockPrices = stockPrice.values();
		int sum =0;
		for (Integer integer : stockPrices) {
			sum+=integer;
		}
		System.out.println("Average Stock Price is "+ sum/stockPrices.size());

		//Finding sum using Java8
		int sumJava8 = stockPrices.stream().mapToInt(value -> value.intValue()).sum();
		System.out.println("Average Stock Price is "+ sumJava8/stockPrices.size());
		
		//Removing the companies having stock price <50
		Iterator<Entry<String, Integer>> itrerator = stockPrice.entrySet().iterator();
		while(itrerator.hasNext()){
			Entry<String, Integer> entry1 = itrerator.next();
			if(entry1.getValue()<50){
				itrerator.remove();
			}
		}
		System.out.println(stockPrice);
		
	}

}
