interface Methods{
    
    default void get() {
   	 saySomething();
   	 }
   	 
   	 private void saySomething() {
   		 System.out.println("Hello... This is Private method");
   	 }
    }

public class JavaE1 implements Methods{
    public static void main(String[] args) {
   	 Methods upm=new JavaE1();
   	 upm.get();
    }

}