package restaurantService;

import restarurantRepository.Adminrepository;
import restarurantRepository.Adminrepositoryimpl;
import restaurantModel.Adminmodel;

public class Adminservice implements AdminserviceImpl{
	Adminrepositoryimpl aRepo= new 	Adminrepository();
//	@Override
//	
//	public boolean getLogin(Adminmodel model) {
//		return aRepo.getLogin(model);
//	}
	@Override
	public int AddNewAdmin(Adminmodel model) {
		
		return aRepo.AddNewAdmin(model);
	}
	@Override
	public int CheckAdmin(String username, String pin) {
		// TODO Auto-generated method stub
		return aRepo.CheckAdmin(username,pin);
	}
	

}
