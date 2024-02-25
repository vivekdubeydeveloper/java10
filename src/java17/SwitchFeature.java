package java17;

public class SwitchFeature {
    public static double calculateArea(Shape s){
        if(s instanceof Circle c){
            return 3.14 * c.radius() * c.radius();
        }else if(s instanceof Rectangle r){
            return r.l() * r.w();
        }
        return 0;
    }

    public static double calculateAreaSwitchCase(Shape s){
        //This is preview feature
      return switch (s){
           case Circle c-> 3.14 * c.radius() * c.radius();
           case Rectangle r-> r.l() * r.w();
           case null-> 0.0;
          default -> 0.0;
       };
    }
    public static void main(String[] args) {
        System.out.println(calculateArea(new Circle(10)));
        System.out.println(calculateAreaSwitchCase(new Circle(10)));
    }

}
