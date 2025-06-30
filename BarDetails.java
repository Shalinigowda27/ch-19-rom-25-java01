class BarDetails {

static String alcholNames[] = {"Kingfisher", "Signature", "ImperialBlue", "Sula", "Tuborg", "Safari", "Old Monk", "BlendersPride", "Officer's Choice", "Royal Challenge"};
static String beerNames[]  = {"Dunkel","Altbier","Amber ale", "Bareiey", "Bitter", "Bock", "Cream Ale", "Eisbock", "Gose", "Gueuze", "Helles", "Lambic"};
static String wineNames[]  = {"Airen", "Albillo", "Baco", "Baiyu", "Callet", "Cava", "Durif", "Dolcetto", "Erbaluce", "Fiano","Garanior", "Grau"};

public static void main(String[] bar) {

System.out.println("main started");

System.out.println("The no of alcholNames available are ");
    
	for(String alcholNames : alcholNames){
	   System.out.println(alcholNames);
	}
    for(String beerNames : beerNames){
	   System.out.println(beerNames);
	}
	for(String wineNames : wineNames){
	   System.out.println(wineNames);  
	}
System.out.println("main ended");
}
}