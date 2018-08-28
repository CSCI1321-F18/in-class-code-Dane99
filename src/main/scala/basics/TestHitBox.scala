package basics

object TestHitBox {
  def main(args: Array[String]){
    {
    val hb1 = new HitBox
    val hb2 = new HitBox
    println(hb1.intersects(hb2))
    }
    {
    val hb1 = new HitBox()
    val hb2 = new HitBox(3, 0, 1.0, 0.5)
    println(hb1.intersects(hb2))
    }
    {
    val hb1 = new HitBox(0, 1)
    val hb2 = new HitBox(1, 2)
    println(hb1.intersects(hb2))
    }
  }
}