package restaurantService;

import java.util.List;

import restaurantModel.CustomerModel;
import restaurantModel.HotelTableModel;

public interface CustomerServiceImpl {
	public int isAddCustomer(CustomerModel cm);
	public List<CustomerModel> showCustomer();
	public int DeleteCustomer(CustomerModel cm);
	public boolean isUpdateCustomer(CustomerModel cm);
	public List<CustomerModel> SearchByCusomer(String str);
}
