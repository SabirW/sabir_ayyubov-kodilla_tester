public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPriceAndYear();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPriceAndYear();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPriceAndYear();
        oldNotebook.checkWeight();




    }
}