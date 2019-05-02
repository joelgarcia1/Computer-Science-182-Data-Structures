public class Test
{
   public static void main(String[]args)
   {
   CircleFromSimpleObject circle = new CircleFromSimpleObject(1);  // 1 = radius
   System.out.println("A circle " + circle.toString());  //invokes toString
   System.out.println("The color is " + circle.getColor()); //invokes getColor
    System.out.println("The radius is " + circle.getRadius());   //gets radius
    System.out.println("The area is " + circle.getArea());   // gets area
    System.out.println("The diameter is " + circle.getDiameter());  //gets diameter

   RectangleFromSimpleGeometricObject rectangle = 
   new RectangleFromSimpleGeometricObject(2,4);  // 2 = width, 4 = height
   
   System.out.println("\nA rectangle " + rectangle.toString());  //invokes a toString
   System.out.println("The area is " + rectangle.getArea());  //gets area
   System.out.println("The perimeter is " + rectangle.getPerimeter());
   }
}