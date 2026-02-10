public class Basic{
    // 1. no argument, no return
    static void greet(){
        System.out.println("Hello world");
    }

    // 2. argument and no return
    static void hello(String str){
        System.out.println("hello"+str);
    }

    // 3. no argument and return
    static int add(){
        int a = 5, b = 1;
        return (a+b);
    }

    // 4. argument and return
    static int add2(int a, int b){
       return (a+b);
    }
    public static void main(String[] args) {
        //1. 
        greet();

        //2. 
        hello(" Prem");

        //3.
        int c = add();
        System.out.println(c);

        //4.
        int x = add2(5,10);
        System.out.println(x);

    }
}