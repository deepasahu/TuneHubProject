package com.kodnest.tunehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ResetPasswordForm {
	
	@Id
	private String email;
    private String newPassword;
    private String confirmPassword;
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public ResetPasswordForm(String email, String newPassword, String confirmPassword) {
		super();
		this.email = email;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
	}
	public ResetPasswordForm() {
		super();
	}
	@Override
	public String toString() {
		return "ResetPasswordForm [email=" + email + ", newPassword=" + newPassword + ", confirmPassword="
				+ confirmPassword + "]";
	}
    
    
    
    

}
