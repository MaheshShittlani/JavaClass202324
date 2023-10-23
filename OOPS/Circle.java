/**
 * Class Name
 * ---------------------
 * CircleModel
 * MyCircle
 * 
 * Mehtod Name - Camel Case
 * --------------------------
 * computeArea()
 * computePerimeter()
 * printArea()
 * 
 * Terminilogy
 * -----------------------
 *  () -> Parenthisis
 *  {} -> curly brackets
 *  [] -> square brackets
 */
class Circle {
    int radius;

    double computeArea() {
        return 3.14 * radius * radius;
    }
    double computePerimeter() {
        return 2 * 3.14 * radius;
    }
}