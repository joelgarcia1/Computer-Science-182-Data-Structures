public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject
{
   private double width;
   private double height;
   
   public RectangleFromSimpleGeometricObject()
   {
   }
   
   public RectangleFromSimpleGeometricObject(double width, double height)
   {
   this.width= width;  //these needs to have this.name!!!!!!
   this.height = height;
   }
   
   public RectangleFromSimpleGeometricObject(double w, double h, String color, boolean filled)
   {
   w = width;
   h = height;
   setColor(color);
   setFilled(filled);
   
   }
   
   public double getWidth()
   {
   return width;
   }

   public void setWidth(double w)
   {
   w = width;
   }
   
   public double getHeight()
   {
   return height;
   }
   
   public void getHeight(double h)
   {
   h = height;
   }
   
   public double getArea()
   {
   return width * height;
   }
   
   public double getPerimeter()
   {
   return 2 * (height+width);
   }
}