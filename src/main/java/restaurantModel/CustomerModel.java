package restaurantModel;

public class CustomerModel {
	private int customer_id;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	private String fname;
	private String username;
	private int contact;
	private String password;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CustomerModel(int customer_id,String fname,String username,int contact,String password)
	{
		this.customer_id=customer_id;
		this.fname=fname;
		this.username=username;
		this.contact=contact;
		this.password=password;	
	}
	public CustomerModel()
	{
		
	}

}
