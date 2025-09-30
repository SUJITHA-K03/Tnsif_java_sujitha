package entityclass;

public class Customerdemo  {

	private String Cname;
	private String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customerdemo c1=new Customerdemo();
        c1.setCname("suji");
        c1.setCity("villupuram");
        System.out.println(getCname);  
        
        
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
 
}
