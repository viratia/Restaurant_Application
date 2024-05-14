package restaurantService;

import java.util.List;

import restaurantModel.HotelTableModel;

public interface HotelTableServiceImpl {
	public int isAddTable(HotelTableModel hm);
	public List<HotelTableModel>ShowTables();
//	public int isDeleteTable(int Hid);
	public int isDeleteTable(HotelTableModel hm);
	public boolean isUpdateTable(HotelTableModel hm);
}
