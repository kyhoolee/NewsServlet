package com.minzbox.base.retriever;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.InformationTag;
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
public class InfoTagRetriever {

	@WebMethod
	public List<InformationTag> getAllInfoTag() throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT InfoID, TagID FROM InformationTag");
		ResultSet resultSet = statement.executeQuery();

		List<InformationTag> entities = new ArrayList<InformationTag>();
		while (resultSet.next()) {
			InformationTag entity = new InformationTag();
			entity.setInfoID(resultSet.getString("InfoID"));
			entity.setTagID(resultSet.getString("TagID"));

			System.out.println("ID: " + entity.getInfoID() + " | Name "
			    + entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<InformationTag> getInfoTagByInfoID(String ID) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM InformationTag WHERE InformationTag.InfoID = "
		        + ID);
		ResultSet resultSet = statement.executeQuery();

		List<InformationTag> entities = new ArrayList<InformationTag>();
		while (resultSet.next()) {
			InformationTag entity = new InformationTag();
			entity.setInfoID(resultSet.getString("InfoID"));
			entity.setTagID(resultSet.getString("CategoryID"));

			System.out.println("ID: " + entity.getInfoID() + " | Name "
			    + entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<InformationTag> getInfoTagByTagID(String ID) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM InformationTag WHERE InformationTag.CategoryID = "
		        + ID);
		System.out.println(statement.toString());
		ResultSet resultSet = statement.executeQuery();

		List<InformationTag> entities = new ArrayList<InformationTag>();
		while (resultSet.next()) {
			InformationTag entity = new InformationTag();
			entity.setInfoID(resultSet.getString("InfoID"));
			entity.setTagID(resultSet.getString("TagID"));

			System.out.println("ID: " + entity.getInfoID() + " | Name "
			    + entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}
}
