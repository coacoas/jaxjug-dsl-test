package com.jaxjug.dsl

import org.scalatest._
import org.scalatest.matchers._
import com.jaxjug.dsl.DSLExample._

class DSLExampleTest extends FunSuite with ShouldMatchers { 
  test("The DSL") {
  	(why was 6 afraidOf 7) should equal ("Because 7 8 9")
  }
}
