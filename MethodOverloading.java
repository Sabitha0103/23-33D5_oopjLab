
class MethodOverloading{
          public int calculate(int a, int b){
                 return a*b;
          }
          public int calculate(int a, int b, int c){
                 return a+b+c;
         }
         public double calculate(double a, double b){
                 return a-b;
         }
         public float calculate(float a, float b){
                 return a+b;
         }
     public static void main(String[] args){
              MethodOverloading mol=new MethodOverloading();
              System. out. println("multiplication of two integer:"+mol.calculate(2,3));
              System. out. println("addition of 3 integers:"+mol.calculate(4,5,6));
              System. out. println("subtraction of 2 double values:"+mol.calculate(10.5,20.0));
              System. out. println("addition of 3 float values:"+mol.calculate(2.0,4.0));
    }
}