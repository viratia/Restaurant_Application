package restaurantModel;

public class HotelTableModel {
	private int table_id;
	private int table_no;
	private String status;
	public int getTable_id() {
		return table_id;
	}
	public void setTable_id(int table_id) {
		this.table_id = table_id;
	}
	public int getTable_no() {
		return table_no;
	}
	public void setTable_no(int table_no) {
		this.table_no = table_no;
	}
	public String getStauts() {
		return status;
	}
	public void setStauts(String status) {
		this.status = status;
	}
	public HotelTableModel(int table_id,int table_no,String status)
	{
		this.table_id= table_id;
		this.table_no = table_no;
		this.status=status;
	}
	public HotelTableModel() {
		
	}

}
