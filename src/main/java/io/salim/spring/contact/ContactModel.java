package io.salim.spring.contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactModel {
	
	private Long id;
	private String type;
	private String name;
	private String surname;
	private String salutation;
	private String email;
	private String title;
	private String profile;
	private String profession;
	private String phone;
	private String address;
	private java.util.Date date_birth;
	private int report_to;
	private int owner;
	private String lead_source;
	private String entity;
	private String branch;
	private String linkedin;
	private String facebook;
	private String twitter;
	private java.util.Date last_request_date;
	private int years_experience;
	private String department;
	private String summary;
	private String nationality;
	private int org_id;
	private int created_by;
	private int modified_by;
	private String country_of_birth;
	private String social_security;
	private String family_situation;
	private String number_of_children;
	private int campus;
	private String job;
	private String replacement;
	private String motive_of_the_exit;
	private String seniority;
	private String inactive_employee;
	private String contract_type;
	private String category;
	private String period_of_payment;
	private int hours_per_week;
	private int hours_per_month;
	private int hours_per_year;
	private String contract_work;
	private String meal_coupon;
	private String meal_coupon_per_month;
	private String last_medical_visit;
	private int user_id;
	private int vacation_per_year;
	private String adherent_id;
	private String donor_id;
	private String subtype;
	private String adhesion;
	private String amount;
	private String cycle;
	private String payment_way;
	private String source;
	private String tax_receipt;
	private String city;
	private String postal_code;
	private String link;
	private String link_to_contact;
	private String membership_fee;
	private String available;
	private String unavailability_id;
	private String family;
	private String rank;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id=id;
	}

	public String getType(){
		return type;
	}

	public void setType(String type){
		this.type=type;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getSurname(){
		return surname;
	}

	public void setSurname(String surname){
		this.surname=surname;
	}

	public String getSalutation(){
		return salutation;
	}

	public void setSalutation(String salutation){
		this.salutation=salutation;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title=title;
	}

	public String getProfile(){
		return profile;
	}

	public void setProfile(String profile){
		this.profile=profile;
	}

	public String getProfession(){
		return profession;
	}

	public void setProfession(String profession){
		this.profession=profession;
	}

	public String getPhone(){
		return phone;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public java.util.Date getDate_birth(){
		return date_birth;
	}

	public void setDate_birth(java.util.Date date_birth){
		this.date_birth=date_birth;
	}

	public int getReport_to(){
		return report_to;
	}

	public void setReport_to(int report_to){
		this.report_to=report_to;
	}

	public int getOwner(){
		return owner;
	}

	public void setOwner(int owner){
		this.owner=owner;
	}

	public String getLead_source(){
		return lead_source;
	}

	public void setLead_source(String lead_source){
		this.lead_source=lead_source;
	}

	public String getEntity(){
		return entity;
	}

	public void setEntity(String entity){
		this.entity=entity;
	}

	public String getBranch(){
		return branch;
	}

	public void setBranch(String branch){
		this.branch=branch;
	}

	public String getLinkedin(){
		return linkedin;
	}

	public void setLinkedin(String linkedin){
		this.linkedin=linkedin;
	}

	public String getFacebook(){
		return facebook;
	}

	public void setFacebook(String facebook){
		this.facebook=facebook;
	}

	public String getTwitter(){
		return twitter;
	}

	public void setTwitter(String twitter){
		this.twitter=twitter;
	}

	public java.util.Date getLast_request_date(){
		return last_request_date;
	}

	public void setLast_request_date(java.util.Date last_request_date){
		this.last_request_date=last_request_date;
	}

	public int getYears_experience(){
		return years_experience;
	}

	public void setYears_experience(int years_experience){
		this.years_experience=years_experience;
	}

	public String getDepartment(){
		return department;
	}

	public void setDepartment(String department){
		this.department=department;
	}

	public String getSummary(){
		return summary;
	}

	public void setSummary(String summary){
		this.summary=summary;
	}

	public String getNationality(){
		return nationality;
	}

	public void setNationality(String nationality){
		this.nationality=nationality;
	}

	public int getOrg_id(){
		return org_id;
	}

	public void setOrg_id(int org_id){
		this.org_id=org_id;
	}

	public int getCreated_by(){
		return created_by;
	}

	public void setCreated_by(int created_by){
		this.created_by=created_by;
	}

	public int getModified_by(){
		return modified_by;
	}

	public void setModified_by(int modified_by){
		this.modified_by=modified_by;
	}

	public String getCountry_of_birth(){
		return country_of_birth;
	}

	public void setCountry_of_birth(String country_of_birth){
		this.country_of_birth=country_of_birth;
	}

	public String getSocial_security(){
		return social_security;
	}

	public void setSocial_security(String social_security){
		this.social_security=social_security;
	}

	public String getFamily_situation(){
		return family_situation;
	}

	public void setFamily_situation(String family_situation){
		this.family_situation=family_situation;
	}

	public String getNumber_of_children(){
		return number_of_children;
	}

	public void setNumber_of_children(String number_of_children){
		this.number_of_children=number_of_children;
	}

	public int getCampus(){
		return campus;
	}

	public void setCampus(int campus){
		this.campus=campus;
	}

	public String getJob(){
		return job;
	}

	public void setJob(String job){
		this.job=job;
	}

	public String getReplacement(){
		return replacement;
	}

	public void setReplacement(String replacement){
		this.replacement=replacement;
	}

	public String getMotive_of_the_exit(){
		return motive_of_the_exit;
	}

	public void setMotive_of_the_exit(String motive_of_the_exit){
		this.motive_of_the_exit=motive_of_the_exit;
	}

	public String getSeniority(){
		return seniority;
	}

	public void setSeniority(String seniority){
		this.seniority=seniority;
	}

	public String getInactive_employee(){
		return inactive_employee;
	}

	public void setInactive_employee(String inactive_employee){
		this.inactive_employee=inactive_employee;
	}

	public String getContract_type(){
		return contract_type;
	}

	public void setContract_type(String contract_type){
		this.contract_type=contract_type;
	}

	public String getCategory(){
		return category;
	}

	public void setCategory(String category){
		this.category=category;
	}

	public String getPeriod_of_payment(){
		return period_of_payment;
	}

	public void setPeriod_of_payment(String period_of_payment){
		this.period_of_payment=period_of_payment;
	}

	public int getHours_per_week(){
		return hours_per_week;
	}

	public void setHours_per_week(int hours_per_week){
		this.hours_per_week=hours_per_week;
	}

	public int getHours_per_month(){
		return hours_per_month;
	}

	public void setHours_per_month(int hours_per_month){
		this.hours_per_month=hours_per_month;
	}

	public int getHours_per_year(){
		return hours_per_year;
	}

	public void setHours_per_year(int hours_per_year){
		this.hours_per_year=hours_per_year;
	}

	public String getContract_work(){
		return contract_work;
	}

	public void setContract_work(String contract_work){
		this.contract_work=contract_work;
	}

	public String getMeal_coupon(){
		return meal_coupon;
	}

	public void setMeal_coupon(String meal_coupon){
		this.meal_coupon=meal_coupon;
	}

	public String getMeal_coupon_per_month(){
		return meal_coupon_per_month;
	}

	public void setMeal_coupon_per_month(String meal_coupon_per_month){
		this.meal_coupon_per_month=meal_coupon_per_month;
	}

	public String getLast_medical_visit(){
		return last_medical_visit;
	}

	public void setLast_medical_visit(String last_medical_visit){
		this.last_medical_visit=last_medical_visit;
	}

	public int getUser_id(){
		return user_id;
	}

	public void setUser_id(int user_id){
		this.user_id=user_id;
	}

	public int getVacation_per_year(){
		return vacation_per_year;
	}

	public void setVacation_per_year(int vacation_per_year){
		this.vacation_per_year=vacation_per_year;
	}

	public String getAdherent_id(){
		return adherent_id;
	}

	public void setAdherent_id(String adherent_id){
		this.adherent_id=adherent_id;
	}

	public String getDonor_id(){
		return donor_id;
	}

	public void setDonor_id(String donor_id){
		this.donor_id=donor_id;
	}

	public String getSubtype(){
		return subtype;
	}

	public void setSubtype(String subtype){
		this.subtype=subtype;
	}

	public String getAdhesion(){
		return adhesion;
	}

	public void setAdhesion(String adhesion){
		this.adhesion=adhesion;
	}

	public String getAmount(){
		return amount;
	}

	public void setAmount(String amount){
		this.amount=amount;
	}

	public String getCycle(){
		return cycle;
	}

	public void setCycle(String cycle){
		this.cycle=cycle;
	}

	public String getPayment_way(){
		return payment_way;
	}

	public void setPayment_way(String payment_way){
		this.payment_way=payment_way;
	}

	public String getSource(){
		return source;
	}

	public void setSource(String source){
		this.source=source;
	}

	public String getTax_receipt(){
		return tax_receipt;
	}

	public void setTax_receipt(String tax_receipt){
		this.tax_receipt=tax_receipt;
	}

	public String getCity(){
		return city;
	}

	public void setCity(String city){
		this.city=city;
	}

	public String getPostal_code(){
		return postal_code;
	}

	public void setPostal_code(String postal_code){
		this.postal_code=postal_code;
	}

	public String getLink(){
		return link;
	}

	public void setLink(String link){
		this.link=link;
	}

	public String getLink_to_contact(){
		return link_to_contact;
	}

	public void setLink_to_contact(String link_to_contact){
		this.link_to_contact=link_to_contact;
	}

	public String getMembership_fee(){
		return membership_fee;
	}

	public void setMembership_fee(String membership_fee){
		this.membership_fee=membership_fee;
	}

	public String getAvailable(){
		return available;
	}

	public void setAvailable(String available){
		this.available=available;
	}

	public String getUnavailability_id(){
		return unavailability_id;
	}

	public void setUnavailability_id(String unavailability_id){
		this.unavailability_id=unavailability_id;
	}

	public String getFamily(){
		return family;
	}

	public void setFamily(String family){
		this.family=family;
	}

	public String getRank(){
		return rank;
	}

	public void setRank(String rank){
		this.rank=rank;
	}
	
}
