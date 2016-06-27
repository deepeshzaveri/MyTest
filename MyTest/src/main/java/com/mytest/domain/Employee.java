package com.mytest.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = -7788619177798333712L;

	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "createdDate")
	private Date createdDate;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="emp",cascade=CascadeType.PERSIST)
	private Set<Empaddress> addressList;
	
	public Set<Empaddress> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<Empaddress> addressList) {
		this.addressList = addressList;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
