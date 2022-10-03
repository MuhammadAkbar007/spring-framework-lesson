package uz.pdp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
public class Person {
    private String fullName;
    private int age;
    private Address address;

    public void testPersonMethod() {
        System.out.println("Person ichidagi method ishladi !");
    }
}
