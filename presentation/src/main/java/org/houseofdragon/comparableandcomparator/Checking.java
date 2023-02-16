package org.houseofdragon.comparableandcomparator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Checking {

	public void checkingMethod() {
		int [] arr= {10,12,11,1,6,8,9};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//System.out.println(temp);
				}
			}
			
		}

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		Map<Integer,String> kk=new HashMap<Integer,String>();
		kk.put(10,"ppanda");
		kk.put(11,"rhynera");
		kk.put(12,"drogon");
		kk.put(13,"viserys");
		
		/*
		 * for(Entry<Integer, String > ry:kk.entrySet()) {
		 * System.out.println(ry.getKey()+"  --  "+ ry.getValue()); }
		 */

		kk.forEach((x,y)->{System.out.println(x +"---i am also here----"+ y);});
	}

	

}
