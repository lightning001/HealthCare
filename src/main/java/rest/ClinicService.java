package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.ClinicDAO;
import entity.Clinic;

@Path("/clinic")
public class ClinicService {

	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public String getClinic(@PathParam("id") String id) {
		try {
			int i = Integer.parseInt(id);
			return ClinicDAO.getClinic(i).toJson();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@GET
	@Path("/search/name/{name}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public String searchByName(@PathParam("name") String name) {
		try {
			if (name != null && !"".equals(name)) {
				return Clinic.toJsonList(ClinicDAO.getClinicByName(name));
			} else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@GET
	@Path("/search/address/{address}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON + ";charset=ut8-8")
	public String searchByAddress(@PathParam("address") String address) {
		try {
			if (address != null && !"".equals(address)) {
				return Clinic.toJsonList(ClinicDAO.getClinicByAddress(address));
			} else
				return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Path("/delete/{id}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN + ";charset=utf-8")
	@Consumes(MediaType.TEXT_PLAIN + ";charset=utf-8")
	public boolean delete(@PathParam("id") String id) {
		try {
			int i = Integer.parseInt(id);
			Clinic clinic = ClinicDAO.getClinic(i);
			return ClinicDAO.delete(clinic);
		} catch (Exception e) {
			return false;
		}
	}
}