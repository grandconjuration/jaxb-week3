package les2;

import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "les2")
public class Customer {
	
	private String name;
	private Date dateOfBirth;
	private HashMap<String, Address> addresses;
	public HashMap<String, Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(HashMap<String, Address> addresses) {
		this.addresses = addresses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", addresses=" + addresses + "]";
	}

}
