package org.houseofdragon.comparableandcomparator;

import java.util.Comparator;

public class DisplaySort implements Comparator<MobileSpecs> {

	@Override
	public int compare(MobileSpecs o1, MobileSpecs o2) {

		if (o1.getDisplaySizeInInches() > o2.getDisplaySizeInInches()) {
			return 1;
		}
		
		 else if(o1.getDisplaySizeInInches() < o2.getDisplaySizeInInches()) {return
		  -1;}
		  
		  return 0;
		 

	}
}
