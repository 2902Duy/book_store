import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static book book_obj = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int function_id =0;
        boolean flag =true;

        do {

            show_menu();
            function_id = sc.nextInt();
            sc.nextLine();
            switch (function_id){
                case 1: add_book();break;
                case 2: edit_book();break;
                case 3: info_book();break;
                case 4:
                default:flag=false;break;
            }



        }while(flag);
        sc.close();
    }

    public static void show_menu()
    {
        System.out.println("------------BOOK MANAGER------------");
        System.out.println("1. Add book");
        System.out.println("2. Edit book");
        System.out.println("3. Info book");
        System.out.println("1. Exit ~~");
        System.out.print("Choice: ");
    }
    public static void add_book()
    {
        Scanner sc =new Scanner(System.in);
        String book_id;
        String book_name;
        double book_price;
        System.out.print("id: ");
        book_id = sc.nextLine();
        System.out.print("name: ");
        book_name= sc.nextLine();
        System.out.print("price: ");
        book_price= sc.nextDouble();
        book_obj = new book(book_id,book_name,book_price);

    }
    public static void edit_book()
    {
        Scanner sc =new Scanner(System.in);
        String book_name="";
        double book_price=0;
        System.out.print("name: ");
        book_name= sc.nextLine();
        System.out.print("price: ");
        book_price= sc.nextDouble();
        book_obj.setBook_name(book_name);
        book_obj.setPrice(book_price);
    }
    public static void info_book()
    {
        if(book_obj==null)
        {
            System.out.println("No book in store");
            return;
        }
        book_obj.show_info_of_book();
    }
}
