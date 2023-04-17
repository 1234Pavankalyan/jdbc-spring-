package helloworld;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class UserRepositoryImpl implements UserInterface{

	public List<String> getUsers() {
		// TODO Auto-generated method stub
		List<String>users=new ArrayList<String>();
		users.add("pavan");
		users.add("kalyan");
		users.add("vinay");
		users.add("babu");
		users.add("kavya");
		
		return users;
	}

}
