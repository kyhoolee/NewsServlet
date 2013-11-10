package com.minzbox;


import com.minzbox.base.retriever.CatRelationRetriever;
import com.minzbox.base.retriever.CategoryRetriever;
import com.minzbox.base.retriever.InfoRetriever;
import com.minzbox.base.retriever.InfoTagRetriever;
import java.sql.SQLException;

/**
 *
 * @author kylee
 */
public class MainTest{
    public static void main(String[] args) throws SQLException{
    	String startDate = "2013-10-01";
    	String endDate = "2013-10-30";
        new InfoRetriever().getInformationByPubDate(startDate, endDate);
    }
}
