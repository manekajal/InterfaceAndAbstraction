package org.multipleinterface;


 class Main implements College,Student {

     @Override
     public void print() {
         System.out.println("College Name - Arvind Gavali College of Engg");

     }
     @Override
     public void show(){
             System.out.println(" Student Name - Kajal Mane");

     }
     public static void main(String[] args)
     {
         Main obj = new Main();
         obj.print();
         obj.show();
     }
 }
