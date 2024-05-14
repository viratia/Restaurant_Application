package restaurantService;

import java.util.List;

import restarurantRepository.HotelTableRepository;
import restaurantModel.HotelTableModel;
import restaurantconfig.DBConfig;

public class HotelTableService  implements HotelTableServiceImpl{
	HotelTableRepository hRepo=new HotelTableRepository();

	@Override
	public int isAddTable(HotelTableModel hm) {
	
		return hRepo.isAddTable(hm);
	}

	@Override
	public List<HotelTableModel> ShowTables() {
		
		return hRepo.ShowTables();
	}


	@Override
	public int isDeleteTable(HotelTableModel hm) {
		// TODO Auto-generated method stub
		return hRepo.isDeleteTable(hm);
	}

	@Override
	public boolean isUpdateTable(HotelTableModel hm) {
		// TODO Auto-generated method stub
		return hRepo.isUpdateTable(hm);
	}
	
}
