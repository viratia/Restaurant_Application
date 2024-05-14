package restarurantRepository;
import java.util.ArrayList;
import java.util.List;

import restaurantModel.CustomerModel;
import restaurantModel.HotelTableModel;
import restaurantconfig.DBConfig;

public class CustomerRepository extends DBConfig implements CustomerRepositoryImpl
{
	public int getCustomerid()
	{
		int cid=0;
		try
		{
			stmt=con.prepareStatement("select max(customer_id) from customer");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				cid=rs.getInt(1);
			}
			return ++cid;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
	}

	
	public int isAddCustomer(CustomerModel cm) 
	{
		//String str;
		int customer_id=this.getCustomerid();
		try
		{
			stmt=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			stmt.setInt(1, customer_id);
			stmt.setString(2,cm.getFname());
			stmt.setInt(3, cm.getContact());
			stmt.setString(4, cm.getusername());
			stmt.setString(5, cm.getPassword());
			int val=stmt.executeUpdate();
			if(val>0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
		return 0;
	}


	public List<CustomerModel> showCustomer() 
	{
		try
		{
			List<CustomerModel> listtables=new ArrayList<CustomerModel>();
			stmt=con.prepareStatement("select *from customer");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				CustomerModel cm=new CustomerModel();
				cm.setCustomer_id(rs.getInt(1));
				cm.setFname(rs.getString(2));
				cm.setContact(rs.getInt(3));
				cm.setusername(rs.getString(4));
				cm.setPassword(rs.getString(5));
				listtables.add(cm);
			}
			return listtables.size()>0?listtables:null;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null ;
	}


	@Override
	public int DeleteCustomer(CustomerModel cm) {
		try
		{
			stmt=con.prepareStatement("delete from customer where customer_id=?");
			stmt.setInt(1,cm.getCustomer_id());
			return stmt.executeUpdate()>0?1:0;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
	}


	@Override
	public boolean isUpdateCustomer(CustomerModel cm) {
		try
		{
			stmt=con.prepareStatement("update customer set fname=?,contact=?,username=?,password=? where customer_id=?");
			stmt.setString(1, cm.getFname());
			stmt.setInt(2, cm.getContact());
			stmt.setString(3, cm.getusername());
			stmt.setString(4, cm.getPassword());
			stmt.setInt(5, cm.getCustomer_id());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		
	}


	@Override
	public List<CustomerModel> SearchByCusomer(String str) {
		try
		{
			List<CustomerModel> listtables=new ArrayList<CustomerModel>();
			stmt=con.prepareStatement("select *from customer where fname like '"+str+"%'");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				CustomerModel cm=new CustomerModel();
				cm.setCustomer_id(rs.getInt(1));
				cm.setFname(rs.getString(2));
				cm.setContact(rs.getInt(3));
				cm.setusername(rs.getString(4));
				cm.setPassword(rs.getString(5));
				listtables.add(cm);
			}
			return listtables.size()>0?listtables:null;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
}
