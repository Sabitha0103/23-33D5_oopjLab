
public class QuadraticValues{
       public static void main(String[] args){
           QuadraticValues val=new QuadraticValues();
           System.out.println("enter the coefficient of a:");
           double a=val.nextDouble();
           System.out.println("enter the coefficient of b:");   
           double b=val.nextDouble();
           System.out.println("enter the coefficient of c:");   
           double c=val.nextDouble();
//discriminant value
            D=b*b-4*a*c;
if(D>0){
     System.out.println("the roots are real and distinct");
}elseif(D==0){
     System.out.println("the roots are real and equal");
} else 
     System.out.println("the roots are imaginary");
}
}

