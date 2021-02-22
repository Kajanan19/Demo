package com.company.comons.stock;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.company.comons.item.Item;
import com.company.comons.supplier.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "stock")
public class Stock implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8269019823208919422L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refId;

	private String branchId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;

	private String createdUser;

	@Temporal(TemporalType.DATE)
	private Date dateStock;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDateTime;

	private String lastModifiedUser;

	private int quantity;

	//private int stockId;

	private BigDecimal version;
	
	//bi-directional many-to-one association to Product
		@ManyToOne
		@JoinColumn(name="productId")
		private Item item;

		//bi-directional many-to-one association to Supplier
		@ManyToOne
		@JoinColumn(name="supplierId")
		private Supplier supplier;

		public int getRefId() {
			return refId;
		}

		public void setRefId(int refId) {
			this.refId = refId;
		}

		public String getBranchId() {
			return branchId;
		}

		public void setBranchId(String branchId) {
			this.branchId = branchId;
		}

		public Date getCreatedDateTime() {
			return createdDateTime;
		}

		public void setCreatedDateTime(Date createdDateTime) {
			this.createdDateTime = createdDateTime;
		}

		public String getCreatedUser() {
			return createdUser;
		}

		public void setCreatedUser(String createdUser) {
			this.createdUser = createdUser;
		}

		public Date getDateStock() {
			return dateStock;
		}

		public void setDateStock(Date dateStock) {
			this.dateStock = dateStock;
		}

		public Date getLastModifiedDateTime() {
			return lastModifiedDateTime;
		}

		public void setLastModifiedDateTime(Date lastModifiedDateTime) {
			this.lastModifiedDateTime = lastModifiedDateTime;
		}

		public String getLastModifiedUser() {
			return lastModifiedUser;
		}

		public void setLastModifiedUser(String lastModifiedUser) {
			this.lastModifiedUser = lastModifiedUser;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public BigDecimal getVersion() {
			return version;
		}

		public void setVersion(BigDecimal version) {
			this.version = version;
		}

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

		public Supplier getSupplier() {
			return supplier;
		}

		public void setSupplier(Supplier supplier) {
			this.supplier = supplier;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
	
	

}
