package com.epam.GiftAnalysis;
import java.util.*;
public class Gift {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Chocolates> chocolates = new ArrayList<Chocolates>();
    static ArrayList<Sweets> sweets = new ArrayList<Sweets>();

    public static void main(String[] args) {
        inputChocolates();
        inputSweets();
        System.out.println("Total Weight of the Gift: " + totalWeight());
        System.out.println();
        System.out.println("Total Price of the Gift: " + totalPrice());
        System.out.println();
        System.out.println("Details of Gift after sorting by: ");
        System.out.println();
        System.out.println("1. Weight");
        sortedByWeight();
        System.out.println();
        System.out.println("2. Price");
        sortedByPrice();
    }
    private static void inputChocolates() {
        System.out.println("Enter No. of Chocolates in Gift");
        int numberOfChocolates = input.nextInt();
        for (int itr = 0; itr < numberOfChocolates; itr++) {
            System.out.println("Enter Weight of the Chocolate:");
            int weight = input.nextInt();
            System.out.println("Enter Price of the Chocolate:");
            int price = input.nextInt();
            System.out.println("Select from below options: ");
            System.out.println("1. DairyMilk \n2. KitKat");
            int typeOfChocolate = input.nextInt();
            boolean flag = false;
            switch (typeOfChocolate) {
            case 1:
                for (Chocolates item : chocolates) 
                {
                    if (item.getName() == "DairyMilk") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) 
                {
                	DairyMilk dm = new DairyMilk(weight, price);
                    chocolates.add(dm);
                }
                break;
            case 2:
                for (Chocolates item : chocolates) 
                {
                    if (item.getName() == "KitKat") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) 
                {
                	KitKat k = new KitKat(weight, price);
                    chocolates.add(k);
                }
                break;
            default:
                System.out.println("Please Enter a valid Option");
                itr--;
                break;
            }
        }

    }

    private static void inputSweets() {
        System.out.println("Enter No. of Sweets in Gift");
        int numberOfSweets = input.nextInt();
        for (int itr = 0; itr < numberOfSweets; itr++) 
        {
            System.out.println("Enter Weight of the Sweets:");
            int weight = input.nextInt();
            System.out.println("Enter Price of the Sweets:");
            int price = input.nextInt();
            System.out.println("Select from below options: ");
            System.out.println("1. KajuBarfi \n2. GulabJamun ");
            int typeOfSweets = input.nextInt();
            boolean flag = false;
            switch (typeOfSweets) 
            {
            case 1:
                for (Sweets item : sweets) 
                {
                    if (item.getName() == "KajuBarfi") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    KajuBarfi kajuBarfi = new KajuBarfi(weight, price);
                    sweets.add(kajuBarfi);
                }
                break;
            case 2:
                for (Sweets item : sweets) 
                {
                    if (item.getName() == "GulabJamun") 
                    {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) 
                {
                    GulabJamun gulabJamun = new GulabJamun(weight, price);
                    sweets.add(gulabJamun);
                }
                break;
            
            default:
                System.out.println("Please Enter a valid Option");
                itr--;
                break;
            }
        }
    }

    public static int totalWeight() 
    {
        int total1 = 0;
        for (Chocolates item : chocolates) 
        {
            total1 += item.getWeight();
        }
        for (Sweets item : sweets) 
        {
            total1 += item.getWeight();
        }

        return total1;

    }
    public static int totalPrice() 
    {
        int total2 = 0;
        for (Chocolates item : chocolates) 
        {
            total2 += item.getPrice();
        }
        for (Sweets item : sweets) 
        {
            total2 += item.getPrice();
        }

        return total2;
    }
    public static void sortedByWeight() {
        Comparator<Chocolates> chocolateWeightComparator = (Chocolates c1,Chocolates c2) -> ((Integer)c1.getWeight().compareTo(c2.getWeight()));
        Collections.sort(chocolates, chocolateWeightComparator);

        for (Chocolates i : chocolates) {
            System.out.println("Name of Chocolate: " + i.getName());
            System.out.println("Weight of Chocolate: " + i.getWeight());
            System.out.println("Price of Chocolate: " + i.getPrice());
            System.out.println();
        }

        Comparator<Sweets> sweetsWeightComparator = (Sweets c1,Sweets c2) -> ((Integer) c1.getWeight().compareTo(c2.getWeight()));
                

        Collections.sort(sweets, sweetsWeightComparator);

        for (Sweets i : sweets) {
            System.out.println("Name of Sweet: " + i.getName());
            System.out.println("Weight of Sweet: " + i.getWeight());
            System.out.println("Price of Sweet: " + i.getPrice());
            System.out.println();
        }
    }

    public static void sortedByPrice() {
        Comparator<Chocolates> chocolatePriceComparator = (Chocolates c1,Chocolates c2) -> ((Integer) c1.getPrice().compareTo(c2.getPrice()));
                

        Collections.sort(chocolates, chocolatePriceComparator);

        for (Chocolates i : chocolates) {
            System.out.println("Name of Chocolate: " + i.getName());
            System.out.println("Weight of Chocolate: " + i.getWeight());
            System.out.println("Price of Chocolate: " + i.getWeight());
            System.out.println();
        }

        Comparator<Sweets> sweetsPriceComparator = (Sweets c1,Sweets c2) -> ((Integer) c1.getPrice().compareTo(c2.getPrice()));
                

        Collections.sort(sweets, sweetsPriceComparator);

        for (Sweets i : sweets) {
            System.out.println("Name of Sweet: " + i.getName());
            System.out.println("Weight of Sweet: " + i.getWeight());
            System.out.println("Price of Sweet: " + i.getWeight());
            System.out.println();
        }
    }
}
