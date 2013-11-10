package com.minzbox.base.retriever;

import com.minzbox.base.connector.DBConnector;
import com.minzbox.base.entities.Information;
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
public class InfoRetriever {

	@WebMethod
	public List<Information> getAllInformation() throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationByID(String ID) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.ID ="
		        + ID);
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationBySiteID(String ID)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.SiteID ="
		        + ID);
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationByTitle(String name)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.Title ='"
		        + name + "'");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}


	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws SQLException
	 */
	@WebMethod
	public List<Information> getInformationByPubDate(String startDate, String endDate)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.PubDate >='"
		        + startDate + "' AND Information.PubDate <= '" + endDate + "'" );
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

//			System.out.println();
//			System.out.println(entity.getID() + " | " + entity.getRawContent());
//			System.out.println();
//			System.out.println("-----------------------------------------------");

			entities.add(entity);
		}
		connection.close();
		return entities;
	}
	
	@WebMethod
	public List<Information> getInformationByPubDate(String name)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.PubDate ='"
		        + name + "'");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationByCrawlDate(String name)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.CrawlDate ='"
		        + name + "'");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationByURL(String url) throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.URL ='"
		        + url + "'");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationByApproximateTitle(String name)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.Title LIKE '%"
		        + name + "%'");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationByApproximateAbstract(String abs)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.Abstract LIKE '%"
		        + abs + "%'");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());

			entities.add(entity);
		}
		connection.close();
		return entities;
	}

	@WebMethod
	public List<Information> getInformationByApproximateContent(String abs)
	    throws SQLException {
		Connection connection = DBConnector.getInstance().minzboxConnect();
		PreparedStatement statement = connection
		    .prepareStatement("SELECT * FROM Information WHERE Information.Content LIKE '%"
		        + abs + "%'");
		ResultSet resultSet = statement.executeQuery();

		List<Information> entities = new ArrayList<Information>();
		while (resultSet.next()) {
			Information entity = new Information();
			entity.setID(resultSet.getString("ID"));
			entity.setURL(resultSet.getString("URL"));
			entity.setAbstractContent(resultSet.getString("Abstract"));
			entity.setRawContent(resultSet.getString("Content"));
			entity.setTitle(resultSet.getString("Title"));
			entity.setSiteID(resultSet.getString("SiteID"));
			entity.setPubDate(resultSet.getString("PubDate"));
			entity.setCrawlDate(resultSet.getString("CrawlDate"));

			// System.out.println("ID: " + entity.getInfoID() + " | Name " +
			// entity.getTagID());
			entities.add(entity);
		}
		connection.close();
		return entities;
	}
}
