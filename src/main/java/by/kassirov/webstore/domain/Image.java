package by.kassirov.webstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="images")
public class Image {
        
		@Id
		@GeneratedValue
		@Column(name="image_id")
		private int id;
		
		@Column(name="image_url")
        private String imageUrl;
        
		
		@Column(name="Products_product_id")
        private int productId;
        
        public Image(){}
        
        public Image(int productId, String imageUrl) {
        	this.imageUrl = imageUrl;
        	this.productId = productId;
        }
        
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
        }

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}
        
        
        
}