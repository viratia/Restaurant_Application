package restarurantRepository;

import java.util.List;

import restaurantModel.MenuModel;

public interface MenuRepositoryImpl {
	public int AddMenu(MenuModel mm);
	public List<MenuModel> showMenu();
	public int isDeleteMenu(MenuModel mm);
	public boolean isUpdateMenu(MenuModel mm);
	public List<MenuModel> searchMenu(String str);
}
