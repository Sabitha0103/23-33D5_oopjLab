class Demo
{
 Demo()
{
  System.out.println("EMPTY CONSTRUCTOR");
  }
   Demo(int a)
   {
    a=a*a;
   System.out.println(a);
  }
  Demo(int a,int b)
  {
   System.out.println("a value:"+a+"b value:"+b);
  }
}
class Constructoroverloading
{
  public static void Main(String args[]){
   Demo e1 =new Demo();
   Demo e2 =new Demo(5);
   Demo e3 =new Demo(4,10);
  }
 }
