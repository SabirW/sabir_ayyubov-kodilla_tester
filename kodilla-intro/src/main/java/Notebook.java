public class Notebook {
    int weight; //attributes
    int price;
    int year;

    public Notebook(int weight, int price, int year) { // constructor
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPriceAndYear() {
        if (this.price < 600 && this.year < 2015) {
            System.out.println("This notebook is very cheap and very old.");
        } else if (this.price < 600 & this.year >= 2015 & this.year <= 2018) {
            System.out.println("This notebook is cheap but relatively old.");
        } else if (this.price >= 600 && this.price < 1000 && this.year <= 2018) {
            System.out.println("The price is good but the notebook is a bit outdated.");
        } else if (this.price >= 1000 && this.price <= 1500 && this.year > 2018) {
            System.out.println("This notebook is fairly expensive and modern.");
        } else if (this.price > 1500 && this.year > 2018) {
            System.out.println("This is a high-end and recent notebook.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        }  else if (this.weight > 1000 & this.weight < 1800) {
            System.out.println("This notebook is not too heavy.");
        }  else if (this.weight > 1800) {
            System.out.println("This notebook is very heavy.");
        }
    }




}