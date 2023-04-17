package helloworld;
import java.util.Map;
import java.util.List;
import java.util.Set;
public class employee {
	private String Name;
	private List<String>mobile;
	private Set<String>address;
	private Map<String,String>role;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getRole() {
		return role;
	}
	public void setRole(Map<String, String> role) {
		this.role = role;
	}
	

}
