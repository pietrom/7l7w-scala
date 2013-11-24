package org.amicofragile.slsw.scala

import org.junit.Assert
import org.junit.Test

class FunctionalityTest {
	@Test
	def listAndFoldLeft()  {
		val ints = List(1, 2, 3, 4, 5)
		val result = ints.foldLeft(0)((x, y) => x + y)
		Assert.assertEquals(15, result)
	}
	
	@Test
	def customAdder() {
	  def adder (x : Int) = (y : Int) => x + y
	  
	  val result = adder(10)(15)
	  Assert.assertEquals(25, result)
	}
}