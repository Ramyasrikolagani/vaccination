package com.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vaccine {
@Id
private String citizenId;
private String citizenName;
private String vaccineName;
private String vaccineCentreId;
private String vaccineCentreAddress;
public Vaccine() {
	super();
}
public Vaccine(String citizenId, String citizenName, String vaccineName, String vaccineCentreId,
		String vaccineCentreAddress) {
	super();
	this.citizenId = citizenId;
	this.citizenName = citizenName;
	this.vaccineName = vaccineName;
	this.vaccineCentreId = vaccineCentreId;
	this.vaccineCentreAddress = vaccineCentreAddress;
}
public String getCitizenId() {
	return citizenId;
}
public void setCitizenId(String citizenId) {
	this.citizenId = citizenId;
}
public String getCitizenName() {
	return citizenName;
}
public void setCitizenName(String citizenName) {
	this.citizenName = citizenName;
}
public String getVaccineName() {
	return vaccineName;
}
public void setVaccineName(String vaccineName) {
	this.vaccineName = vaccineName;
}
public String getVaccineCentreId() {
	return vaccineCentreId;
}
public void setVaccineCentreId(String vaccineCentreId) {
	this.vaccineCentreId = vaccineCentreId;
}
public String getVaccineCentreAddress() {
	return vaccineCentreAddress;
}
public void setVaccineCentreAddress(String vaccineCentreAddress) {
	this.vaccineCentreAddress = vaccineCentreAddress;
}
@Override
public String toString() {
	return "Vaccine [citizenId=" + citizenId + ", citizenName=" + citizenName + ", vaccineName=" + vaccineName
			+ ", vaccineCentreId=" + vaccineCentreId + ", vaccineCentreAddress=" + vaccineCentreAddress
			+ ", getCitizenId()=" + getCitizenId() + ", getCitizenName()=" + getCitizenName() + ", getVaccineName()="
			+ getVaccineName() + ", getVaccineCentreId()=" + getVaccineCentreId() + ", getVaccineCentreAddress()="
			+ getVaccineCentreAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}




}
