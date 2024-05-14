package restaurantService;

import java.util.List;

import restarurantRepository.MenuRepository;
import restaurantModel.MenuModel;

public class MenuService implements MenuServiceImpl{
	MenuRepository mrepo=new MenuRepository();

	@Override
	public int AddMenu(MenuModel mm) {
		
		return mrepo.AddMenu(mm);
	}

	@Override
	public List<MenuModel> showMenu() {
		
		return mrepo.showMenu();
	}

	@Override
	public int isDeleteMenu(MenuModel mm) {
		// TODO Auto-generated method stub
		return mrepo.isDeleteMenu(mm);
	}

	@Override
	public boolean isUpdateMenu(MenuModel mm) {
		// TODO Auto-generated method stub
		return mrepo.isUpdateMenu(mm);
	}
public List<MenuModel> searchMenu(String str) {
		
		return mrepo.searchMenu(str);
	}


}
