public class book {
    private String id;
    private String book_name;
    private double price;

    public book(String id, String book_name, double price) {
        this.id = id;
        this.book_name = book_name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show_info_of_book()
    {
        System.out.println("id: "+ this.getId());
        System.out.println("name: "+ this.getBook_name());
        System.out.println("price: "+ this.getPrice());
    }

}
