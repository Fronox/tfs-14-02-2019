package tfs.naval

object Solution {

  // определить, подходит ли корабль по своим характеристикам
  def validateShip(ship: Ship): Boolean = {
    val (xs, ys) = ship.unzip
    (xs.forall(x => x == xs.head) || ys.forall(y => y == ys.head)) &&
      ship.nonEmpty && ship.size < 5 &&
      xs.forall(x => x > 0) && ys.forall(y => y > 0) &&
      xs.tail.foldLeft((true, xs.head))((p, x) => (p._1 && Math.abs(x - p._2) < 2, x))._1 &&
      ys.tail.foldLeft((true, ys.head))((p, y) => (p._1 && Math.abs(y - p._2) < 2, y))._1
  }

  // определить, можно ли его поставить
  def validatePosition(ship: Ship, field: Field): Boolean = ???

  // добавить корабль во флот
  def enrichFleet(fleet: Fleet, name: String, ship: Ship): Fleet = ???

  def markUsedCells(field: Field, ship: Ship): Field = ???

  def tryAddShip(game: Game, name: String, ship: Ship): Game = ???

  def checkPositiveCoordinates(ship: Ship): Boolean = ship.forall(v => v._1 > 0 && v._2 > 0)
}
