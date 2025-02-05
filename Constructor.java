class Constructor{
        //defecult constructoR
          String name;
           int ID;
        //default constructor
          Constructor(){
          name="default name";
          ID=0;
          System. out. println("default constructor");
         }
         Constructor(String name,int ID){
                  this.name=name;
                  this.ID=ID;
                  System. out. println("parameterized constructor");
        } 
         void display(){
            System. out. println("name:"+name);
             System. out. println("ID:"+ID);
        }
        public static void main(String[] args){
          //calling the default constructor
           Constructor obj1=new Constructor();
           obj1.display();
           // calling the parametiried constructor 
           Constructor obj2=new Constructor("alice",33);
           obj2.display();
        }
}