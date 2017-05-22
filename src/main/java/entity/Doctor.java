package entity;
// Generated May 8, 2017 8:56:39 AM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Doctor generated by hbm2java
 */
@Entity
@XmlRootElement
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Doctor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6588667884351871750L;
	@Id
	@GeneratedValue
	private int idDoctor;
	@ManyToOne
	private Clinic clinic;
	@ManyToOne
	private Specialty specialty;
	private String username;
	private String nameDoctor;
	private String passwords;
	private String phone;
	private String passport;
	private String degree;
	private Integer experience;
	private String address;
	private String wordspace;
	private Date timeCreate;
	private Boolean isCheck;
	@JsonIgnore
	@ManyToMany(mappedBy = "doctors")
	private Set<Schedules> scheduleses = new HashSet<Schedules>(0);
	@JsonIgnore
	@OneToMany(mappedBy = "doctor")
	private Set<Reservation> reservations = new HashSet<Reservation>(0);
	@JsonIgnore
	@OneToMany(mappedBy = "doctor")
	private Set<Message> messages = new HashSet<Message>(0);

	public Doctor() {
	}

	public Doctor(int idDoctor, Date timeCreate) {
		this.idDoctor = idDoctor;
		this.timeCreate = timeCreate;
	}

	public Doctor(Clinic clinic, Specialty specialty, String username, String nameDoctor, String passwords,
			String phone, String passport, String degree, Integer experience, String address, String wordspace,
			Date timeCreate, Boolean isCheck) {
		super();
		this.clinic = clinic;
		this.specialty = specialty;
		this.username = username;
		this.nameDoctor = nameDoctor;
		this.passwords = passwords;
		this.phone = phone;
		this.passport = passport;
		this.degree = degree;
		this.experience = experience;
		this.address = address;
		this.wordspace = wordspace;
		this.timeCreate = timeCreate;
		this.isCheck = isCheck;
	}

	public Doctor(int idDoctor, Clinic clinic, Specialty specialty, String username, String nameDoctor,
			String passwords, String phone, String passport, String degree, Integer experience, String address,
			String wordspace, Date timeCreate, Boolean isCheck) {
		super();
		this.idDoctor = idDoctor;
		this.clinic = clinic;
		this.specialty = specialty;
		this.username = username;
		this.nameDoctor = nameDoctor;
		this.passwords = passwords;
		this.phone = phone;
		this.passport = passport;
		this.degree = degree;
		this.experience = experience;
		this.address = address;
		this.wordspace = wordspace;
		this.timeCreate = timeCreate;
		this.isCheck = isCheck;
	}

	public Doctor(int idDoctor, Clinic clinic, Specialty specialty, String username, String nameDoctor,
			String passwords, String phone, String passport, String degree, Integer experience, String address,
			String wordspace, Date timeCreate, Boolean isCheck, Set<Schedules> scheduleses,
			Set<Reservation> reservations, Set<Message> messages) {
		super();
		this.idDoctor = idDoctor;
		this.clinic = clinic;
		this.specialty = specialty;
		this.username = username;
		this.nameDoctor = nameDoctor;
		this.passwords = passwords;
		this.phone = phone;
		this.passport = passport;
		this.degree = degree;
		this.experience = experience;
		this.address = address;
		this.wordspace = wordspace;
		this.timeCreate = timeCreate;
		this.isCheck = isCheck;
		this.scheduleses = scheduleses;
		this.reservations = reservations;
		this.messages = messages;
	}

	public int getIdDoctor() {
		return this.idDoctor;
	}

	@XmlElement
	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Clinic getClinic() {
		return this.clinic;
	}

	@XmlElement
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public Specialty getSpecialty() {
		return this.specialty;
	}

	@XmlElement
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public String getUsername() {
		return this.username;
	}

	@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}

	public String getNameDoctor() {
		return this.nameDoctor;
	}

	@XmlElement
	public void setNameDoctor(String nameDoctor) {
		this.nameDoctor = nameDoctor;
	}

	public String getPasswords() {
		return this.passwords;
	}

	@XmlElement
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public String getPhone() {
		return this.phone;
	}

	@XmlElement
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassport() {
		return this.passport;
	}

	@XmlElement
	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getDegree() {
		return this.degree;
	}

	@XmlElement
	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getExperience() {
		return this.experience;
	}

	@XmlElement
	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getAddress() {
		return this.address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public String getWordspace() {
		return this.wordspace;
	}

	@XmlElement
	public void setWordspace(String wordspace) {
		this.wordspace = wordspace;
	}

	public Date getTimeCreate() {
		return this.timeCreate;
	}

	@XmlElement
	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public Boolean getIsCheck() {
		return this.isCheck;
	}

	@XmlElement
	public void setIsCheck(Boolean isCheck) {
		this.isCheck = isCheck;
	}

	public Set<Schedules> getScheduleses() {
		return scheduleses;
	}

	@XmlElement
	public void setScheduleses(Set<Schedules> scheduleses) {
		this.scheduleses = scheduleses;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	@XmlElement
	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Set<Message> getMessages() {
		return messages;
	}

	@XmlElement
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Doctor [idDoctor=");
		builder.append(idDoctor);
		builder.append(", clinic=");
		builder.append(clinic);
		builder.append(", specialty=");
		builder.append(specialty);
		builder.append(", username=");
		builder.append(username);
		builder.append(", nameDoctor=");
		builder.append(nameDoctor);
		builder.append(", passwords=");
		builder.append(passwords);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", passport=");
		builder.append(passport);
		builder.append(", degree=");
		builder.append(degree);
		builder.append(", experience=");
		builder.append(experience);
		builder.append(", address=");
		builder.append(address);
		builder.append(", wordspace=");
		builder.append(wordspace);
		builder.append(", timeCreate=");
		builder.append(timeCreate);
		builder.append(", isCheck=");
		builder.append(isCheck);
		builder.append(", scheduleses=");
		builder.append(scheduleses);
		builder.append(", reservations=");
		builder.append(reservations);
		builder.append("]");
		return builder.toString();
	}

	public String toJson() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(this);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Doctor parseJson(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Doctor doctor = mapper.readValue(json, Doctor.class);
			return doctor;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
