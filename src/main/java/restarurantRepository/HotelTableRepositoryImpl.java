package restarurantRepository;

import java.util.List;

import restaurantModel.HotelTableModel;

public interface HotelTableRepositoryImpl 
{
	public int isAddTable(HotelTableModel hm);
	public List<HotelTableModel>ShowTables();
	public int isDeleteTable(HotelTableModel hm);
	public boolean isUpdateTable(HotelTableModel hm);
}
