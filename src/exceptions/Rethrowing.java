package exceptions;

/**
 * Created by Ostin on 20.11.2015.
 */
public class Rethrowing {
    public static void f()throws Exception{
        System.out.println("Создание исключения в f()");
        throw new Exception("возбуждено из f()");
    }

    public static void g()throws Exception{
        try{
            f();
        } catch (Exception e){
            System.out.println("В методе g(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h()throws Exception{
        try{
            f();
        } catch (Exception e){
            System.out.println("В методе h(), e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            g();
        }catch (Exception e){
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }

        try{
            h();
        }catch (Exception e){
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
