
public class ValidateUser {
	
	public boolean validateUser(String username, String password) throws LoginException
	{
		
		if (username==null && password ==null)
		{
			throw new LoginException("username and passwords are null");
		}
		else if(username.equals("admin") && password.equals("admin1234"))
		{
			return true;
		}
		else 
		 return false;
	}

}
