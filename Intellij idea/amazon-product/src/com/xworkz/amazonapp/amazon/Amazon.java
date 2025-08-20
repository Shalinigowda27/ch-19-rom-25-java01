package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.Validation.ProductValidation;
import com.xworkz.amazonapp.product.ProductApp;

public class Amazon {

    ProductApp productApp;

    public boolean createProductApp(ProductApp productApp) {
        boolean productAppCreated = false;

        ProductValidation productAppValidation = new ProductValidation();
        boolean isProductAppValidated = productAppValidation.validateProductApp(productApp);


        //.validateApplication is instance variable

        if (isProductAppValidated) {
            this.productApp = productApp;
            productAppCreated= true;
        }
        return productAppCreated;
    }
    public void getAppInfo(){
        System.out.println("The product name is "+productApp.getProductName());
        System.out.println("The no Of Products are "+productApp.getNoOfProducts());
        System.out.println("The product price is "+productApp.getProductPrice());
        System.out.println("The brand is "+productApp.getBrand());
    }

    public  boolean updateProductPrice(double productprice){
        boolean isProductPriceUpdated = false;
        if(productprice > 0){
            productApp.setProductPrice(productprice);
            isProductPriceUpdated = true;
        }
        return isProductPriceUpdated;
    }
}
