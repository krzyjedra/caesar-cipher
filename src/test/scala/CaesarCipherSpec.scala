import org.scalatest._
import flatspec._
import matchers._

class CaesarCipherSpec extends AnyFlatSpec with should.Matchers {

  import CaesarCipher._

"countingMethod" should "be 'a' for input ('a', 0)" in {
  countingMethod('a', 0) shouldBe 'a'
}
 it should "give output 'b' for input ('z', 2)" in {
   countingMethod('z', 2) shouldBe 'b'
 }
}