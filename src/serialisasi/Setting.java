/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
/**
 *
 * @author ASUS
 */
public class Setting implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean showProductDetails;

    public Setting() {
        // Default setting for showing product details
        this.showProductDetails = true;
    }

    public boolean isShowProductDetails() {
        return showProductDetails;
    }

    public void setShowProductDetails(boolean showProductDetails) {
        this.showProductDetails = showProductDetails;
    }
    
    // Method untuk menampilkan detail produk
    public void showProductDetail(Product product) {
        if (showProductDetails) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product Price: " + product.getPrice());
            // Tambahan untuk menampilkan detail lainnya sesuai kebutuhan
        } else {
            System.out.println("Product details are hidden.");
        }
    }
    
}
