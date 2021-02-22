package com.company.comons.supplier;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "supplier")
public class Supplier {

	@Id
	@GeneratedValue
	private int supplierId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;
	private String createdUser;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDateTime;
	private String lastModifiedUser;
	private String supplierCompany;
	private BigDecimal supplierContact;
	private String supplierName;
	private BigDecimal version;
	
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
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
	public String getSupplierCompany() {
		return supplierCompany;
	}
	public void setSupplierCompany(String supplierCompany) {
		this.supplierCompany = supplierCompany;
	}
	public BigDecimal getSupplierContact() {
		return supplierContact;
	}
	public void setSupplierContact(BigDecimal supplierContact) {
		this.supplierContact = supplierContact;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	
	
}
