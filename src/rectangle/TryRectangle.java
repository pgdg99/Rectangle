/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;
public class TryRectangle {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insert base: ");
        double base = input.nextDouble();
        
        System.out.println("Insert height: ");     
        double height = input.nextDouble();
        
        Rectangle R1 = new Rectangle (base,height);
        System.out.println("The Rectangle has an area of " + R1.area() + " and a perimeter of " + R1.perimeter());
    }
}
