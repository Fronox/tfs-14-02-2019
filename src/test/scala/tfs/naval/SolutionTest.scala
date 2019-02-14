package tfs.naval

import org.scalatest.{FlatSpec, Matchers}

class SolutionTest extends FlatSpec with Matchers{

  "ships" should "be linear" in {
    val ship = Lesson.input(0)._2
    Solution.validateShip(ship) shouldBe true
  }

  "ships" should "be no longer then 4" in {
    val ship = List((1,2), (1, 3), (1, 4), (1, 5))
    Solution.validateShip(ship) shouldBe true

    val ship2 = List((1,2), (1, 3), (1, 4), (1, 5), (1,6))
    Solution.validateShip(ship2) shouldBe false
  }

  "ships" should "be placed separately" in {
    val (sh1Name, ship1) = Lesson.input(0)
    val (sh2Name, ship2) = Lesson.input(1)

    val field = Lesson.field
    val game: Game = (field, Map())
    val newGame: Game = Solution.tryAddShip(game, sh1Name, ship1)
    (game != newGame) shouldBe true

    val newGame2: Game = Solution.tryAddShip(newGame, sh2Name, ship2)
    (newGame != newGame2) shouldBe true
  }

  "ship" should "has positive coordinates" in {
    val ship = Lesson.input(0)._2
    Solution.checkPositiveCoordinates(ship) shouldBe true
  }

}