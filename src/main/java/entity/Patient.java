package entity;
// Generated May 8, 2017 8:56:39 AM by Hibernate Tools 5.2.1.Final

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Patient generated by hbm2java
 */
@Entity
@XmlRootElement
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Patient implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7593466296168954875L;
	@Id
	@GeneratedValue
	private int idPatient;
	@ManyToOne
	private Users users;
	private String namePatient;
	private Integer age;
	private Boolean gender;
	private String address;
	private Integer monthAge;

	public Patient() {
	}

	public Patient(Users users, String namePatient, Integer age, Boolean gender, String address, Integer monthAge) {
		super();
		this.users = users;
		this.namePatient = namePatient;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.monthAge = monthAge;
	}

	public Patient(int idPatient) {
		this.idPatient = idPatient;
	}

	public Patient(int idPatient, Users users, String namePatient, Integer age, Boolean gender, String address,
			Integer monthAge) {
		this.idPatient = idPatient;
		this.users = users;
		this.namePatient = namePatient;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.monthAge = monthAge;
	}

	public int getIdPatient() {
		return this.idPatient;
	}

	@XmlElement
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public Users getUsers() {
		return this.users;
	}

	@XmlElement
	public void setUsers(Users users) {
		this.users = users;
	}

	public String getNamePatient() {
		return this.namePatient;
	}

	@XmlElement
	public void setNamePatient(String namePatient) {
		this.namePatient = namePatient;
	}

	public Integer getAge() {
		return this.age;
	}

	@XmlElement
	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getGender() {
		return this.gender;
	}

	@XmlElement
	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return this.address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMonthAge() {
		return this.monthAge;
	}

	@XmlElement
	public void setMonthAge(Integer monthAge) {
		this.monthAge = monthAge;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Patient [idPatient=");
		builder.append(idPatient);
		builder.append(", users=");
		builder.append(users);
		builder.append(", namePatient=");
		builder.append(namePatient);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", address=");
		builder.append(address);
		builder.append(", monthAge=");
		builder.append(monthAge);
		builder.append("]");
		return builder.toString();
	}

	public String toJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Patient parseJson(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Patient doctor = mapper.readValue(json, Patient.class);
			return doctor;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
