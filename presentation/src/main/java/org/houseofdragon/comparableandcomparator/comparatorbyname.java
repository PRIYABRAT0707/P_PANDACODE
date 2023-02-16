package org.houseofdragon.comparableandcomparator;

import java.util.Comparator;

public class comparatorbyname implements  Comparator <MobileSpecs> {

	public int compare(MobileSpecs o1, MobileSpecs o2) {
		
		return  o1.getProcessor().compareTo(o2.getProcessor());
	}

}
