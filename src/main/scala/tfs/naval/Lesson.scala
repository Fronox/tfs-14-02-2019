package tfs.naval


object Lesson {

  val fieldSize = 10
  val field: Field = Vector.fill(fieldSize)(
    Vector.fill(fieldSize)(false)
  )

  val input = Vector(
    ("MillenniumFalcon", List(
      (2, 5),
      (3, 5),
      (4, 5),
      (5, 5),
    )),
    ("Varyag", List(
      (9, 9)
    ))
  )
}