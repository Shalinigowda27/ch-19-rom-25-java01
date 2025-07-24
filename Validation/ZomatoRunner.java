class ZomatoRunner {
    public static void main(String[] args) {
        String foodName = "Chicken Biryani";
     

        int price = ZomatoMenu.getFoodPrice(foodName);
        System.out.println("The price  for " + foodName + " is: " + price);
    }
}