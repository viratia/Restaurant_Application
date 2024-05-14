package restarurantRepository;

import java.util.ArrayList;
import java.util.List;

import restaurantModel.HotelTableModel;
import restaurantconfig.DBConfig;

public class HotelTableRepository extends DBConfig implements HotelTableRepositoryImpl {
	public int getHotelTableid()
	{
		int Hid=0;
		try
		{
			stmt=con.prepareStatement("select max(table_id) from hoteltable");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				Hid=rs.getInt(1);
			}
			return ++Hid;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
	}
	public int isAddTable(HotelTableModel hm)
	{
		try
		{
			int table_id=this.getHotelTableid();
			stmt=con.prepareStatement("insert into hoteltable values(?,?,?)");
			stmt.setInt(1, table_id);
			stmt.setInt(2, hm.getTable_no());
			stmt.setString(3, hm.getStauts());
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
		}
		return 0;
		
	}
	@Override
		public List<HotelTableModel> ShowTables()
		{
			try
			{
				List <HotelTableModel> listtables =new ArrayList<HotelTableModel>();
				stmt=con.prepareStatement("select *from hoteltable");
				rs=stmt.executeQuery();
				while(rs.next())
				{
					HotelTableModel hm=new HotelTableModel();
					hm.setTable_id(rs.getInt(1));
					hm.setTable_no(rs.getInt(2));
					hm.setStauts(rs.getString(3));
					listtables.add(hm);
				}
				return listtables.size()>0?listtables:null;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			return null;	
		}
//	@Override
//	public int isDeleteTable(int Hid) {
//		try
//		{
//			stmt=con.prepareStatement("delete from hoteltable where table_id=?");
//			stmt.setInt(1, Hid);
//			System.out.println(Hid);
//			return stmt.executeUpdate()>0?1:0;
//			
//		}
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		return 0;
//	}
	@Override
	public int isDeleteTable(HotelTableModel hm) {

		try
		{
			stmt=con.prepareStatement("delete from hoteltable where table_id=?");
			stmt.setInt(1, hm.getTable_id());
			return stmt.executeUpdate()>0?1:0;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}
		
	}
	@Override
	public boolean isUpdateTable(HotelTableModel hm) {
		try
		{
//			System.out.println("id:"+hm.getTable_id());
//			System.out.println("no:"+hm.getTable_no());
			stmt=con.prepareStatement("update hoteltable set table_no=? where table_id=?");
			stmt.setInt(1, hm.getTable_no());
			stmt.setInt(2, hm.getTable_id());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		
	}
	}
	

