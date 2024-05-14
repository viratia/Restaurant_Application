package restarurantRepository;

import restaurantModel.Adminmodel;

public interface Adminrepositoryimpl {

//	public boolean getLogin(Adminmodel model);
	public int AddNewAdmin(Adminmodel model);
	public int CheckAdmin(String username, String pin);
}
