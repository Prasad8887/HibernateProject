
create database hospital;
use hospital;
/*--------Patient Table--------*/
create table Patient(Pid int primary key not null,pName varchar(45),pBirthdate varchar(54),pGender varchar(67),
pMobileNo long ,pAddress varchar(67),pBloodGroup varchar(67),pDiseases varchar(67),pMedicineAllergy varchar(67),pDoctorId varchar(67));
select * from Patient;
drop table Patient;

/*--------Doctor Table--------*/
create table Doctor(doctorId varchar(56),dname varchar(45),dbirthdate varchar(54),dgender varchar(67),
dmobileNo long ,daddress varchar(67),dbloodGroup varchar(67),speciality varchar(67),medicineAllergy varchar(67));
drop table Doctor;
select * from Doctor;
