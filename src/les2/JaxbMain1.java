package les2;

import java.io.File;
import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class JaxbMain1 {
	
    public static void main(String[] args) {
    	File file = new File("/home/simon/Bureaublad/file2.xml");
    	
    	try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			Customer customer = new Customer();
			customer.setName("test");
			customer.setDateOfBirth(new Date());
			
			HashMap<String, Address> a = new HashMap<String, Address>();
			
			Address ad1 = new Address();
			ad1.setCity("Arnhem");
			ad1.setStreet("Straat 1");
			ad1.setZip("6932CJ");
			
			Address ad2 = new Address();
			ad2.setCity("Amsterdam");
			ad2.setStreet("Straat 2");
			ad2.setZip("1234AB");	
			
			a.put("shipping", ad1);
			a.put("billing", ad2);
			
			customer.setAddresses(a);
			
			// output mooi uitgelijnd
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(customer, file);
		} catch (PropertyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
    	System.out.println("done");
    }

}
