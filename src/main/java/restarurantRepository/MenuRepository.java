package restarurantRepository;

import java.util.ArrayList;
import java.util.List;

import restaurantModel.MenuModel;
import restaurantconfig.DBConfig;

public class MenuRepository extends DBConfig implements MenuRepositoryImpl{

	public int getMenuid()
	{
		int mid=0;
		try
		{
			stmt=con.prepareStatement("select max(menu_id) from Menu");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				mid=rs.getInt(1);
			}
			return ++mid;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
		
		
		
		
	}
	public int AddMenu(MenuModel mm) {
		int menu_id=this.getMenuid();
		try
		{
			stmt=con.prepareStatement("insert into Menu values(?,?,?,?)");
			stmt.setInt(1, menu_id);
			stmt.setString(2, mm.getCategory());
			stmt.setString(3, mm.getName());
			stmt.setInt(4, mm.getPrice());
			int v=stmt.executeUpdate();
			if(v>0)
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
	@Override
	public List<MenuModel> showMenu() {
		try
		{
			List<MenuModel> listtables=new ArrayList<MenuModel>();
			stmt=con.prepareStatement("select *from Menu");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				MenuModel mm=new MenuModel();
				mm.setMenu_id(rs.getInt(1));
				mm.setCategory(rs.getString(2));
				mm.setName(rs.getString(3));
				mm.setPrice(rs.getInt(4));
				listtables.add(mm);
			}
			return listtables.size()>0?listtables:null;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	@Override
	public int isDeleteMenu(MenuModel mm) {
		try
		{
			stmt=con.prepareStatement("delete from menu where menu_id=?");
			stmt.setInt(1, mm.getMenu_id());
			return stmt.executeUpdate()>0?1:0;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
		
	}
	@Override
	public boolean isUpdateMenu(MenuModel mm) {
		try
		{
			stmt=con.prepareStatement("update menu set name=?,price=? where menu_id=?");
			stmt.setString(1, mm.getName());
			stmt.setInt(2, mm.getPrice());
			stmt.setInt(3, mm.getMenu_id());
			return stmt.executeUpdate()>0?true:false;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		
	}
	@Override
	public List<MenuModel> searchMenu(String str) {
		try
		{
			List<MenuModel> listtables=new ArrayList<MenuModel>();
			stmt=con.prepareStatement("select *from menu where name like '"+str+"%'");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				MenuModel mm=new MenuModel();
				mm.setMenu_id(rs.getInt(1));
				mm.setCategory(rs.getString(2));
				mm.setName(rs.getString(3));
				mm.setPrice(rs.getInt(4));
				listtables.add(mm);
			}
			return listtables.size()>0?listtables:null;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		
	}
}
