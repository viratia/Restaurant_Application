package restaurantService;

import java.util.List;

import restarurantRepository.CustomerRepository;
import restaurantModel.CustomerModel;
import restaurantModel.HotelTableModel;

public class CustomerService implements CustomerServiceImpl{
	CustomerRepository cRepo=new CustomerRepository();

	@Override
	public int isAddCustomer(CustomerModel cm) {
		return cRepo.isAddCustomer(cm);
	}

	@Override
	public List<CustomerModel> showCustomer() {
		return cRepo.showCustomer();
	}

	@Override
	public int DeleteCustomer(CustomerModel cm) {
		return cRepo.DeleteCustomer(cm);
	}

	@Override
	public boolean isUpdateCustomer(CustomerModel cm ) {
		// TODO Auto-generated method stub
		return cRepo.isUpdateCustomer(cm);
	}

	@Override
	public List<CustomerModel> SearchByCusomer(String str) {
		// TODO Auto-generated method stub
		return cRepo.SearchByCusomer(str);
	}

}
