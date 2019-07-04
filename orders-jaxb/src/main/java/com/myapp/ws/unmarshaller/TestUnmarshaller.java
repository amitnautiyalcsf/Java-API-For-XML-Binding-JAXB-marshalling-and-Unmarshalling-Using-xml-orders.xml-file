package com.myapp.ws.unmarshaller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.myapp.ws.model.Orders;


public class TestUnmarshaller {

	public static void main(String[] args) throws JAXBException, FileNotFoundException 
	{
		
	
		JAXBContext context= JAXBContext.newInstance(Orders.class);
	 
		Unmarshaller um= context.createUnmarshaller();
		Orders orders = (Orders) um.unmarshal(new FileReader("orders.xml"));
		
		System.out.println(orders);
		
	

	}

}
