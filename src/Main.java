import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return sideLength * sideLength;
    }

    @Override
    double perimeter() {
        return 4 * sideLength;
    }
}

class Triangle extends Shape {
    private double sideA, sideB, sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }
}

class Pentagon extends Shape {
    private double sideLength;

    Pentagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * sideLength * sideLength;
    }

    @Override
    double perimeter() {
        return 5 * sideLength;
    }
}

class Trapezoid extends Shape {
    private double base1, base2, height, side1, side2;

    Trapezoid(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double area() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    double perimeter() {
        return base1 + base2 + side1 + side2;
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Parallelogram extends Shape {
    private double base, height, side;

    Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    @Override
    double area() {
        return base * height;
    }

    @Override
    double perimeter() {
        return 2 * (base + side);
    }
}

class Parallelepiped extends Shape {
    private double length, width, height;

    Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    double perimeter() {
        // Периметр неприменим для трехмерной формы.
        return -1;
    }
}

class Cylinder extends Shape {
    private double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double perimeter() {
        // Периметр неприменим для трехмерной формы.
        return -1;
    }
}

class Sphere extends Shape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        // Периметр неприменим для трехмерной формы.
        return -1;
    }
}

class Rhombus extends Shape {
    private double side, height;

    Rhombus(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    double area() {
        return side * height;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

class Cone extends Shape {
    private double radius, slantHeight;

    Cone(double radius, double slantHeight) {
        this.radius = radius;
        this.slantHeight = slantHeight;
    }

    @Override
    double area() {
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double perimeter() {
        // Периметр неприменим для трехмерной формы.
        return -1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите фигуру:");
            System.out.println("1. Круг");
            System.out.println("2. Квадрат");
            System.out.println("3. Треугольник");
            System.out.println("4. Пятиугольник");
            System.out.println("5. Трапеция");
            System.out.println("6. Прямоугольник");
            System.out.println("7. Параллелограмм");
            System.out.println("8. Параллелепипед");
            System.out.println("9. Цилиндр");
            System.out.println("10. Сфера");
            System.out.println("11. Ромб");
            System.out.println("12. Конус");
            System.out.println("Для выхода - введите любой вариант, кроме 1-12!");
            String choice = sc.nextLine();

            if (!(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") ||
                    choice.equals("5") || choice.equals("6") || choice.equals("7") || choice.equals("8") ||
                    choice.equals("9") || choice.equals("10") || choice.equals("11") || choice.equals("12"))) {
                break;
            }


            switch (choice) {
                case "1":
                    // Расчеты для круга
                    System.out.print("Введите радиус круга: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Площадь: " + circle.area());
                    System.out.println("Периметр: " + circle.perimeter());
                    break;
                case "2":
                    // Расчеты для квадрата
                    System.out.print("Введите длину стороны квадрата: ");
                    double sideLength = sc.nextDouble();
                    Square square = new Square(sideLength);
                    System.out.println("Площадь: " + square.area());
                    System.out.println("Периметр: " + square.perimeter());
                    break;
                case "3":
                    // Расчеты для треугольника
                    System.out.print("Введите длины сторон треугольника (через пробел): ");
                    double sideA = sc.nextDouble();
                    double sideB = sc.nextDouble();
                    double sideC = sc.nextDouble();
                    Triangle triangle = new Triangle(sideA, sideB, sideC);
                    System.out.println("Площадь: " + triangle.area());
                    System.out.println("Периметр: " + triangle.perimeter());
                    break;
                case "4":
                    // Расчеты для пятиугольника
                    System.out.print("Введите длину стороны пятиугольника: ");
                    double sideLengthPentagon = sc.nextDouble();
                    Pentagon pentagon = new Pentagon(sideLengthPentagon);
                    System.out.println("Площадь: " + pentagon.area());
                    System.out.println("Периметр: " + pentagon.perimeter());
                    break;
                case "5":
                    // Расчеты для трапеции
                    System.out.print("Введите первое основание трапеции: ");
                    double base1 = sc.nextDouble();
                    System.out.print("Введите второе основание трапеции: ");
                    double base2 = sc.nextDouble();
                    System.out.print("Введите высоту: ");
                    double height = sc.nextDouble();
                    System.out.print("Введите левую сторону: ");
                    double side1 = sc.nextDouble();
                    System.out.print("Введите правую сторону: ");
                    double side2 = sc.nextDouble();
                    Trapezoid trapezoid = new Trapezoid(base1, base2, height, side1, side2);
                    System.out.println("Площадь: " + trapezoid.area());
                    System.out.println("Периметр: " + trapezoid.perimeter());
                    break;
                case "6":
                    // Расчеты для прямоугольника
                    System.out.print("Введите первую сторону: ");
                    double length = sc.nextDouble();
                    System.out.print("Введите вторую сторону: ");
                    double width = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Площадь: " + rectangle.area());
                    System.out.println("Периметр: " + rectangle.perimeter());
                    break;
                case "7":
                    // Расчеты для параллелограмма
                    System.out.print("Введите основание: ");
                    double base = sc.nextDouble();
                    System.out.print("Введите высоту: ");
                    height = sc.nextDouble();
                    System.out.print("Введите боковую сторону: ");
                    double side = sc.nextDouble();
                    Parallelogram parallelogram = new Parallelogram(base, height, side);
                    System.out.println("Площадь: " + parallelogram.area());
                    System.out.println("Периметр: " + parallelogram.perimeter());
                    break;
                case "8":
                    // Расчеты для параллелепипеда
                    System.out.println("Введите сторону a: ");
                    double side_a = sc.nextDouble();
                    System.out.println("Введите сторону b: ");
                    double side_b = sc.nextDouble();
                    System.out.println("Введите сторону c: ");
                    double side_c = sc.nextDouble();
                    Parallelepiped parallelepiped = new Parallelepiped(side_a, side_b, side_c);
                    System.out.println("Площадь: " + parallelepiped.area());
                    System.out.println("Периметр: " + parallelepiped.perimeter());
                    break;
                case "9":
                    // Расчеты для цилиндра
                    System.out.println("Введите радиус цилиндра: ");
                    radius = sc.nextDouble();
                    System.out.println("Введите высоту цилиндра: ");
                    height = sc.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println("Площадь: " + cylinder.area());
                    System.out.println("Периметр: " + cylinder.perimeter());
                    break;
                case "10":
                    // Расчеты для сферы
                    System.out.println("Введите радиус сферы: ");
                    radius = sc.nextDouble();
                    Sphere sphere = new Sphere(radius);
                    System.out.println("Площадь: " + sphere.area());
                    System.out.println("Периметр: " + sphere.perimeter());
                    break;
                case "11":
                    // Расчеты для ромба
                    System.out.println("Введите основание ромба: ");
                    side = sc.nextDouble();
                    System.out.println("Введите высоту: ");
                    height = sc.nextDouble();
                    Rhombus rhombus = new Rhombus(side, height);
                    System.out.println("Площадь: " + rhombus.area());
                    System.out.println("Периметр: " + rhombus.perimeter());
                    break;
                case "12":
                    // Расчеты для конуса
                    System.out.println("Введите радиус основания: ");
                    radius = sc.nextDouble();
                    System.out.println("Введите гипотенузу: ");
                    double slantHeight = sc.nextDouble();
                    Cone cone = new Cone(radius, slantHeight);
                    System.out.println("Площадь: " + cone.area());
                    System.out.println("Периметр: " + cone.perimeter());
                    break;
            }
            sc.nextLine();
        }
    }
}