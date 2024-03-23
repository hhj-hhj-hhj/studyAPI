public class sketch {
    public static void main(String[] args) {
        method(fun::printID);
    }
    public static void method(func f){
        String s = "hello world";
        f.fun(s);
    }
}

class fun{
    public static void printID(String s){
        for(char c : s.toCharArray()){
            int id = c;
            System.out.print(id + " ");
        }
    }

}
interface func{
    void fun(String s);
}