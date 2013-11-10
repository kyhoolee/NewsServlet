package com.minzbox.base.retriever;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.Category;
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
 */
@WebService
public class CategoryRetriever {

	@WebMethod
	public List<Category> getAllCategorty() throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Category");
		ResultSet resultSet = statement.executeQuery();

		List<Category> entities = new ArrayList<Category>();
		while (resultSet.next()) {
			Category entity = new Category();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Category> getCategoryByID(String ID) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Category WHERE Category.ID = " + ID);
		ResultSet resultSet = statement.executeQuery();

		List<Category> entities = new ArrayList<Category>();
		while (resultSet.next()) {
			Category entity = new Category();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Category> getCategoryByName(String Name) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Category WHERE Category.Name = '"
		        + Name + "'");
		System.out.println(statement.toString());
		ResultSet resultSet = statement.executeQuery();

		List<Category> entities = new ArrayList<Category>();
		while (resultSet.next()) {
			Category entity = new Category();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Category> getCategoryByApproximateName(String Name)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Category WHERE Category.Name LIKE '%"
		        + Name + "%'");
		System.out.println(statement.toString());
		ResultSet resultSet = statement.executeQuery();

		List<Category> entities = new ArrayList<Category>();
		while (resultSet.next()) {
			Category entity = new Category();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}
}
