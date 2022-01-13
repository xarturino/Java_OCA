package lesson5;

/**
 * МЕТОДЫ
 *
 * Метод отображает поведение класса (действия с переменными) переменные которые
 * принимает метод(параметры) называются input , а результат метода называется
 * output
 *
 * Структура метода (на примере main) public - access modifier static - non
 * acccess modifier void - return type - тип данных, который возвращает метод
 * main - имя метода (String [] args) - параметры метода (их может и не быть, но
 * круглые скобки ставятся всё равно) {code} -тело метода, описывается вся
 * функциональность метода
 */
public class lesson5_1 {

    // создание метода
    int sum(int a, int b, int c) { //тип данных который возвр. метод -> название -> входные параметры(input)

        int result = a + b + c; // функция выполняемая в методе с входными параметрами
        return result; // output метода, return показывает что мы возвращаем результат. Всегда последнее выражение в теле метода. 
        // ВАЖНО - тип данных input и output должны совпадать
    }
    
    //вызов метода внутри метода 
    int averageSum(int a1, int b1, int c1){
       
        int averageSum = sum(a1, b1, c1)/3; // создание перем, вызов метода с параметрами и деление
        return averageSum; // возвращение результата.
    }
}

class Test {

    public static void main(String[] args) {

        int methodResult; // создание переменной, которой присвоится результат метода.

        lesson5_1 methodCall = new lesson5_1();
        methodResult = methodCall.sum(5, 3, 2); // вызов метода, метод отработал, но результата не будет видно.
        System.out.println(methodResult); // вывод результата метода
        System.out.println(methodCall.sum(5, 23, 2)); // также вариант вывода данных метода
        
        System.out.println(methodCall.averageSum(20, 40, 60)); // вывод результата работы метода на экран
    }
}
