package org.houseofdragon.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class XecutionClassContainMainMethod {


	public static void main(String[] args) {
		
		MobileSpecs [] mm= {new MobileSpecs(1,"realme note 12",25000.99,"mediatek dimensity 1080",5000,true,true,(float) 6.7,108,"3996787865654543")};
		List<MobileSpecs> ll=new ArrayList<MobileSpecs>();
		ll.add(new MobileSpecs(1,"redmi note 12",25000.99,"mediatek dimensity 1080",5000,true,true,(float) 6.7,108,"3996787865654543"));
		ll.add(new MobileSpecs(2,"oppo reno 6",30000.99,"mediatek dimensity 820",4500,true,false,(float) 6.6,50,"7876787865654543"));
		ll.add(new MobileSpecs(3,"samsung galaxy 12",67000.59,"exynos 9920",4000,true,true,(float) 6.2,200,"54346787865654543"));
		ll.add(new MobileSpecs(4,"mi 12 pro",58000.79,"snapdragon 888+",5000,false,true,(float) 6.5,50,"7898787865654543"));
	    ll.add(new MobileSpecs(5,"iqoo 9 se",33000.89,"snapdragon 888",4500,true,true,(float) 6.1,108,"8976787865654543"));
        ll.addAll(Arrays.asList(mm));
	for(MobileSpecs ms:ll) {
		System.out.println(ms);
	}
	
	System.out.println("-----------------------after-----------------");
	Collections.sort(ll);
	for(MobileSpecs ms:ll) {
		System.out.println(ms.getModelName());
	}
	System.out.println("-------------------processor sort----------------");
	Collections.sort(ll,new comparatorbyname());
	for(MobileSpecs ms:ll) {
		System.out.println(ms.getProcessor());
	}
	
	System.out.println("-------------------------camera sort---------------");
	
	Comparator<MobileSpecs> cmm=(MobileSpecs m1,MobileSpecs m2)->{return m1.getCameraInMegapixel()-m2.getCameraInMegapixel();};
	Collections.sort(ll,cmm);
	for(MobileSpecs ms:ll) {
		System.out.println(ms.getCameraInMegapixel());
	}
	
	System.out.println("-------------display sort-------------------------------");
	
	
	Collections.sort(ll, new DisplaySort());
	for(MobileSpecs ms:ll) {
		System.out.println(ms.getDisplaySizeInInches());
	}
	}
}
