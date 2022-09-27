package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class PatientClass
{
	@Id
	@Column(name="pId")
	private int pId;
	@Column(name="pName")
	private String pName;
	@Column(name="pBirthdate")
	private String pBirthdate;
	@Column(name="pGender")
	private String pGender;
	@Column(name="pMobileNo")
	private long pMobileNo;
	@Column(name="pAddress")
	private String pAddress;
	@Column(name="pBloodGroup")
	private String pBloodGroup;
	@Column(name="pDiseases")
	private String pDiseases;
	@Column(name="pMedicineAllergy")
	private String pMedicineAllergy;	
	@Column(name="pDoctorId")
	private String pDoctorId;
	
	public PatientClass()
	{
		
	}
	public PatientClass(int pid, String name, String birthdate, String gender, long mobileNo, String address,
			String bloodGroup, String diseases, String medicineAllergy, String doctorId) {
		super();
		this.pId = pid;
		this.pName = name;
		this.pBirthdate = birthdate;
		this.pGender = gender;
		this.pMobileNo = mobileNo;
		this.pAddress = address;
		this.pBloodGroup = bloodGroup;
		this.pDiseases = diseases;
		this.pMedicineAllergy = medicineAllergy;
		this.pDoctorId = doctorId;
	}
	public int getPid() {
		return pId;
	}
	public void setPid(int i) {
		this.pId = i;
	}
	public String getName() {
		return pName;
	}
	public void setName(String name) {
		this.pName = name;
	}
	public String getBirthdate() {
		return pBirthdate;
	}
	public void setBirthdate(String birthdate) {
		this.pBirthdate = birthdate;
	}
	public String getGender() {
		return pGender;
	}
	public void setGender(String gender) {
		this.pGender = gender;
	}
	public long getMobileNo() {
		return pMobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.pMobileNo = mobileNo;
	}
	public String getAddress() {
		return pAddress;
	}
	public void setAddress(String address) {
		this.pAddress = address;
	}
	public String getBloodGroup() {
		return pBloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.pBloodGroup = bloodGroup;
	}
	public String getDiseases() {
		return pDiseases;
	}
	public void setDiseases(String diseases) {
		this.pDiseases = diseases;
	}
	public String getMedicineAllergy() {
		return pMedicineAllergy;
	}
	public void setMedicineAllergy(String medicineAllergy) {
		this.pMedicineAllergy = medicineAllergy;
	}
	public String getDoctorId() {
		return pDoctorId;
	}
	public void setDoctorId(String doctorId) {
		this.pDoctorId = doctorId;
	}
	
	
}
