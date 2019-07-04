package com.myapp.ws.marshaller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.joda.time.LocalDate;

import com.myapp.ws.model.ObjectFactory;
import com.myapp.ws.model.Orders;


public class TestMarshaller {

	public static void main(String[] args) throws JAXBException, IOException 
	{
		// TODO Auto-generated method stub

		ObjectFactory factory= new ObjectFactory();
		Orders orders=factory.createOrders();
		JAXBContext context= JAXBContext.newInstance(Orders.class);
		Marshaller marshaller= context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Orders.Order order1= new Orders.Order(1,"IPHONEX","Iphonex",10000.0,"http://iphonex",LocalDate.now(),4.5);

		Orders.Order order2= new Orders.Order(4,"Oneplus 7 pro","OnePlus7Pro",590000.0,"http://oneplus",LocalDate.now(),4.5);
	
	
		
		
		orders.getOrder().add(order1);
		orders.getOrder().add(order2);
		
		marshaller.marshal(orders, System.out);
		marshaller.marshal(orders, new FileWriter("orders.xml"));
 	
	}

}
