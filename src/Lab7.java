import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Reader reader_1 = new Reader(); // вызов первого конструктора
        reader_1.name = "Пахтунов С.Д. ";
        reader_1.number = 10;
        reader_1.facul = "19ИТ18";
        reader_1.birthday = "03.12.2003";
        reader_1.phone = "89631058843";
        reader_1.displayInfo();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число взятых книг");
        int n = in.nextInt();
        Reader.TakeBook(n, reader_1.name);
        String[] array = new String[n];
        for(int i = 0; i < n; i++){
            System.out.println("Введите название " + (i + 1) + " книги");
            array[i] = in.next();
        }
        Reader.TakeBook(array, reader_1.name);
        Book books = new Book();
        books.name_book = "Моя книга";
        books.author_book = "Папа Римский";
        Reader.ReturnBook(n, reader_1.name);
        Reader.ReturnBook(array, reader_1.name);
        Book.TakeBook(books.name_book, books.author_book, reader_1.name);
    }
}
class Reader{
    String name; // имя
    int number; // номер читательского билета
    String facul; // факультет
    String birthday; // дата рождения
    String phone; // телефон

    void displayInfo(){
        System.out.printf("ФИО: %s\nНомер читетальского билета: %s\nФакультет: %s\nДата рождения: %s\nТелефон: %s\n", name, number, facul, birthday, phone);
    }
    public static void TakeBook(int n, String name){

        System.out.println(name + "взял " + n + " книг(и)");
    }
    public static void TakeBook(String[] array, String name){

        System.out.println(name + "взял книги: " + String.join(", ", array));
    }
    public static void ReturnBook(int n, String name){

        System.out.println(name + "вернул " + n + " книг(и)");
    }
    public static void ReturnBook(String[] array, String name){
        System.out.println(name + "вернул книги: " + String.join(", ", array));
    }
}
class Book{
    String name_book; // имена книг
    String author_book; // имена авторов
    public static void TakeBook(String name_book, String author_book, String name){
        System.out.println(name + "взял книгу: " + name_book + " '" + author_book +"'" );
    }
}
