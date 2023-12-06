
public class Product {

	private String productName; //nome do produto
	private int productStorage; //estoque do produto
	private double purchasePrice;//preço de compra
	private double expirationDate;//data de validade

	public Product() {

	}

	public Product(String productName, int productStorage, double purchasePrice, double expirationDate) {
		this.productName = productName;
		this.productStorage = productStorage;
		this.purchasePrice = purchasePrice;
		this.expirationDate = expirationDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductStorage() {
		return productStorage;
	}

	public void setProductStorage(int productStorage) {
		this.productStorage = productStorage;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(double expirationDate) {
		this.expirationDate = expirationDate;
	}

}

