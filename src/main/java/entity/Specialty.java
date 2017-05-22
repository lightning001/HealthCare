package entity;
// Generated May 8, 2017 8:56:39 AM by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Specialty generated by hbm2java
 */
@Entity
@XmlRootElement
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Specialty implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8868335981988916560L;
	@Id
	@GeneratedValue
	private int idSpecialty;
	private String nameSpecialty;
	@JsonIgnore
	@OneToMany(mappedBy = "specialty")
	private Set<Questionmessage> questionmessages = new HashSet<Questionmessage>(0);
	@JsonIgnore
	@OneToMany(mappedBy = "specialty")
	private Set<Doctor> doctors = new HashSet<Doctor>(0);

	public Specialty() {
	}

	public Specialty(int idSpecialty) {
		this.idSpecialty = idSpecialty;
	}

	public Specialty(int idSpecialty, String nameSpecialty) {
		super();
		this.idSpecialty = idSpecialty;
		this.nameSpecialty = nameSpecialty;
	}

	public Specialty(String nameSpecialty) {
		super();
		this.nameSpecialty = nameSpecialty;
	}

	public Specialty(int idSpecialty, String nameSpecialty, Set<Questionmessage> questionmessages,
			Set<Doctor> doctors) {
		super();
		this.idSpecialty = idSpecialty;
		this.nameSpecialty = nameSpecialty;
		this.questionmessages = questionmessages;
		this.doctors = doctors;
	}

	public int getIdSpecialty() {
		return this.idSpecialty;
	}

	@XmlElement
	public void setIdSpecialty(int idSpecialty) {
		this.idSpecialty = idSpecialty;
	}

	public String getNameSpecialty() {
		return this.nameSpecialty;
	}

	@XmlElement
	public void setNameSpecialty(String nameSpecialty) {
		this.nameSpecialty = nameSpecialty;
	}

	public Set<Questionmessage> getQuestionmessages() {
		return questionmessages;
	}

	@XmlElement
	public void setQuestionmessages(Set<Questionmessage> questionmessages) {
		this.questionmessages = questionmessages;
	}

	public Set<Doctor> getDoctors() {
		return doctors;
	}

	@XmlElement
	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id: ");
		builder.append(idSpecialty);
		builder.append("\tname: ");
		builder.append(nameSpecialty);
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

	public static Specialty parseJson(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Specialty doctor = mapper.readValue(json, Specialty.class);
			return doctor;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
