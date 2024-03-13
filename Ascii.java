public class Ascii {
    public static void main(String[] args){
        String str="abc ABC";
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                System.out.print(" ");
            } 
            int ascii=(int) c;
            // System.out.print(ascii);
            String string= String.valueOf(ascii);
        }
        System.out.print(s);
    }
}
//an abstract class can contain both abstract method amd non abstract
//cant make object of abstract class
//it is mandatory to define and override the abstract method of parent class
//abstract classes can have constructor but not object so that child class can call the super class
//by default every method in an interface is public and abstract
//interfaces cant have constructors
//by default every variable in an interface is final so we need to initialize it.
//multiple inheritance in java is not possible but can be possible through interfaces because functions are just declared and not defined in interfaces
// for an interface to inherit another interface we dont use implements keyword we use extends keyword. Implements otherwise