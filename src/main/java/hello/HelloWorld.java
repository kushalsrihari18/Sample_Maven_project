package hello;

import org.joda.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main(String[] args) {
      LocalTime currentTime = new LocalTime();
                  System.out.println("The current time in india is: " + currentTime);
                  System.out.println("Present date is " +java.time.LocalDate.now());

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
