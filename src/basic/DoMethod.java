package basic;

public class DoMethod {

    public void DoSummation(){
        int num1=10;
        int num2=20;
        int summation =num1+num2;
        System.out.println(summation);
    }
public void DoMultiply(int newa,int newb){
    int a=newa;
    int b=newb;
    int multiply=newa/newb;
    System.out.println(multiply);}
    public int division () {
        int x = 100;
        int y = 20;
        int division = x / y;
        System.out.println(division);
        return division;
    }
    public int summation(int newn ,int newm){
        int n=newn;
        int m=newm;
        int summation=newn+newm;
        System.out.println(summation);
        return summation;

    }



    public static void main(String[] args) {
        DoMethod obj = new DoMethod();
        obj.DoSummation();
obj.DoMultiply(100,20);
obj.division();
obj .summation(20,30);


    }
}
