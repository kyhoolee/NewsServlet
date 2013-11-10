package com.minzbox.base.retriever;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.CategoryRelation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 
 * @author kylee
 * @author congnh
 */
@WebService
public class CatRelationRetriever {

	@WebMethod
	public List<CategoryRelation> getAllCatRelation() throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM CategoryRelation");
		ResultSet resultSet = statement.executeQuery();

		List<CategoryRelation> entities = new ArrayList<CategoryRelation>();
		while (resultSet.next()) {
			CategoryRelation entity = new CategoryRelation();
			entity.setSubID(resultSet.getString("SubID"));
			entity.setSuperID(resultSet.getString("SuperID"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<CategoryRelation> getCatRelationBySubID(String SubID)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM CategoryRelation WHERE SubID = "
		        + SubID);
		ResultSet resultSet = statement.executeQuery();

		List<CategoryRelation> entities = new ArrayList<CategoryRelation>();
		while (resultSet.next()) {
			CategoryRelation entity = new CategoryRelation();
			entity.setSubID(resultSet.getString("SubID"));
			entity.setSuperID(resultSet.getString("SuperID"));

			System.out.println("SubID: " + entity.getSubID() + " | SuperID "
			    + entity.getSuperID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<CategoryRelation> getCatRelationBySuperID(String SuperID)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM CategoryRelation WHERE SuperID = "
		        + SuperID);
		ResultSet resultSet = statement.executeQuery();

		List<CategoryRelation> entities = new ArrayList<CategoryRelation>();
		while (resultSet.next()) {
			CategoryRelation entity = new CategoryRelation();
			entity.setSubID(resultSet.getString("SubID"));
			entity.setSuperID(resultSet.getString("SuperID"));

			System.out.println("SubID: " + entity.getSubID() + " | SuperID: "
			    + entity.getSuperID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}
}
