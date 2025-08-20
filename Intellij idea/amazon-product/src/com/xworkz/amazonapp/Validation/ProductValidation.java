package com.xworkz.amazonapp.Validation;

import com.xworkz.amazonapp.product.ProductApp;

public class ProductValidation {

    public boolean validateProductApp(ProductApp productApp) {
        boolean isProductAppValidated = false;

        boolean isProductNameValid = false;
        boolean isNoOfProductsValid = false;
        boolean isProductPriceValid = false;
        boolean isBrandValid = false;

        if (productApp.getProductName() != null) {
            isProductNameValid = true;
        } else {
            System.out.println("not valid");
        }

        if (productApp.getNoOfProducts() != 0) {
            isNoOfProductsValid = true;
        } else {
            System.out.println("not valid");
        }
        if (productApp.getProductPrice() != 0) {
            isProductPriceValid = true;
        } else {
            System.out.println("not valid");
        }

        if (productApp.getBrand() != null) {
            isBrandValid = true;
        } else {
            System.out.println("not valid");
        }
        if (isProductNameValid && isNoOfProductsValid && isProductPriceValid && isBrandValid) {
            isProductAppValidated = true;
        }
        return isProductAppValidated;
    }
}
