package api.planning;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity // This tells Hibernate to make a table out of this class
@Immutable
@Table(name = "planning_view") 
class PlanningView  {

    @Column(name = "utility_name")
    @Id
    private String utility_name;
    @Column(name = "usage_time_hour")
    private String usage_time_hour;
    @Column(name = "contact_name")
    private String contact_name;
    @Column(name = "contact_surname")
    private String contact_surname;
    @Column(name = "org_name")
    private String org_name;


    public String getUtilityName(){
		return utility_name;
    }
    
    public String getUsageTimeHour(){
		return usage_time_hour;
    }
    
    public String getContactName(){
		return contact_name;
    }
    
    public String getContactSurname(){
		return contact_surname;
    }
    
    public String getOrgName(){
		return org_name;
	}


}
	