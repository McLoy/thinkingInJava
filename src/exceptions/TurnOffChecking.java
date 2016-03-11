package exceptions;

/**
 * Created by Ostin on 21.11.2015.
 */

import java.io.*;

class WrapCheckedException{
    void throwRuntimeException(int type){
        try{
            switch (type){
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Где Я,");
                default: return;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception{}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        wce.throwRuntimeException(3);
        for (int i = 0; i<4;i++)
            try{
                if (i<3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            }catch (SomeOtherException e){
                System.out.println("SomeOtherException " + e);
            }catch (RuntimeException re){
                try{
                    throw re.getCause();
                }catch (FileNotFoundException e){
                    System.out.println("FileNotFoundException " + e);
                }catch (IOException e){
                    System.out.println("IOException " + e);
                }catch (Throwable e){
                    System.out.println("Throwable " + e);
                }
            }
    }
}