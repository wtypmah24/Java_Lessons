import field.FieldExampleClass;
import field.StaticFieldExample;

public class Main {

    public static void main(String[] args){
        String title = "Hello World";

        System.out.println(title);

        FieldExampleClass fieldExampleClass = new FieldExampleClass();

        System.out.println(fieldExampleClass.count);
        fieldExampleClass.count = 50;
        System.out.println(fieldExampleClass.count);

        FieldExampleClass anotherFieldExampleClass = new FieldExampleClass();
        System.out.println(anotherFieldExampleClass.count);

        // _________________________________

        fieldExampleClass.expression = "i was changed it";

        System.out.println(fieldExampleClass.expression);
        System.out.println(anotherFieldExampleClass.expression);

        //__________________________________


        System.out.println(StaticFieldExample.staticExpression);

        StaticFieldExample.staticExpression = "i was changed";

        System.out.println(StaticFieldExample.staticExpression);

    }

}
