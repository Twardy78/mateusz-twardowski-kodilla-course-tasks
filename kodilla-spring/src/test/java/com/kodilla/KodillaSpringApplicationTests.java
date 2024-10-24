package com.kodilla;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void testCiecleLodedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = context.getBean(Circle.class);

		//When
		String name = shape.getShapeName();

		//Then
		assertEquals("This is a circle.", name);
	}
//
//	@Test
//	void testTriangleLoadedIntoContainer() {
//		//Given
//		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//		Shape shape = context.getBean(Triangle.class);
//
//		//When
//		String name = shape.getShapeName();
//
//		//Then
//		assertEquals("This is a triangle.", name);
//	}

	@Test
	void testSquareLoadaedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = context.getBean(Square.class);

		//When
		String name = shape.getShapeName();

		//Thwn
		assertEquals("This is a square.", name);
	}

	@Test
	void testShapeLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("chosenShape");

		//When
		String name = shape.getShapeName();

		//Then
		System.out.println("Chosen shape says : " + name);
	}

}
