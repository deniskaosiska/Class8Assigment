import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllExercises {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Integer[] age = {31, 32, 33};
        String[] names = {"denis", "rotem", "rika"};
        exercise1a();
        exercise1b();
        exercise2();
        exercise3();
        exercise5(age);
        exercise5(names);
        // 6. No created objected of class Math, in Main method we call only for one(same) method and in method calculate, the code don;t know how to implement variable d and the same way I don;t know a logic to get x and do not ding with x anything.
        exercise7();
        exercise8();
        exercise9();
        exercise10();
    }

    public static void exercise1a() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("H");
        stringBuilder.append("E");
        stringBuilder.append("L");
        stringBuilder.append("L");
        stringBuilder.append("O");
        System.out.println(stringBuilder);
    }

    public static void exercise1b() {
        String[] stringArray1 = new String[7];
        stringArray1[0] = "hello";
        stringArray1[1] = "world";
        stringArray1[2] = "radar";
        stringArray1[3] = "math";
        stringArray1[4] = "kayak";
        stringArray1[5] = "bank";
        stringArray1[6] = "rotor";
        for (int i = 0; i < stringArray1.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(stringArray1[i]);
            stringArray1[i] = stringBuilder.toString();
            if (stringArray1[i].equalsIgnoreCase(String.valueOf(stringBuilder.reverse()))) {
                System.out.println(stringBuilder);
            } else {

            }
        }
    }
    public static void exercise2(){
        String output = String.format("%s = %d", "Denis", 31);
        System.out.println(output);
        System.out.printf("%s%d", "Denis = ", 31);
        //Loosing static type safety and add more work

    }
    public static void exercise3(){
        String[] stringArray1 = new String[7];
        stringArray1[0] = "hello";
        stringArray1[1] = "world";
        stringArray1[2] = "radar";
        stringArray1[3] = "math";
        stringArray1[4] = "kayak";
        stringArray1[5] = "bank";
        stringArray1[6] = "rotor";
        for (int i = 0; i < stringArray1.length; i++) {
            String check = "[a-z]+a[a-z]";
            Pattern pt = Pattern.compile(check);
            Matcher mt = pt.matcher(stringArray1[i]);
            boolean result = mt.matches();
           // System.out.println(result);
            if(result==true){
                System.out.println(stringArray1[i]);
            }else{
            }
            //Generic - give us custom method or class with any type
        }
    }
    public static <E> void exercise5(E[] elements){
        for (E element : elements){
            System.out.println(element);
        }
    }
    public static void exercise7(){
        String word = "Dictionary";
        System.out.println(word.indexOf("a"));
        String replaceString = word.replace("a", "x");
        System.out.println(replaceString);
    }
    public static void exercise8(){
        int a = 0;
        Method[] methods = String.class.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
            for (int i = 0; i < methods.length; i++ ){
                 a = i;
            }
        System.out.println(a);
        }
    public static void exercise9() throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        User nameReflex = new User("denis");
        Method privateMethod = User.class.getDeclaredMethod("getName", null);
        privateMethod.setAccessible(true);
        String returnValue = (String) privateMethod.invoke(nameReflex, null);
        System.out.println(returnValue);
        }
    public static void exercise10(){
        String s1 = "The dog says meow. All dogs say meow.";
        String s2 = s1.replaceAll("dog", "cat");
        System.out.println(s2);
        }
    }




