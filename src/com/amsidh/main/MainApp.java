/**
 * 
 */
package com.amsidh.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.service.ShapeService;

/**
 * @author VIRU
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

		ShapeService shapeService=(ShapeService)context.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
	}

}
