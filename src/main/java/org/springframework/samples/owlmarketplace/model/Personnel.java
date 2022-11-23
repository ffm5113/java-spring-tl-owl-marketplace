package org.springframework.samples.owlmarketplace.model;
// javax.persistence package imports

import javax.persistence.*;
import java.io.Serializable;

@Entity // Create database entity
@Table(name = "personnel") // Use personnel table in MySQL
public class Personnel implements Serializable {

	@Id // MySQL table ID field
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId; // Long ID is autogenerated for database

	@Column(name = "employee_id")
	private String employeeId; // Employee Number

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "admin_permissions", length = 1)
	private String adminPermissions; // Y/N

	// Getters and Setters
	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String personnelId) {
		this.employeeId = personnelId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String personnelFirstName) {
		this.firstName = personnelFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String personnelLastName) {
		this.lastName = personnelLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String personnelEmail) {
		this.email = personnelEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String personnelPassword) {
		this.password = personnelPassword;
	}

	public String getAdminPermissions() {
		return adminPermissions;
	}

	public void setAdminPermissions(String personnelAdminPermissions) {
		this.adminPermissions = personnelAdminPermissions;
	}

	@Override
	public String toString() { // Debugging
		String personnelString = "";
		personnelString += ("Personnel ID: " + this.getpId() + "\n" + "First Name: " + this.getFirstName() + "\n"
				+ "Last Name: " + this.getLastName() + "\n" + "Email: " + this.getEmail() + "\n" + "Admin Permissions: "
				+ this.getAdminPermissions() + "\n" + "Password: " + this.getPassword());
		return personnelString;
	}

}
