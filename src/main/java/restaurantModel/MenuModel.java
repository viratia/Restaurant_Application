package restaurantModel;

public class MenuModel {
	private int menu_id;
	private String category;
	private String name;
	private int price;
	public MenuModel()
	{
		
	}
	public MenuModel(int menu_id,String category,String name,int price)
	{
		this.menu_id=menu_id;
		this.category=category;
		this.name=name;
		this.price=price;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
