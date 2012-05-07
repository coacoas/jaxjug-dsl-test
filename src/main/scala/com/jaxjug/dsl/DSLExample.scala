package com.jaxjug.dsl

object DSLExample {
	case class Answer(n: Int) {
		def afraidOf(m: Int) = m match {
			case 7 if n == 6 => ("Because" :: (7 to 9).toList).mkString(" ")
			case _ => "I don't know"
		}
	}

	object why {
		def was(n: Int) = Answer(n)
	}
}


object ShowDSL extends App {
	import DSLExample._
	println(why was 6 afraidOf 7)
}