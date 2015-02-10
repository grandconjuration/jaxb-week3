package les2;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbMain2 {
	
    public static void main(String[] args) {
    	File file = new File("/home/simon/Bureaublad/file2.xml");
    	
    	try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customerIn = (Customer) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(customerIn);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("done");
    }

}
