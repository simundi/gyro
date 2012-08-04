
import org.scalatest.FunSuite

class IteratorTest extends FunSuite{

  test("test FOR #1") {
    var result = Loops.contactWithComma(Array("2" , "3"))
    assert( result === "2,3,")     
  }


  test("test FOR #2") {
    var result = Loops.contactWithSpace(Array("0" , "1", "2" , "3"))
    assert( result === "0 1 2 3 ")     
  }

}