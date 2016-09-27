package top.yellowbig.info;


import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Path("/info")
public class InfoRest {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@Context HttpServletRequest request){
		ObjectMapper om = new ObjectMapper();
		ObjectNode infoNode = om.createObjectNode();
		infoNode.put("name", "jack");
		infoNode.put("year", "18");
		return Response.ok()
				.entity(infoNode.toString()).build();
	}
	
}
