/*
На вход подаётся строка текста. Выведите её первый и последний элемент в одну строку через пробел. 

Sample Input:

abracadabra
Sample Output:

a a
*/

import java.util.Scanner; 

class MyProgram { public static void main(String[] args) 
           { Scanner sc=new Scanner(System.in); 
             String text = sc.nextLine(); 
             char eln = text.charAt(0); 
             int x = text.length()-1; 
             char elk = text.charAt(x); 
             System.out.println(eln + " " + elk); 
             } 
    
}