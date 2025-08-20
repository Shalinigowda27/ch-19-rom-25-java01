package com.xworkz.amazonapp.Validation;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.ProductApp;

public class AmazonRunner {

    public static void main(String[] args) {


        ProductApp productApp = new ProductApp();
        productApp.setProductName("Dress");
        productApp.setNoOfProducts(2);
        productApp.setProductPrice(1000.00);
        productApp.setBrand("Zara");

        Amazon amazon = new Amazon();
        boolean createProductApp = amazon.createProductApp(productApp);

        if(createProductApp){
            amazon.getAppInfo();
        }
        amazon.getAppInfo();
    }
}
