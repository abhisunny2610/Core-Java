class Book{

    static int primaryKey;
    static int countBook;
    static Book bookDatabase[];

    String title;
    String author;
    String subject;
    int pages;
    double price;
    int primarykey;

    static{
        countBook = 0;
        primaryKey = 1000;
        bookDatabase = new Book[5];
    }

    Book(String title, String author, String subject, int pages, double price)
    {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.pages = pages;
        this.price = price;
        this.primarykey = Book.primaryKey;

        Book.bookDatabase[Book.countBook++] = this;
        Book.primaryKey++;
    }

    void display()
    {
        System.out.println("Primary Key: " + this.primarykey);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Subject: " + this.subject);
        System.out.println("Pages: " + this.pages);
        System.out.println("Price: " + this.price);
    }

    void display_inline()
    {
        System.out.println(this.primarykey + "\t" + this.title + "\t" + this.author + "\t" + this.subject + "\t" + 
                this.pages + "\t" + this.price);
    }

    static void book_heading()
    {
        System.out.println("primaryKey" + "\t" + "title" + "\t" + "author" + "\t" + "subject" + "\t" + 
        "pages" + "\t" + "price");
   }

   static void show_Database()
   {
        Book.book_heading();

        for(int i=0; i<Book.countBook; i++){
            Book.bookDatabase[i].display_inline();
        }
   }
};

class Student{

    static int id;
    static int countStudent;
    static Student studentDatabase[];

    String name;
    String std;
    String college;
    int age;
    int ID;
   

    static{
        countStudent = 0;
        id = 201;
        studentDatabase = new Student[5];
    }

    Student(String name, String std, String college, int age)
    {
        this.name = name;
        this.std = std;
        this.college = college;
        this.age = age;
        this.ID = Student.id;
        

        Student.studentDatabase[Student.countStudent++] = this;
        Student.id++;
    }

    void display()
    {
        System.out.println("Student ID: " + this.ID);
        System.out.println("Name: " + this.name);
        System.out.println("Std: " + this.std);
        System.out.println("College: " + this.college);
        System.out.println("Age: " + this.age);
        
    }

    void display_inline()
    {
        System.out.println(this.ID + "\t" + this.name + "\t" + this.std + "\t" + this.college + "\t" + 
                this.age);
    }

    static void book_heading()
    {
        System.out.println(" Student ID" + "\t" + "Name" + "\t" + "Std" + "\t" + "College" + "\t" + 
        "Age");
   }

   static void show_Database()
   {
        Student.book_heading();

        for(int i=0; i<Student.countStudent; i++){
            Student.studentDatabase[i].display_inline();
        }
   }
};

public class StaticInbook {

    public static void main(String[] args) {

        new Book("Let's Start C", "Abhishek", "C Programming", 500, 300);
        new Book("Learn Java", "Hanish", "Java Programming", 400, 250);

        System.out.println("\n\n-----------------------------------------------------------\n");
        Book.show_Database();
        System.out.println("\n\n-----------------------------------------------------------\n");
        
        
        new Student("Abhishek", "BCA", "UOT", 19);
        new Student("Hanish", "MCA", "UOT", 22);

        System.out.println("\n\n**********************************************************\n");
        Student.show_Database();
        System.out.println("\n\n**********************************************************\n");
    }
    
}
