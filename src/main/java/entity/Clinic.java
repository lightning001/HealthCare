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

import org.codehaus.jackson.map.ObjectMapper;

/**
 * Clinic generated by hbm2java
 */
@Entity
@XmlRootElement
public class Clinic implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7025283168242715919L;
	@Id
	@GeneratedValue
	private int idClinic;
	private String address;
	private String nameClinic;
	@OneToMany(mappedBy = "clinic")
	private Set<Doctor> doctors = new HashSet<Doctor>(0);

	public Clinic() {
	}

	public Clinic(int idClinic) {
		this.idClinic = idClinic;
	}

	public Clinic(int idClinic, String address, String nameClinic, Set<Doctor> doctors) {
		this.idClinic = idClinic;
		this.address = address;
		this.nameClinic = nameClinic;
		this.doctors = doctors;
	}

	public Clinic(String address, String nameClinic) {
		super();
		this.address = address;
		this.nameClinic = nameClinic;
	}

	public Clinic(int idClinic, String address, String nameClinic) {
		super();
		this.idClinic = idClinic;
		this.address = address;
		this.nameClinic = nameClinic;
	}

	public int getIdClinic() {
		return this.idClinic;
	}

	@XmlElement
	public void setIdClinic(int idClinic) {
		this.idClinic = idClinic;
	}

	public String getAddress() {
		return this.address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public String getNameClinic() {
		return this.nameClinic;
	}

	@XmlElement
	public void setNameClinic(String nameClinic) {
		this.nameClinic = nameClinic;
	}

	public Set<Doctor> getDoctors() {
		return this.doctors;
	}

	@XmlElement
	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Clinic " + idClinic + "\taddress: " + address + "\tname: " + nameClinic;
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

	public static Clinic parseJson(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Clinic doctor = mapper.readValue(json, Clinic.class);
			return doctor;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
