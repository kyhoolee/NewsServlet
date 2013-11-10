package com.minzbox.base.retriever;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.Site;
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
public class SiteRetriever {

	@WebMethod
	public List<Site> getAllSite() throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT ID, Name, URL, Abstract FROM Site");
		ResultSet resultSet = statement.executeQuery();

		List<Site> entities = new ArrayList<Site>();
		while (resultSet.next()) {
			Site entity = new Site();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}

		connection.close();
		return entities;
	}

	@WebMethod
	public List<Site> getSiteByID(String ID) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Site WHERE Site.ID =" + ID);
		ResultSet resultSet = statement.executeQuery();

		List<Site> entities = new ArrayList<Site>();
		while (resultSet.next()) {
			Site entity = new Site();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Site> getSiteByName(String name) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Site WHERE Site.Name ='" + name + "'");
		ResultSet resultSet = statement.executeQuery();

		List<Site> entities = new ArrayList<Site>();
		while (resultSet.next()) {
			Site entity = new Site();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Site> getSiteByURL(String url) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Site WHERE Site.URL ='" + url + "'");
		ResultSet resultSet = statement.executeQuery();

		List<Site> entities = new ArrayList<Site>();
		while (resultSet.next()) {
			Site entity = new Site();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Site> getSiteByApproximateName(String name) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Site WHERE Site.Name LIKE '%" + name
		        + "%'");
		System.out.println(statement.toString());
		ResultSet resultSet = statement.executeQuery();

		List<Site> entities = new ArrayList<Site>();
		while (resultSet.next()) {
			Site entity = new Site();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Site> getSiteByApproximateAbstract(String abs)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Site WHERE Site.Abstract LIKE '%"
		        + abs + "%'");
		System.out.println(statement.toString());
		ResultSet resultSet = statement.executeQuery();

		List<Site> entities = new ArrayList<Site>();
		while (resultSet.next()) {
			Site entity = new Site();
			entity.setID(resultSet.getString("ID"));
			entity.setName(resultSet.getString("Name"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));

			System.out.println("ID: " + entity.getID() + " | Name "
			    + entity.getName());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

}
