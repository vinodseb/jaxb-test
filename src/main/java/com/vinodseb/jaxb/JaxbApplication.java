package com.vinodseb.jaxb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

@SpringBootApplication
public class JaxbApplication {

	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(JaxbApplication.class, args);
		var customer = new Customer();
		customer.setName("vinod");
		customer.setGivenName(Arrays.asList("name1","name2"));

		var app = new JaxbApplication();
		app.marshall(customer);
	}

	public void marshall(Customer customer) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller mar= context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(customer, new File("./customer.xml"));
	}
}
