

/*We want to create a constructor function 'NameMe', which takes first name and last name as parameters. The function combines the first and last names and saves the value in "name" property.

We already implemented that function, but when we actually run the code, the "name" property is accessible, but the "firstName" and "lastName" is not accessible. All the properties should be accessible. Can you find what's wrong with it? A test fixture is also available

function NameMe(first, last) {
    this.firstName = first;
    this.lastName = last;
    return {name: this.firstName + ' ' + this.lastName};
}

var n = new NameMe('John', 'Doe');
n.firstName //Expected: John
n.lastName //Expected: Doe
n.name //Expected: John Doe

 */
import java.util.*;
import java.lang.*;
class NameMe{
    final String firstname;
    final String lastname;
    final String name;

    public NameMe(String firstname,String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.name=firstname+" "+lastname;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }
}

public class NameMeClass {
    public static void main(String[] args) {
        NameMe n= new NameMe("john","doe");
        System.out.println(n.getFirstname());
        System.out.println(n.getLastname());
        System.out.println(n.getName());


    }
}
