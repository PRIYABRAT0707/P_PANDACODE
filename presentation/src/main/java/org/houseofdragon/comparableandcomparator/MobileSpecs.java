package org.houseofdragon.comparableandcomparator;

public class MobileSpecs implements Comparable<MobileSpecs> {
	
	private int mid;
	private String modelName;
	private double price;
	private String processor;
	private int batteryInMah;
	private boolean havingDolbyAtmos;
	private boolean havingStreoSpeaker;
	private float displaySizeInInches;
	private int cameraInMegapixel;
	private String imeiNumber;
	
	
	public MobileSpecs(int mid, String modelName, double price, String processor, int batteryInMah,
			boolean havingDolbyAtmos, boolean havingStreoSpeaker, float displaySizeInInches, int cameraInMegapixel,
			String imeiNumber) {
		super();
		this.mid = mid;
		this.modelName = modelName;
		this.price = price;
		this.processor = processor;
		this.batteryInMah = batteryInMah;
		this.havingDolbyAtmos = havingDolbyAtmos;
		this.havingStreoSpeaker = havingStreoSpeaker;
		this.displaySizeInInches = displaySizeInInches;
		this.cameraInMegapixel = cameraInMegapixel;
		this.imeiNumber = imeiNumber;
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getBatteryInMah() {
		return batteryInMah;
	}
	public void setBatteryInMah(int batteryInMah) {
		this.batteryInMah = batteryInMah;
	}
	public boolean isHavingDolbyAtmos() {
		return havingDolbyAtmos;
	}
	public void setHavingDolbyAtmos(boolean havingDolbyAtmos) {
		this.havingDolbyAtmos = havingDolbyAtmos;
	}
	public boolean isHavingStreoSpeaker() {
		return havingStreoSpeaker;
	}
	public void setHavingStreoSpeaker(boolean havingStreoSpeaker) {
		this.havingStreoSpeaker = havingStreoSpeaker;
	}
	public float getDisplaySizeInInches() {
		return displaySizeInInches;
	}
	public void setDisplaySizeInInches(float displaySizeInInches) {
		this.displaySizeInInches = displaySizeInInches;
	}
	public int getCameraInMegapixel() {
		return cameraInMegapixel;
	}
	public void setCameraInMegapixel(int cameraInMegapixel) {
		this.cameraInMegapixel = cameraInMegapixel;
	}
	public String getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	@Override
	public String toString() {
		return "MobileSpecs [mid=" + mid + ", modelName=" + modelName + ", price=" + price + ", processor=" + processor
				+ ", batteryInMah=" + batteryInMah + ", havingDolbyAtmos=" + havingDolbyAtmos + ", havingStreoSpeaker="
				+ havingStreoSpeaker + ", displaySizeInInches=" + displaySizeInInches + ", cameraInMegapixel="
				+ cameraInMegapixel + ", imeiNumber=" + imeiNumber + "]";
	}

	public int compareTo(MobileSpecs o) {
		
		return this.modelName.compareTo(o.getModelName());
	}

	
	
	
	

}
