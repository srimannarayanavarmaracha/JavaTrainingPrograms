package com.srimannarayana.javapractice.myfirstjavaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Represents a product available in the store
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return id + ". " + name + " - Rs. " + String.format("%.2f", price);
    }
}

// Represents one line in the cart: a product + how many of it
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void increaseQuantity(int amount) { this.quantity += amount; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.getName() + " x " + quantity
                + " = Rs. " + String.format("%.2f", getSubtotal());
    }
}

// Manages the list of items the customer has added
class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        // if the product is already in the cart, just increase quantity
        for (CartItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.increaseQuantity(quantity);
                System.out.println(quantity + " more " + product.getName() + " added. New quantity: " + item.getQuantity());
                return;
            }
        }
        items.add(new CartItem(product, quantity));
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(int productId) {
        boolean removed = items.removeIf(item -> item.getProduct().getId() == productId);
        if (removed) {
            System.out.println("Item removed from cart.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    public void updateQuantity(int productId, int newQuantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId() == productId) {
                if (newQuantity <= 0) {
                    removeProduct(productId);
                } else {
                    item.setQuantity(newQuantity);
                    System.out.println("Quantity updated.");
                }
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("\n----- Your Cart -----");
        for (CartItem item : items) {
            System.out.println(item);
        }
        System.out.println("----------------------");
        System.out.println("Total: Rs. " + String.format("%.2f", getTotal()));
    }

    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

public class ShoppingCartProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample product catalog
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Product(1, "Laptop", 55000.00));
        catalog.add(new Product(2, "Mouse", 500.00));
        catalog.add(new Product(3, "Keyboard", 1200.00));
        catalog.add(new Product(4, "Monitor", 9500.00));
        catalog.add(new Product(5, "USB Drive", 750.00));

        Cart cart = new Cart();
        boolean running = true;

        while (running) {
            System.out.println("\n===== SHOPPING CART MENU =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. Update Quantity");
            System.out.println("5. View Cart");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n----- Available Products -----");
                    for (Product p : catalog) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Enter product ID to add: ");
                    int addId = readInt(scanner);
                    Product toAdd = findProduct(catalog, addId);
                    if (toAdd == null) {
                        System.out.println("Invalid product ID.");
                        break;
                    }
                    System.out.print("Enter quantity: ");
                    int qty = readInt(scanner);
                    if (qty <= 0) {
                        System.out.println("Quantity must be positive.");
                        break;
                    }
                    cart.addProduct(toAdd, qty);
                    break;

                case 3:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = readInt(scanner);
                    cart.removeProduct(removeId);
                    break;

                case 4:
                    System.out.print("Enter product ID to update: ");
                    int updateId = readInt(scanner);
                    System.out.print("Enter new quantity: ");
                    int newQty = readInt(scanner);
                    cart.updateQuantity(updateId, newQty);
                    break;

                case 5:
                    cart.viewCart();
                    break;

                case 6:
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty. Add items before checking out.");
                        break;
                    }
                    cart.viewCart();
                    System.out.println("\nThank you for your purchase!");
                    System.out.println("Amount to pay: Rs. " + String.format("%.2f", cart.getTotal()));
                    running = false;
                    break;

                case 7:
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1-7.");
            }
        }

        scanner.close();
    }

    // Helper: safely read an integer, re-prompting on bad input
    private static int readInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }

    // Helper: find a product by ID in the catalog
    private static Product findProduct(List<Product> catalog, int id) {
        for (Product p : catalog) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
