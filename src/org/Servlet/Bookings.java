package org.Servlet;

public class Bookings {

	private int dealid;
	private String title,bdate,cname,cemail,status,hotelname,semail,memail;
	private int foodcost,travelcost,lodgecost,totalcost,duration,noofbookings;
	
	public int getNoofbookings() {
		return noofbookings;
	}
	public void setNoofbookings(int noofbookings) {
		this.noofbookings = noofbookings;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
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
	public int getFoodcost() {
		return foodcost;
	}
	public void setFoodcost(int foodcost) {
		this.foodcost = foodcost;
	}
	public int getTravelcost() {
		return travelcost;
	}
	public void setTravelcost(int travelcost) {
		this.travelcost = travelcost;
	}
	public int getLodgecost() {
		return lodgecost;
	}
	public void setLodgecost(int lodgecost) {
		this.lodgecost = lodgecost;
	}
	public int getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getDealid() {
		return dealid;
	}
	public void setDealid(int dealid) {
		this.dealid = dealid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Bookings(int dealid, String title, String bdate, String cname,
			String cemail, String status) {
		super();
		this.dealid = dealid;
		this.title = title;
		this.bdate = bdate;
		this.cname = cname;
		this.cemail = cemail;
		this.status = status;
	}
	public Bookings(int dealid, String title, String bdate, String cname,
			String cemail, String status, String hotelname, String semail,
			String memail, int foodcost, int travelcost, int lodgecost,
			int totalcost, int duration,int noofbookings) {
		super();
		this.dealid = dealid;
		this.title = title;
		this.bdate = bdate;
		this.cname = cname;
		this.cemail = cemail;
		this.status = status;
		this.hotelname = hotelname;
		this.semail = semail;
		this.memail = memail;
		this.foodcost = foodcost;
		this.travelcost = travelcost;
		this.lodgecost = lodgecost;
		this.totalcost = totalcost;
		this.duration = duration;
		this.noofbookings = noofbookings;
	}
	
}
