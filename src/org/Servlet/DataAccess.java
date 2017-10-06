package org.Servlet;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class DataAccess {

	private Connection con; 
	Random r=new Random();
	PreparedStatement pscreate,psselect,psselectemail,psselectemail1,psselectemail2,pscreate1,psselect1,psselectmerchant,psname,psaddhotel,psupdatestatus,pssalesman,psgetdeals,pscreatesalesman,psbookings,psgetallbookings;
	PreparedStatement psgetmerchantdeals,psgetmerchantdeals1,psadddeals,psselectbookings,psselectdeals,psselect4,psselect5,psbook;
	PreparedStatement ps1,ps2,ps3,ps4,ps5;
	private String sqlcreate="insert into Customer values(?,?,?,?,?,?,?,?,?)",sqlselect="select name from Customer where email=? and password=?",sqlselectemail="select email from Customer where email=?",sqlcreate1="insert into Merchant values(?,?,?,?,?,?)",sqlselectemail1="select email from Merchant where email=?",sqlselect1="select name from Merchant where email=? and password=?";
	private String sqlmerchant="select hotelname,noofbookings from MerchantDeals where email=?",sqlname="select name from Merchant where email=?";
	private String sqladdhotel="insert into MerchantDeals values(?,?,?,?,?,?,?,?)";
	private String sqlsalesman="insert into Salesman values(?,?,?,?,?)",sqlbookings="select * from bookings where hotelname=? and status=?",sqlgetallbookings="select * from bookings where hotelname=?";
	private String sqlsalesmanlogin="select name from Salesman where email=? and password=?";
	private String sqlgetdeals="select * from OfferDeals where semail=?" ,sqlupdatestatus="update bookings set status=? where cemail=?", sqlselectemail2="select email from Salesman where email=?";
	private String sqlgetmerchantdeals="select * from MerchantDeals",sqlgetmerchantdeals1="select * from MerchantDeals where hotelname=?";
	private String sqladddeals="insert into OfferDeals(id,title,location,validfrom,validto,decription,foodcost,lodgecost,transpotcost,semail,memail,image,priceperchild,priceperadult,noofbuy) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private String sqlselectbookings="select * from bookings where semail=?",sqlselectdeals="select * from OfferDeals",sqlselect4="select * from OfferDeals where id=?";
	private String sqlselecthotelname="select hotelname from merchantdeals where email=? and location=?",sqlbooking="insert into bookings values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private String sqlselect10="select noofbookings from merchantdeals where email=? and hotelname=?",sqlupdate1="update merchantdeals set noofbookings=? where hotelname=?";;
	private String sqlselect101="select * from bookings where cemail=?";
	private String sqlselect104="select * from Customer where email=?";
	private String sqlselect105="update Customer set password=? where email=?";
	public DataAccess() throws SQLException
	{
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root123");
		pscreate=con.prepareStatement(sqlcreate);
		psselect=con.prepareStatement(sqlselect);
		psselectemail=con.prepareStatement(sqlselectemail);
		pscreate1=con.prepareStatement(sqlcreate1);
		psselectemail1=con.prepareStatement(sqlselectemail1);
		psselectemail2=con.prepareStatement(sqlselectemail2);
		psselect1=con.prepareStatement(sqlselect1);
		psselectmerchant=con.prepareStatement(sqlmerchant);
		psname=con.prepareStatement(sqlname);
		psaddhotel=con.prepareStatement(sqladdhotel);
		pssalesman=con.prepareStatement(sqlsalesmanlogin);
		psgetdeals=con.prepareStatement(sqlgetdeals);
		pscreatesalesman=con.prepareStatement(sqlsalesman);
		psbookings=con.prepareStatement(sqlbookings);
		psgetallbookings=con.prepareStatement(sqlgetallbookings);
		psupdatestatus=con.prepareStatement(sqlupdatestatus);
		psgetmerchantdeals=con.prepareStatement(sqlgetmerchantdeals);
		psgetmerchantdeals1=con.prepareStatement(sqlgetmerchantdeals1);
		psadddeals=con.prepareStatement(sqladddeals);
		psselectbookings=con.prepareStatement(sqlselectbookings);
		psselectdeals=con.prepareStatement(sqlselectdeals);
		psselect4=con.prepareStatement(sqlselect4);
		psselect5=con.prepareStatement(sqlselecthotelname);
		psbook=con.prepareStatement(sqlbooking);
		ps1=con.prepareStatement(sqlselect10);
		ps2=con.prepareStatement(sqlupdate1);
		ps3=con.prepareStatement(sqlselect101);
		ps4=con.prepareStatement(sqlselect104);
		ps5=con.prepareStatement(sqlselect105);
	}
	public void validate(Customer c) throws SQLException
	{
		
		
		pscreate.setInt(1,c.getId());
		pscreate.setString(2,c.getName());
		pscreate.setString(3,c.getAddress());
		pscreate.setString(4,c.getGender());
		pscreate.setString(5,c.getPhn_number());
		pscreate.setString(6,c.getEmail());
		pscreate.setString(7,c.getPassword());
		pscreate.setString(8,c.getSquestion());
		pscreate.setString(9,c.getSanswer());
		pscreate.executeUpdate();
	}
	public void changepassword(String pass,String email) throws SQLException
	{
		ps5.setString(1,pass);
		ps5.setString(2,email);
		ps5.executeUpdate();
	}
	public Customer getCustomerdetails(String email) throws SQLException
	{
		ps4.setString(1,email);
		Customer c;
		ResultSet rs=ps4.executeQuery();
		if(rs.next())
		{
			c=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
		}
		else
		{
			c=null;
		}
		return c;
	}
	public void adddeals(Deals d) throws SQLException
	{
		psadddeals.setInt(1,d.getId());  
		psadddeals.setString(2,d.getTitle());
		psadddeals.setString(3,d.getLocation());
		psadddeals.setString(4,d.getValidfrom());
		psadddeals.setString(5,d.getValidto());
		psadddeals.setString(6,d.getDescription());
		psadddeals.setInt(7,d.getFoodcast());
		psadddeals.setInt(8,d.getLodgecost());
		psadddeals.setInt(9,d.getTranspotcost());
		psadddeals.setString(10,d.getSemail());
		psadddeals.setString(11,d.getMemail());
		psadddeals.setString(12,d.getImage());
		psadddeals.setInt(13,d.getPriceperchild());
		psadddeals.setInt(14,d.getPriceperadult());
		psadddeals.setInt(15,d.getNoofbuy());
		psadddeals.executeUpdate();
		
	}
	public void addbookings(Bookings b) throws SQLException
	{
		psbook.setInt(1,b.getDealid());
		psbook.setString(2,b.getTitle());
		psbook.setString(3,b.getBdate());
		psbook.setString(4,b.getCname());
		psbook.setString(5,b.getCemail());
		psbook.setString(6,b.getStatus());
		psbook.setString(7,b.getHotelname());
		psbook.setString(8,b.getSemail());
		psbook.setString(9,b.getMemail());
		psbook.setInt(10,b.getFoodcost());
		psbook.setInt(11,b.getTravelcost());
		psbook.setInt(12,b.getLodgecost());
		psbook.setInt(13,b.getTotalcost());
		psbook.setInt(14,b.getDuration());
		psbook.setInt(15,b.getNoofbookings());
		psbook.executeUpdate();
	}
	public void salesmanvalidate(Salesman c) throws SQLException
	{
		
		
		pscreatesalesman.setInt(1,c.getId());
		pscreatesalesman.setString(2,c.getName());
		pscreatesalesman.setString(3,c.getPhone());
		pscreatesalesman.setString(4,c.getEmail());
		pscreatesalesman.setString(5,c.getPassword());
		pscreatesalesman.executeUpdate();
	}
	public void addHotel(MerchantDeals c) throws SQLException
	{
		
		
		psaddhotel.setString(1,c.getHotelname());
		psaddhotel.setInt(2,c.getNoofbookings());
		psaddhotel.setString(3,c.getEmail());
		psaddhotel.setString(4,c.getName());
		psaddhotel.setString(5,c.getValidto());
		psaddhotel.setString(6,c.getValidfrom());
		psaddhotel.setInt(7,c.getPrice());
		psaddhotel.setString(8,c.getLoc());
		psaddhotel.executeUpdate();
	}
	public String select(String email,String password)throws SQLException
	{
		psselect.setString(1,email);
		psselect.setString(2,password);
		String name;
		ResultSet rs=psselect.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public String selectemail(String email)throws SQLException
	{
		psselectemail.setString(1,email);
		String name;
		ResultSet rs=psselectemail.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public void validate(Merchant c) throws SQLException
	{
		
		
		pscreate1.setInt(1,c.getId());
		pscreate1.setString(2,c.getName());
		pscreate1.setString(3,c.getGender());
		pscreate1.setString(4,c.getPhone());
		pscreate1.setString(5,c.getEmail());
		pscreate1.setString(6,c.getPassword());
		pscreate1.executeUpdate();
	}
	public String selectemail1(String email)throws SQLException
	{
		psselectemail1.setString(1,email);
		String name;
		ResultSet rs=psselectemail1.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public String selectemail2(String email)throws SQLException
	{
		psselectemail2.setString(1,email);
		String name;
		ResultSet rs=psselectemail2.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public String select1(String email,String password)throws SQLException
	{
		psselect1.setString(1,email);
		psselect1.setString(2,password);
		String name;
		ResultSet rs=psselect1.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public ArrayList<MerchantDeals> selectMerchant(String email) throws SQLException
	{
		psselectmerchant.setString(1,email);
		String name;
		int nob;
		ResultSet rs=psselectmerchant.executeQuery();
		ArrayList<MerchantDeals> a=new ArrayList<>();
		if(rs.next())
		{
			do
			{
				name=rs.getString(1);
				nob=rs.getInt(2);
				a.add(new MerchantDeals(name,nob));
			}while(rs.next());
		}
		else
		{
			a=null;
			
		}
		return a;
	}
	public String selectname(String email)throws Exception
	{
		psname.setString(1,email);
		ResultSet rs=psname.executeQuery();
		String name;
		if(rs.next())
		{
			name=rs.getString(1);
		
		}
		else
		{
			name=null;
		}
		return name;
	}
	public String salesmanvalidate(String email,String password)throws SQLException
	{
		pssalesman.setString(1,email);
		pssalesman.setString(2,password);
		String name;
		ResultSet rs=pssalesman.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public ArrayList<Deals> selectdeals(String email)throws SQLException
	{
		psgetdeals.setString(1, email);
		int id;
		String title,location,duration;
		int numberoftravels;
		String validfrom,validto,description;
		int foodcast,lodgecost,transpotcost,totalcost;
		String semail,memail,image;
		int priceperchild,priceperadult,noofbuy;
		ResultSet rs=psgetdeals.executeQuery();
		ArrayList<Deals> a=new ArrayList<Deals>();
		if(rs.next())
		{
			do
			{
				id=rs.getInt(1);
				title=rs.getString(2);
				location=rs.getString(3);
				duration=rs.getString(4);
				numberoftravels=rs.getInt(5);
				validfrom=rs.getString(6);
				validto=rs.getString(7);
				description=rs.getString(8);
				foodcast=rs.getInt(9);
				lodgecost=rs.getInt(10);
				transpotcost=rs.getInt(11);
				totalcost=rs.getInt(12);
				semail=rs.getString(13);
				memail=rs.getString(14);
				image=rs.getString(15);
				priceperchild=rs.getInt(16);
				priceperadult=rs.getInt(17);
				noofbuy=rs.getInt(18);
				a.add(new Deals(id,title,location,duration,numberoftravels,validfrom,validto,description,foodcast,lodgecost,transpotcost,totalcost,semail,memail,image,priceperchild,priceperadult,noofbuy));
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
	public ArrayList<Deals> selectalldeals()throws SQLException
	{
		int id;
		String title,location,duration;
		int numberoftravels;
		String validfrom,validto,description;
		int foodcast,lodgecost,transpotcost,totalcost;
		String semail,memail,image;
		int priceperchild,priceperadult,noofbuy;
		ResultSet rs=psselectdeals.executeQuery();
		ArrayList<Deals> a=new ArrayList<Deals>();
		if(rs.next())
		{
			do
			{
				id=rs.getInt(1);
				title=rs.getString(2);
				location=rs.getString(3);
				duration=rs.getString(4);
				numberoftravels=rs.getInt(5);
				validfrom=rs.getString(6);
				validto=rs.getString(7);
				description=rs.getString(8);
				foodcast=rs.getInt(9);
				lodgecost=rs.getInt(10);
				transpotcost=rs.getInt(11);
				totalcost=rs.getInt(12);
				semail=rs.getString(13);
				memail=rs.getString(14);
				image=rs.getString(15);
				priceperchild=rs.getInt(16);
				priceperadult=rs.getInt(17);
				noofbuy=rs.getInt(18);
				a.add(new Deals(id,title,location,duration,numberoftravels,validfrom,validto,description,foodcast,lodgecost,transpotcost,totalcost,semail,memail,image,priceperchild,priceperadult,noofbuy));
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
	public Deals select4(int i)throws SQLException
	{
		psselect4.setInt(1,i);
		int id;
		String title,location,duration;
		int numberoftravels;
		String validfrom,validto,description;
		int foodcast,lodgecost,transpotcost,totalcost;
		String semail,memail,image;
		int priceperchild,priceperadult,noofbuy;
		ResultSet rs=psselect4.executeQuery();
		Deals d;
		if(rs.next())
		{
				id=rs.getInt(1);
				title=rs.getString(2);
				location=rs.getString(3);
				duration=rs.getString(4);
				numberoftravels=rs.getInt(5);
				validfrom=rs.getString(6);
				validto=rs.getString(7);
				description=rs.getString(8);
				foodcast=rs.getInt(9);
				lodgecost=rs.getInt(10);
				transpotcost=rs.getInt(11);
				totalcost=rs.getInt(12);
				semail=rs.getString(13);
				memail=rs.getString(14);
				image=rs.getString(15);
				priceperchild=rs.getInt(16);
				priceperadult=rs.getInt(17);
				noofbuy=rs.getInt(18);
				d=new Deals(id,title,location,duration,numberoftravels,validfrom,validto,description,foodcast,lodgecost,transpotcost,totalcost,semail,memail,image,priceperchild,priceperadult,noofbuy);
		
		}
		else
		{
			d=null;
		}
		return d;
	}
	public ArrayList<Bookings> getbookingdetails(String hotelname,String status)throws Exception
	{
		psbookings.setString(1,hotelname);
		psbookings.setString(2,status);
		ArrayList<Bookings> a=new ArrayList<Bookings>();
		ResultSet rs=psbookings.executeQuery();
		if(rs.next())
		{
			do
			{
				a.add(new Bookings(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
	public ArrayList<Bookings> selectbookings(String semail)throws Exception
	{
		psselectbookings.setString(1,semail);
		ArrayList<Bookings> a=new ArrayList<Bookings>();
		ResultSet rs=psselectbookings.executeQuery();
		if(rs.next())
		{
			do
			{
				a.add(new Bookings(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getInt(12),rs.getInt(13),rs.getInt(14),rs.getInt(15)));
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
	public void updatestatus(String email,String status)throws Exception
	{
		psupdatestatus.setString(1,status);
		psupdatestatus.setString(2,email);
		psupdatestatus.executeUpdate();
		
	}
	public ArrayList<Bookings> getAllbookingdetails(String hotelname)throws Exception
	{
		psgetallbookings.setString(1,hotelname);
		ArrayList<Bookings> a=new ArrayList<Bookings>();
		ResultSet rs=psgetallbookings.executeQuery();
		if(rs.next())
		{
			do
			{
				a.add(new Bookings(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
	public ArrayList<MerchantDeals> getalldeals()throws SQLException
	{
		ResultSet rs=psgetmerchantdeals.executeQuery();
		ArrayList<MerchantDeals> a=new ArrayList<MerchantDeals>();
		if(rs.next())
		{
			do
			{
				a.add(new MerchantDeals(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8)));
				
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
	public MerchantDeals getsingledeals(String H)throws SQLException
	{
		psgetmerchantdeals1.setString(1,H);
		ResultSet rs=psgetmerchantdeals1.executeQuery();
		MerchantDeals a;
		if(rs.next())
		{
				a=new MerchantDeals(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8));
		}
		else
		{
			a=null;
		}
		return a;
	}
	public String gethotelname(String email,String loc) throws SQLException
	{
		psselect5.setString(1,email);
		psselect5.setString(2,loc);
		ResultSet rs=psselect5.executeQuery();
		String name;
		if(rs.next())
		{
			name=rs.getString(1);
		}
		else
		{
			name=null;
		}
		return name;
	}
	public int getno(String email,String loc) throws SQLException
	{
		ps1.setString(1,email);
		ps1.setString(2,loc);
		ResultSet rs=ps1.executeQuery();
		int name;
		rs.next();
			name=rs.getInt(1);
		
		
		return name;
	}
	public void updateno(int n,String h) throws SQLException
	{
		ps2.setInt(1,n);
		ps2.setString(2,h);
		ps2.executeUpdate();
	}
	public ArrayList<Bookings> getbookinghistory(String email) throws SQLException
	{
		ps3.setString(1,email);
		ArrayList<Bookings> a=new ArrayList<Bookings>();
		ResultSet rs=ps3.executeQuery();
		if(rs.next())
		{
			do
			{
				a.add(new Bookings(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getInt(12),rs.getInt(13),rs.getInt(14),rs.getInt(15)));
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
}

