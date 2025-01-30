public class DefaultValues{
       byte defaultByte;
       short defaultShort;
       int defaultInt;
       long defaultLong;
       float defaultFloat;
       double defaultDouble;
       Boolean defaultBoolean;
       char defaultChar;
   public static void main(String[] args){
       DefaultValues value=new DefaultValues();
       System.out.println("default value of byte:"+value.defaultByte);
       System.out.println("default value of short:"+value.defaultShort);
       System.out.println("default value of int:"+value.defaultInt);
       System.out.println("default value of long:"+value.defaultLong);
       System.out.println("default value of float:"+value.defaultFloat);
       System.out.println("default value of double:"+value.defaultDouble);
       System.out.println("default value of boolean:"+value.defaultBoolean);
       System.out.println("default value of char:"+value.defaultChar);
   }
}