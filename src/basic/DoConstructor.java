package basic;

 public class DoConstructor {
String name;
String address;
int age;

  //defalt constructor
 public DoConstructor () {
     System.out.println("i am pnt student");
 }
 //single paramitarige
    public DoConstructor (String newname) {
     this. name=newname;
        System.out.println("my name is " + newname);
    }

    public DoConstructor (String newname ,String newaddress ,int newage) {
this.name=newname;
this.address=newaddress;
this.age=newage;
        System.out.println("my name is " +newname +"my address is " + newaddress + "my age is " +newage);

    }

    public static void main(String[] args) {

        DoConstructor  obj = new DoConstructor();

        DoConstructor  obj1= new DoConstructor("rume");
        DoConstructor  obj2= new DoConstructor("rume" , "bensalem" ,29);


    }

}
