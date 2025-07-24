class Country {
    public static int getCountryCodes(String countryName) {
        int countryCode = 0;

        if (countryName.equals("India")) {
            countryCode = 91;
			return countryCode;
        } else if (countryName == "Australia") {
            countryCode = 61;
			return countryCode;			
        } else if (countryName == "Sri Lanka") {
            countryCode = 94;
			return countryCode;
        } else if (countryName == "Italy") {
            countryCode = 39;
			return countryCode;			
        } else if (countryName == "Brazil") {
            countryCode = 55;
			return countryCode;			
        } else if (countryName == "Japan") {
            countryCode = 81;
			return countryCode;			
        } else if (countryName == "United Kingdom") {
            countryCode = 44;
			return countryCode;			
        } else if (countryName == "Canada") {
            countryCode = 1;
			return countryCode;			
        } else if (countryName == "United States") {
            countryCode = 1;
			return countryCode;
			
        } else if (countryName == "Spain") {
            countryCode = 34;
        } else if (countryName == "Germany") {
            countryCode = 49;
        } else if (countryName == "France") {
            countryCode = 33;
        } else if (countryName == "Russia") {
            countryCode = 7;
        } else if (countryName == "China") {
            countryCode = 86;
        } else if (countryName == "Mexico") {
            countryCode = 52;
        } else if (countryName == "South Korea") {
            countryCode = 82;
        } else if (countryName == "South Africa") {
            countryCode = 27;
        } else if (countryName == "Nigeria") {
            countryCode = 234;
        } else if (countryName == "Egypt") {
            countryCode = 20;
        } else if (countryName == "Argentina") {
            countryCode = 54;
        } else if (countryName == "Bangladesh") {
            countryCode = 880;
        } else if (countryName == "Nepal") {
            countryCode = 977;
        } else if (countryName == "Pakistan") {
            countryCode = 92;
        } else if (countryName == "Indonesia") {
            countryCode = 62;
        } else if (countryName == "Thailand") {
            countryCode = 66;
        } else if (countryName == "Malaysia") {
            countryCode = 60;
        } else if (countryName == "Vietnam") {
            countryCode = 84;
        } else if (countryName == "Philippines") {
            countryCode = 63;
        } else if (countryName == "Turkey") {
            countryCode = 90;
        } else if (countryName == "Iran") {
            countryCode = 98;
        } else if (countryName == "Iraq") {
            countryCode = 964;
        } else if (countryName == "Afghanistan") {
            countryCode = 93;
        } else if (countryName == "UAE") {
            countryCode = 971;
        } else if (countryName == "Saudi Arabia") {
            countryCode = 966;
        } else if (countryName == "Qatar") {
            countryCode = 974;
        } else if (countryName == "Oman") {
            countryCode = 968;
        } else if (countryName == "Kuwait") {
            countryCode = 965;
        } else if (countryName == "Israel") {
            countryCode = 972;
        } else if (countryName == "Ukraine") {
            countryCode = 380;
        } else if (countryName == "Switzerland") {
            countryCode = 41;
        } else if (countryName == "Sweden") {
            countryCode = 46;
        } else if (countryName == "Norway") {
            countryCode = 47;
        } else if (countryName == "Denmark") {
            countryCode = 45;
        } else if (countryName == "Netherlands") {
            countryCode = 31;
        } else if (countryName == "Belgium") {
            countryCode = 32;
        } else if (countryName == "Austria") {
            countryCode = 43;
        } else if (countryName == "Poland") {
            countryCode = 48;
        } else if (countryName == "Greece") {
            countryCode = 30;
        } else {
            System.out.println(countryName + " is Invalid or not listed.");
        }

        return countryCode;
	}
}
