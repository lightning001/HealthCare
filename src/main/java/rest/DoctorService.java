package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.DoctorDAO;
import entity.Doctor;
import util.DoctorUtil;

@Path("/doctor")
public class DoctorService {

	@GET
	@Produces(MediaType.APPLICATION_XML + ";charset=utf-8")
	public List<Doctor> getDoctors() {
		new DoctorUtil();
		return new ArrayList<Doctor>(DoctorUtil.listAllDoctors.values());
	}

	@GET
	@Path("/login/{user}/{pass}")
	@Produces(MediaType.APPLICATION_XML + ";charset=utf-8")
	public Doctor login(@PathParam("user") String username, @PathParam("pass") String password) {
		return DoctorDAO.login(username, password);
	}

	@POST
	@Path("/register/{doctorJson}")
	@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
	@Consumes(MediaType.TEXT_PLAIN + ";charset=utf-8")
	public boolean register(@PathParam("doctorJson") String doctorjson) {
		if (doctorjson == null)
			return false;
		try {
			Doctor doctor = Doctor.parseJson(doctorjson);
			if (DoctorDAO.register(doctor)) {
				if (DoctorDAO.insert(doctor))
					return true;

			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@PUT
	@Path("/update/{doctorJson}")
	@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
	@Consumes(MediaType.TEXT_PLAIN + ";charset=utf-8")
	public boolean update(@PathParam("doctorJson") String json) {
		if (json == null)
			return false;
		try {
			Doctor doctor = Doctor.parseJson(json);
			if (doctor != null)
				if (DoctorDAO.update(doctor))
					return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
	@Consumes(MediaType.TEXT_PLAIN + ";charset=utf-8")
	public boolean delete(@PathParam("id") String id) {
		if (id == null)
			return false;
		try {
			int i = Integer.parseInt(id);
			Doctor doctor = DoctorDAO.getDoctor(i);
			if (doctor != null)
				if (DoctorDAO.delete(doctor))
					return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
	@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Doctor getDoctor(@PathParam("id") String id) {
		if (id == null)
			return null;
		try {
			int i = Integer.parseInt(id);
			Doctor doctor = DoctorDAO.getDoctor(i);
			return doctor;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
