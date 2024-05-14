package restarurantRepository;

import restaurantModel.Adminmodel;
import restaurantconfig.DBConfig;

public class Adminrepository extends DBConfig implements Adminrepositoryimpl{

	public int getAdminId() {
		int Aid=0;
		try
		{
			stmt=con.prepareStatement("select max(id) from Admin");
			rs =stmt.executeQuery();
			if(rs.next())
			{
				Aid=rs.getInt(1);
			}
			return ++Aid;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
		
	}
//	@Override
//	public boolean getLogin(Adminmodel model) {
//		try
//		{	
//			int AdminId=this.getAdminId();
//			stmt=con.prepareStatement("insert into admin values(?,?,?)");
//			stmt.setInt(1, AdminId);
//			stmt.setString(2,model.getUsername());
//			stmt.setString(3, model.getPass());
//			int value=stmt.executeUpdate();
//			if(value>0)
//			{
//				System.out.println("Admin Added Succesfully");
//			}
//			else
//			{
//				System.out.println("Admin Not Added Succesfully");
//			}
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		return false;
//	}
	@Override
	public int AddNewAdmin(Adminmodel model) {
		
		try
		{	
			int AdminId=this.getAdminId();
			stmt=con.prepareStatement("insert into admin values(?,?,?)");
			stmt.setInt(1, AdminId);
			stmt.setString(2,model.getUsername());
			stmt.setString(3, model.getPass());
			int value=stmt.executeUpdate();
			if(value>0)
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
			return 0;
		}
	
	}
	@Override
	public int CheckAdmin(String username, String pin) {
		try
		{
			System.out.println(username);
			System.out.println(pin);
			
			stmt=con.prepareStatement("select *from admin where username=? and pass=?");
			stmt.setString(1,username);
			stmt.setString(2,pin);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
				return 0;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
		
	}
	

	}
	
