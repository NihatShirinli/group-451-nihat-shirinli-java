package homework_7;

public class Person {
    String name;

public Person(String name) {
    this.name = name;
}

public void printNameLength() {
    System.out.println(name.length());
}
public static void main(String[] args) {
    Person person = new Person(null);
	person.printNameLength();
	System.out.println("Можно добавить проверку if (name != null) или использовать Optional");
}
}