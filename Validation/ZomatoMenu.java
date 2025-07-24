public class ZomatoMenu {
    public static int getFoodPrice(String foodName) {
        int price = 0;
        if (foodName == "Chicken Biryani") {
            price = 248;
        } else if (foodName == "Paneer Butter Masala") {
            price = 169;
        } else if (foodName == "Margherita Pizza") {
            price = 220;
        } else if (foodName == "Noodle Bowl") {
            price = 180;
        } else if (foodName == "Masala Dosa") {
            price = 109;
        } else if (foodName == "Butter Chicken") {
            price = 250;
        } else if (foodName == "Veg Burger") {
            price = 115;
        } else if (foodName == "Pav Bhaji") {
            price = 100;
        } else if (foodName == "Shawarma Roll") {
            price = 140;
        } else if (foodName == "Momоs") {
            price = 120;
        } else if (foodName == "Poha") {
            price = 80;
        } else if (foodName == "Aloo Paratha") {
            price = 90;
        } else if (foodName == "Idli Sambar") {
            price = 75;
        } else if (foodName == "Uttapam") {
            price = 85;
        } else if (foodName == "Chaat") {
            price = 60;
        } else if (foodName == "Vada Pav") {
            price = 50;
        } else if (foodName == "Kulfi") {
            price = 70;
        } else if (foodName == "Misal Pav") {
            price = 120;
        } else if (foodName == "Chole Bhature") {
            price = 120;
        } else if (foodName == "Egg Kejriwal") {
            price = 110;
        } else if (foodName == "Dabeli") {
            price = 80;
        } else if (foodName == "Bhelpuri") {
            price = 60;
        } else if (foodName == "Pani Puri") {
            price = 65;
        } else if (foodName == "Falooda") {
            price = 90;
        } else if (foodName == "Fish Fry") {
            price = 150;
        } else if (foodName == "Paneer Tikka") {
            price = 160;
        } else if (foodName == "Matar Paneer") {
            price = 150;
        } else if (foodName == "Samosa") {
            price = 30;
        } else if (foodName == "Pakora") {
            price = 40;
        } else if (foodName == "Pesarattu") {
            price = 95;
        } else {
            System.out.println(foodName + " is Invalid ");
        }

        return price;
    }

  }






