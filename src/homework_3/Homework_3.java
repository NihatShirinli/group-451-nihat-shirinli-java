package homework_3;

public class Homework_3 {
	//1 
	    public static void main(String[] args) {
		Student student_1 = new Student("Nihat", 12, 100);
		System.out.println("Student's name: " + student_1.name);
		System.out.println("Student's age: " + student_1.age);
		System.out.println("Student's overAll: " + student_1.overAll);
    //2
		Book book_1 = new Book("RaketaBombaPetarda", "Aleksandr Pushka", 1929, 1);
		System.out.println("Name of the book: " + book_1.name);
		System.out.println("Author of the book: " + book_1.author);
		System.out.println("Date of release of the book: " + book_1.whenReleased);
		System.out.println("How many of these books left: " + book_1.howManyOfThemLeft);
	//3
		Car car_1 = new Car("BMW", "M5 F90", 2018, 305);
		System.out.println("Car's company: " + car_1.company);
		System.out.println("Car's model: " + car_1.model);
		System.out.println("When released: " + car_1.whenReleased);
		System.out.println("Speed nowadays: " + car_1.theSpeedNowadays);
	//4
		int length = 5;
		int width = 3;
		int square = length * width;
		System.out.println(square);
	//5
		int n1 = 5;
		int n2 = 6;
		int n3 = 7;
		int theLastN = n1 * n2 * n3;
		int math = 3;
		System.out.println(theLastN / math);
		//6
		Greeting greeting_1 = new Greeting("Nihat", 12);
		System.out.println("Hi, " + greeting_1.name + " I think you are " + greeting_1.age + " years old right?");
	}
}
