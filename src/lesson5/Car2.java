
package lesson5;

public class Car2 {
    
    Car2(){} // так выглядит дефолтный конструктор для класса. не имеет параметров и в теле конструктора пусто
    // однако этот конструктор не дефолтный, так как мы сами его написали

    
    String color, engine;
    int speed = 0;
    
    int carIsMoving(int speedUp){ // метод увеличения скорости
        
        speed += speedUp; // увеличение скорости на значение переменной(параметра) speedUp
        return speed; // возвращается новое значение переменной скорости
    }
    
    int carIsSlowDown(int speedDown){ // метод уменьшения скорости
    
        speed -= speedDown;
        return speed;
    }
    
    void showInfo(){ //void означает, что мы ничего не возвращаем, поэтому нет параметров метода
    
        // вывод на экран не является возвращаемым методом
        System.out.println("Color " + color + " Engine " + engine + " Speed " + speed);
    }
    
}


class Car2Test{

    public static void main(String[] args) {
        
        Car2 car = new Car2();
        car.color = "white";
        car.engine = "V6";
        car.speed = 60;
        
        car.showInfo();
        
        car.carIsMoving(20);
        car.showInfo();
        
        car.carIsSlowDown(80);
        car.showInfo();
    }
}
