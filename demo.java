interface abc{
    void x();
}
interface abcd extends abc{
    void x();
}
class demo1 implements abcd{
    public void x(){
        System.out.println("hello");
    }
}
class demo{
   public static void main(String[] arg){
        System.out.println("hello");
        demo1 a = new demo1();
        a.x();
    }
}