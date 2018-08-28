package basics

class HitBox(
  private var _cx: Double = 0.0,
  private var _cy: Double = 0.0,
  val width: Double = 1.0,
  val height: Double = 1.0
  ){
  
  def cx = _cx
  def cy = _cy
  
  def intersects(that: HitBox): Boolean = {
    val overlapX = (cx - that.cx).abs < 0.5*(width  + that.width)
    val overlapY = (cx - that.cx).abs < 0.5*(height + that.height)
    overlapX && overlapY 
  }
}