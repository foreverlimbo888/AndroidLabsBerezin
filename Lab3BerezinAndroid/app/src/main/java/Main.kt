fun main()
{
    val figure1 = Figure(10, 10)
    val figure2 = Figure(10, 5)
    val figure3 = Figure(10, 2)

    val ourFigures = listOf(figure1, figure2, figure3)

    var sumFigures = 0
    ourFigures.forEach()
    {
        sumFigures+=it.area
    }

    println("The area of figure:\n1 + 2 + 3 is: "+sumFigures)

    val shape1 = Shape.Rectangle(1,2)

    val shape2 = Shape.Oval(3,4)
    val shape3 = Shape.Oval(5,6)

    val shape4 = Shape.Line(7)
    val shape5 = Shape.Line(8)
    val shape6 = Shape.Line(9)

    val Shapes = listOf(shape1,shape2,shape3,shape4,shape5,shape6)

    val RectangleCount_2: Int = Shapes.filterIsInstance<Shape.Rectangle>().count()
    val OvalCount_2: Int = Shapes.filterIsInstance<Shape.Oval>().count()
    val LineCount_2: Int = Shapes.filterIsInstance<Shape.Line>().count()

    println("\n<<Filters>>")
    println("Rectangle: "+RectangleCount_2)
    println("Oval: "+OvalCount_2)
    println("Line: "+LineCount_2)

    var RectangleCount_3: Int = 0
    var OvalCount_3: Int = 0
    var LineCount_3: Int = 0

    Shapes.forEach{
        when(it){
            is Shape.Line -> LineCount_3++
            is Shape.Oval -> OvalCount_3++
            is Shape.Rectangle -> RectangleCount_3++
        }
    }

    println("\n<<When>>")
    println("Rectangle: "+RectangleCount_3)
    println("Oval: "+OvalCount_3)
    println("Line: "+LineCount_3)
}
