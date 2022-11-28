sealed interface Shape
{
    class Rectangle(side1:Int, side2:Int):Shape{}

    class Oval(line1:Int, line2:Int):Shape{}

    class Line(line:Int):Shape{}
}