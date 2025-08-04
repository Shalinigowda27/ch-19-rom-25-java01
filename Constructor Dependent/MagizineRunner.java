class MagizineRunner{

	public static void main(String[] args){
	
	Magizine magizine = new Magizine();
	Page  page = new Page();
	Article article = new Article();
	
	magizine.magazineName = "The New Yorker";
    magizine.publisher = "Conde Nast";
    magizine.noOfIssuesPerYear = 2;
    magizine.isMonthlyPublishing = true;
	magizine.page = page;
	
	page.pageNumber = 50;
    page.pageTitle = "Architecture & Society";
	page.article = article;
	
	article.articleTitle = "The Silent Cities: How Urban Design Shapes Human Behavior";
	article.author = "Margaret Ellison";
	article.wordCount = 1000;
	article.isArticleGood = true;
	
	magizine.getMagizineInfo();	
	}
}