public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2019);
          System.out.println(notebook.weight + "g, " + "$" + notebook.price + ", " + notebook.year);
          notebook.checkPrice();
          notebook.checkWeight();
          notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2024);
          System.out.println(heavyNotebook.weight + "g, " + "$" + heavyNotebook.price + ", " + heavyNotebook.year);
          heavyNotebook.checkPrice();
          heavyNotebook.checkWeight();
          heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2005);
          System.out.println(oldNotebook.weight + "g, " + "$" + oldNotebook.price + ", " + oldNotebook.year);
          oldNotebook.checkPrice();
          oldNotebook.checkWeight();
          oldNotebook.checkYearAndPrice();

        Notebook fancyNotebook = new Notebook(800, 2500, 2024);
          System.out.println(fancyNotebook.weight + "g, " + "$" + fancyNotebook.price + ", " + fancyNotebook.year);
          fancyNotebook.checkPrice();
          fancyNotebook.checkWeight();
          fancyNotebook.checkYearAndPrice();

        Notebook boringNetbook = new Notebook(1700, 999, 2017);
          System.out.println(boringNetbook.weight + "g, " + "&" + boringNetbook.price + ", " + boringNetbook.year);
          boringNetbook.checkPrice();
          boringNetbook.checkWeight();
          boringNetbook.checkYearAndPrice();

    }
}
