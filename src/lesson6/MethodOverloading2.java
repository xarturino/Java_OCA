/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 * Правила перегрузки методов
 */
public class MethodOverloading2 {

    // 1.return type может быть одинаковый или различный
    // 2. access modifier может быть как одинаковый так и разный (модификатор доступа)
    // 3. методы, отличающиеся только return type или access modifired не являются перегруженными (ошибка)
    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    protected String sum(String s1, String s2) {
        return s1 + s2;
    }
   
    //пример 3-его правила 
    //protected void sum(int a, int b){
        //System.out.println("hello");}
    
    
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mo = new MethodOverloading2();
        
        
        // пример первого правила
        int a = mo.sum(5, 7);
        System.out.println(a); 
        String s = mo.sum("hello ", "world");
        System.out.println(s);
    }
}

