
package lesson5;

/*
КОНСТРУКТОРЫ

Конструктор - создаёт объект.
Car car1 = new Car(); тип данных - переменная - присваивание адреса к объекту - вызов конструктора для создания объекта
!!!ВАЖНО!!! Имя конструктора ВСЕГДА совпадает с названием класса

Типы конструкторов

- Defaul.У любого класса есть конструктор. Компилятор создаёт дефолтный конструктор самостоятельно (пример в Car2)
- User Defined. Конструктор который мы определяем сами. Может быть с параметрами или без, тело может быть пустым или нет.

!!!! Если мы определили конструктор в классе, то компилятор не будет создавать дефолтный конструктор

!!!!!РАЗНИЦА КОНСТРУКТОРОВ И МЕТОДОВ
 - метод имеет return type или void; у конструктора никогда не имеет
 - мето дможет иметь любое имя, имя конструктора совпадает с именем класса
 */
public class Car {
    
    Car(String cvet, String motor){ //конструктор с параметрами
    
        // в параметрах cvet, motor передаются значения для переменных color, engine
        color = cvet; 
        engine = motor;
        
        System.out.println("Color " + color + ", Engine " + engine ); //можно также делать так, чтобы при создании выводилось сообщение
    }
    
    void Car(String cvet, String motor){ // А ЭТО МЕТОД!
         color = cvet; 
        engine = motor;
        
    }
    
    Car(){ // может и не быть параметров, но заполнено тело
    
        System.out.println("Car is creating");
    }
    
   /* Car(){ // можно задать значения переменным класса
        
        color = "blue";
        engine = "v12";
    } */
    
  
    
    String color, engine;
}

class CarTest{

    public static void main(String[] args) {
        // Car car1 = new Car(); // будет ошибка, потому что есть созданный конструктор с параметрами
        // а дефолтный не создался самостоятельно 
        Car car1 = new Car("yellow", "V6"); // объект класса Car, указываем параметры в конструкторе 
        
        Car car2 = new Car();
    }
}
