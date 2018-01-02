/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week10.ioPackage;

import java.io.*; 
class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Ryan";
      e.address = "Kempang, Brunei";
      e.SSN = 11122333;
      e.number = 101;
      
      Employee p = new Employee("AAA", "dhaka", 10, 50);
      
      try {
         FileOutputStream fileOut = new FileOutputStream("employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.writeObject(p);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
