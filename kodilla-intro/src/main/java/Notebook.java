public class Notebook {
        int weight;
        int price;
        int year;


        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;
        }

        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                } else if (this.price >= 600 && this.price <= 1000) {
                        System.out.println("The price is good.");
                } else {
                        System.out.println("This notebook is expensive.");
                }
        }

        public void checkWeight() {
                if (this.weight <= 600) {
                        System.out.println("This notebook is light.");
                } else if (this.weight > 600 && this.weight < 1500) {
                        System.out.println("This notebook is not too heavy.");
                } else {
                        System.out.println("This notebook is very heavy.");
                }
        }
        public void checkYearAndPrice() {
                if (this.year < 2006 && this.price < 600) {
                        System.out.println("This notebook is old, but indeed cheap." + "\n");
                } else if (this.year > 2010 && this.year < 2022 && this.price >= 600 && this.price <= 1000) {
                        System.out.println("This notebook price is good, although it's not the newest." + "\n");
                } else {
                        System.out.println("This notebook is quite expensive, but it's one of the latest generation." + "\n");
                }

        }
}
