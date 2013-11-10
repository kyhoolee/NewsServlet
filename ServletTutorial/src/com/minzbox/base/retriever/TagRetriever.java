package com.minzbox.base.retriever;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.Tag;
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
public class TagRetriever {

	@WebMethod
	public List<Tag> getAllTag() throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT ID, Name FROM Tag");
		ResultSet resultSet = statement.executeQuery();

		List<Tag> entities = new ArrayList<Tag>();
		while (resultSet.next()) {
			Tag entity = new Tag();
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
	public List<Tag> getTagByID(String ID) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Tag WHERE Tag.ID =" + ID);
		ResultSet resultSet = statement.executeQuery();

		List<Tag> entities = new ArrayList<Tag>();
		while (resultSet.next()) {
			Tag entity = new Tag();
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
	public List<Tag> getTagByName(String name) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Tag WHERE Tag.Name ='" + name + "'");
		ResultSet resultSet = statement.executeQuery();

		List<Tag> entities = new ArrayList<Tag>();
		while (resultSet.next()) {
			Tag entity = new Tag();
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
	public List<Tag> getTagByApproximateName(String name) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Tag WHERE Tag.Name LIKE '%" + name
		        + "%'");
		System.out.println(statement.toString());
		ResultSet resultSet = statement.executeQuery();

		List<Tag> entities = new ArrayList<Tag>();
		while (resultSet.next()) {
			Tag entity = new Tag();
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
