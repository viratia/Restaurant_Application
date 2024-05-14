package restaurantService;

import restaurantModel.Adminmodel;

public interface AdminserviceImpl {
//	public boolean getLogin(Adminmodel model);
	public int AddNewAdmin(Adminmodel model);
	public int CheckAdmin(String username, String pin);
}
