package ACM_Practice;
import java.util.*;
import java.text.DecimalFormat;
public class practiceFour {
   public static void main(String[] args) {
      Scanner a = new Scanner(System.in);
      int count = a.nextInt();
      for(int i = 0; i < count; i++) {
         method(a.nextDouble(),a.nextDouble(), a.nextDouble(), a.nextDouble(), a.nextDouble(), a.nextDouble(), a.nextDouble(), a.nextDouble());
      }
   }
   public static void method(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
      double x = 0;
      double y = 0;
      if(x1 != x2 && x3 != x4) {
         double m1 = (y2 - y1) / (x2 - x1);
         double m2 = (y4 - y3) / (x4 - x3);
         double b1 = y1 - m1 * x1;
         double b2 = y3 - m2 * x3;
      
         x = (b2 - b1) / (m1 - m2);
         y = m1 * x + b1;
      }
      else if(x1 == x2) {
         double m2 = (y4 - y3) / (x4 - x3);
         double b2 = y3 - m2 * x3;
         x = x1;
         y = m2 * x + b2;
      }
      else {
         double m1 = (y2 - y1) / (x2 - x1);
         double b1 = y1 - (m1 * x1);
         x = x3;
         y = m1 * x + b1;
      }   
      x = Double.parseDouble(new DecimalFormat(".######").format(x));
      y = Double.parseDouble(new DecimalFormat(".######").format(y));
      System.out.println("(" + x + "," + y + ")");
   }
}