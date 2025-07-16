public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
        Notebook oldNotebook = new Notebook(1600, 500, 2000);

        notebookParameters(notebook);

        notebookParameters(heavyNotebook);

        notebookParameters(oldNotebook);
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPriceAndYear();
        notebook.checkWeight();
    }
}