//package com.malish;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Main {
//    public static void main(String[] args) {
//        // Print name and roll number
//        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");
//
//        // Create objects and print details
//        Category cat1 = new Category(1, "Electronics");
//        Product prod1 = new Product(101, 199.99, "Smartphone", 1);
//        Order order1 = new Order(2001, 399.98, new Date(), 501);
//        Customer customer1 = new Customer(501, "Malish", "1234567890", "Nepal");
//
//        // Print details in tabular format
//        System.out.println("Category Details:");
//        System.out.println("ID | Name");
//        System.out.println("-----------------");
//        System.out.println(cat1.getId() + " | " + cat1.getName());
//
//        System.out.println("\nProduct Details:");
//        System.out.println("ID | Name | Price | Category ID");
//        System.out.println("--------------------------------");
//        System.out.println(prod1.getId() + " | " + prod1.getName() + " | " + prod1.getPrice() + " | " + prod1.getCategoryID());
//
//        System.out.println("\nOrder Details:");
//        System.out.println("Order ID | Amount | Date | Customer ID");
//        System.out.println("-------------------------------------");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(order1.getId() + " | " + order1.getAmount() + " | " + sdf.format(order1.getDate()) + " | " + order1.getCustomerID());
//
//        System.out.println("\nCustomer Details:");
//        System.out.println("ID | Name | Phone | Country");
//        System.out.println("-----------------------------");
//        System.out.println(customer1.getId() + " | " + customer1.getName() + " | " + customer1.getPhone() + " | " + customer1.getCountry());
//    }
//}



//package com.malish;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");
//
//        System.out.print("Enter the shape type (Circle/Rectangle): ");
//        String shapeType = scanner.nextLine();
//
//        if (shapeType.equalsIgnoreCase("Circle")) {
//            System.out.print("Enter the radius of the circle: ");
//            double radius = scanner.nextDouble();
//
//            Circle circle = new Circle(radius);
//            System.out.println("Circle Area: " + circle.getArea());
//            System.out.println("Circle Perimeter: " + circle.getPerimeter());
//        }
//        else if (shapeType.equalsIgnoreCase("Rectangle")) {
//            System.out.print("Enter the length of the rectangle: ");
//            double length = scanner.nextDouble();
//            System.out.print("Enter the breadth of the rectangle: ");
//            double breadth = scanner.nextDouble();
//
//            Rectangle rectangle = new Rectangle(length, breadth);
//            System.out.println("Rectangle Area: " + rectangle.getArea());
//            System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
//        }
//        else {
//            System.out.println("Invalid shape type.");
//        }
//
//        scanner.close();
//    }
//}


//package com.malish;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");
//
//        Artwork artwork = new Artwork("Mona Lisa", "Leonardo Da Vinci", 9000);
//
//        artwork.showDetails();
//
//        artwork.setPrice(10000);
//
//        System.out.print("Updated Details:");
//        artwork.showDetails();
//    }
//}


package com.malish;

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");

        // Create a Sculpture object
        Sculpture sculpture = new Sculpture("David", "Michelangelo", 50000, "Marble", 200);
        sculpture.showDetails();  // Display sculpture details

        // Create a Painting object
        Painting painting = new Painting("Starry Night", "Vincent van Gogh", 100000, "Oil", 2.5, 3.5);
        painting.showDetails();  // Display painting details
    }
}
