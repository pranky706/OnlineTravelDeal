package org.Servlet;

public class MerchantDeals {

	private String hotelname,email,name,validto,validfrom;
	private int noofbookings,price;
	private String loc;
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public int getNoofbookings() {
		return noofbookings;
	}

	public void setNoofbookings(int noofbookings) {
		this.noofbookings = noofbookings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getValidto() {
		return validto;
	}

	public void setValidto(String validto) {
		this.validto = validto;
	}

	public String getValidfrom() {
		return validfrom;
	}

	public void setValidfrom(String validfrom) {
		this.validfrom = validfrom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public MerchantDeals(String hotelname, int noofbookings) {
		super();
		this.hotelname = hotelname;
		this.noofbookings = noofbookings;
	}

	public MerchantDeals(String hotelname, int noofbookings, String name) {
		super();
		this.hotelname = hotelname;
		this.noofbookings = noofbookings;
		this.name = name;
	}

	public MerchantDeals(String hotelname, int noofbookings, String email,
			String name, String validto, String validfrom, int price,String loc) {
		super();
		this.hotelname = hotelname;
		this.noofbookings = noofbookings;
		this.email = email;
		this.name = name;
		this.validto = validto;
		this.validfrom = validfrom;
		this.price = price;
		this.loc = loc;
	}

	public MerchantDeals(String hotelname, String email, String name,
			String validto, String validfrom, int noofbookings, int price,
			String loc) {
		super();
		this.hotelname = hotelname;
		this.email = email;
		this.name = name;
		this.validto = validto;
		this.validfrom = validfrom;
		this.noofbookings = noofbookings;
		this.price = price;
		this.loc = loc;
	}
	
}
