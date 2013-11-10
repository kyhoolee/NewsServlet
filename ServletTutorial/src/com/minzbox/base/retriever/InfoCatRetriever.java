package com.minzbox.base.retriever;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.InformationCategory;
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
public class InfoCatRetriever {

	@WebMethod
	public List<InformationCategory> getAllInfoCat() throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM InformationCategory");
		ResultSet resultSet = statement.executeQuery();

		List<InformationCategory> entities = new ArrayList<InformationCategory>();
		while (resultSet.next()) {
			InformationCategory entity = new InformationCategory();
			entity.setInfoID(resultSet.getString("InfoID"));
			entity.setCategoryID(resultSet.getString("CatergoryID"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<InformationCategory> getInfoCatByInfoID(String ID)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM InformationCategory WHERE InformationCategory.InfoID = "
		        + ID);
		ResultSet resultSet = statement.executeQuery();

		List<InformationCategory> entities = new ArrayList<InformationCategory>();
		while (resultSet.next()) {
			InformationCategory entity = new InformationCategory();
			entity.setInfoID(resultSet.getString("InfoID"));
			entity.setCategoryID(resultSet.getString("CategoryID"));

			System.out.println("ID: " + entity.getInfoID() + " | Name "
			    + entity.getCategoryID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<InformationCategory> getInfoCatByCatID(String ID)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM InformationCategory WHERE InformationCategory.CategoryID = "
		        + ID);
		System.out.println(statement.toString());
		ResultSet resultSet = statement.executeQuery();

		List<InformationCategory> entities = new ArrayList<InformationCategory>();
		while (resultSet.next()) {
			InformationCategory entity = new InformationCategory();
			entity.setInfoID(resultSet.getString("InfoID"));
			entity.setCategoryID(resultSet.getString("CategoryID"));

			System.out.println("ID: " + entity.getInfoID() + " | Name "
			    + entity.getCategoryID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}
}
