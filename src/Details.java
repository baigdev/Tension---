
public class Details {

	private String name,pass,gender,phone,email,cnic;
	
	public Details()
	{
		
	}
	public Details(String n, String g, String p,String e,String c )
	{
		name = n;
		gender = g;
		phone = p;
		email = e;
		cnic = c;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setPass(String p)
	{
		pass = p;
	}
	public void setGender(String g)
	{
		gender = g;
	}
	public void setPhone(String p)
	{
		phone = p;
	}
	public void setEmail(String e)
	{
		email = e;
	}
	public void setCnic(String c)
	{
		cnic = c;
	}
	public String getName()
	{
		return name;
	}
	public String getPass()
	{
		return pass;
	}
	public String getGender()
	{
		return gender;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getEmail()
	{
		return email;
	}
	public String getCnic()
	{
		return cnic;
	}
}
