package org.amicofragile.slsw.scala

class HelloScala(message : String) {
	def this() = this("Hello")
	
	def sayHello : String =  { "Hello, Scala!" }
	
	def sayHelloTo(to : String) : String = { message + ", " + to + "!" }
}