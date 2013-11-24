package org.amicofragile.slsw.scala

import org.junit.Test
import org.junit.Assert;

class HelloScalaTest {
	@Test
	def sayHelloWorld() {
	  val hw = new HelloScala()
	  Assert.assertEquals("Hello, Scala!", hw.sayHello)
	}
	
	@Test
	def sayHelloTo() {
	  val hw = new HelloScala()
	  Assert.assertEquals("Hello, World!", hw.sayHelloTo("World"))
	}
	
	@Test
	def sayHelloToUsingCustomMessage() {
	  val hw = new HelloScala("Hi")
	  Assert.assertEquals("Hi, World!", hw.sayHelloTo("World"))
	}
}