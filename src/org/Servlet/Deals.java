package org.Servlet;


public class Deals {
	
	
	private int id;
	private String title,location,duration;
	private int numberoftravels;
	private String validfrom,validto,description;
	private int foodcast,lodgecost,transpotcost,totalcost;
	private String semail,memail,image;
	private int priceperchild,priceperadult,noofbuy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getNumberoftravels() {
		return numberoftravels;
	}
	public void setNumberoftravels(int numberoftravels) {
		this.numberoftravels = numberoftravels;
	}
	public String getValidfrom() {
		return validfrom;
	}
	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}
	public String getValidto() {
		return validto;
	}
	public void setValidto(String validto) {
		this.validto = validto;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFoodcast() {
		return foodcast;
	}
	public void setFoodcast(int foodcast) {
		this.foodcast = foodcast;
	}
	public int getLodgecost() {
		return lodgecost;
	}
	public void setLodgecost(int lodgecost) {
		this.lodgecost = lodgecost;
	}
	public int getTranspotcost() {
		return transpotcost;
	}
	public void setTranspotcost(int transpotcost) {
		this.transpotcost = transpotcost;
	}
	public int getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPriceperchild() {
		return priceperchild;
	}
	public void setPriceperchild(int priceperchild) {
		this.priceperchild = priceperchild;
	}
	public int getPriceperadult() {
		return priceperadult;
	}
	public void setPriceperadult(int priceperadult) {
		this.priceperadult = priceperadult;
	}
	public int getNoofbuy() {
		return noofbuy;
	}
	public void setNoofbuy(int noofbuy) {
		this.noofbuy = noofbuy;
	}
	public Deals(int id, String title, String location, String duration,
			int numberoftravels, String validfrom, String validto,
			String description, int foodcast, int lodgecost, int transpotcost,
			int totalcost, String semail, String memail, String image,
			int priceperchild, int priceperadult, int noofbuy) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.duration = duration;
		this.numberoftravels = numberoftravels;
		this.validfrom = validfrom;
		this.validto = validto;
		this.description = description;
		this.foodcast = foodcast;
		this.lodgecost = lodgecost;
		this.transpotcost = transpotcost;
		this.totalcost = totalcost;
		this.semail = semail;
		this.memail = memail;
		this.image = image;
		this.priceperchild = priceperchild;
		this.priceperadult = priceperadult;
		this.noofbuy = noofbuy;
	}
	public Deals(int id, String title, String location, String validfrom, String validto,
			String description, int foodcast, int lodgecost, int transpotcost, String semail, String memail, String image,
			int priceperchild, int priceperadult, int noofbuy) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.validfrom = validfrom;
		this.validto = validto;
		this.description = description;
		this.foodcast = foodcast;
		this.lodgecost = lodgecost;
		this.transpotcost = transpotcost;
		this.semail = semail;
		this.memail = memail;
		this.image = image;
		this.priceperchild = priceperchild;
		this.priceperadult = priceperadult;
		this.noofbuy = noofbuy;
	}
	
	
}

