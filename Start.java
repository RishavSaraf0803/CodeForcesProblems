package in.addverb.tempolinebatch;


import static java.lang.Class.forName;
//import java.nio.file.Path;
//import static java.nio.file.Paths.get;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import static org.apache.log4j.Logger.getLogger;
import static org.apache.log4j.PropertyConfigurator.configure;


public class Start {
	
	 
	    protected static final Logger logger = getLogger(Start.class);
	    public static void main(String[] args) throws Exception {
	    
	   	BasicConfigurator.configure();
	     // String logFileName = "log4j.properties";
	      String path="E://tempolinebatch/log4j.properties";
	      
	      // path = get("E:tempolinebatch");
	     // logger.debug("Logger file path : " + path.toAbsolutePath()+logFileName);
	   //  configure(path.toAbsolutePath()+logFileName);
	      logger.debug("Logger file path: "+path);
	      configure(path);
	      new Start().proceed();
	    }
	    
	    public void proceed() {
	        logger.debug("--------DBProcessor : getMySQLDBConnection *--------");
	        Connection lcon = null;
	        Connection rcon = null;
	        try {
	            forName("com.mysql.cj.jdbc.Driver");
	            lcon = getConnection("jdbc:mysql://localhost:3306/tempoline?useSSL=false",
	                    "root", "12345");
	            String sql = "select * from tempolinebatch where id=1";
	            logger.info("SQL :: " + sql);
	            try (Statement stmt = lcon.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
	                if (rs.next()) {
	                	String n1 = rs.getString("node1");
	                    String n1in = rs.getString("node1_intime");
	                    if (n1in != null) {
	                        n1in = "'" + n1in + "'";
	                    }
	                    String n1out = rs.getString("node1_outtime");
	                    if (n1out != null) {
	                        n1out = "'" + n1out + "'";
	                }
	                    String n2 = rs.getString("node2");
	                    String n2in = rs.getString("node2_intime");
	                    if (n2in != null) {
	                        n2in = "'" + n2in + "'";
	                    }
	                    String n2out = rs.getString("node2_outtime");
	                    if (n2out != null) {
	                        n2out = "'" + n2out + "'"  ;

	                }
	                    String n3 = rs.getString("node3");
	                    String n3in = rs.getString("node3_intime");
	                    if (n3in != null) {
	                        n3in = "'" + n3in + "'";
	                    }
	                    String n3out = rs.getString("node3_outtime");
	                    if (n3out != null) {
	                        n3out = "'" + n3out + "'";
	                }
	                    String n4 = rs.getString("node4");
	                    String n4in = rs.getString("node4_intime");
	                    if (n4in != null) {
	                        n4in = "'" + n4in + "'";
	                    }
	                    String n4out = rs.getString("node4_outtime");
	                    if (n4out != null) {
	                        n4out = "'" + n4out + "'";
	                }
	                    String n5 = rs.getString("node5");
	                    String n5in = rs.getString("node5_intime");
	                    if (n5in != null) {
	                        n5in = "'" + n5in + "'";
	                    }
	                    String n5out = rs.getString("node5_outtime");
	                    if (n5out != null) {
	                        n5out = "'" + n5out + "'";
	                }
	                    String n6 = rs.getString("node6");
	                    String n6in = rs.getString("node6_intime");
	                    if (n6in != null) {
	                        n6in = "'" + n6in + "'";
	                    }
	                    String n6out = rs.getString("node6_outtime");
	                    if (n6out != null) {
	                        n6out = "'" + n6out + "'";
	                }
	                    String n7 = rs.getString("node7");
	                    String n7in = rs.getString("node7_intime");
	                    if (n7in != null) {
	                        n7in = "'" + n7in + "'";
	                    }
	                    String n7out = rs.getString("node7_outtime");
	                    if (n1out != null) {
	                        n7out = "'" + n7out + "'";
	                }
	                    String n8 = rs.getString("node8");
	                    String n8in = rs.getString("node8_intime");
	                    if (n8in != null) {
	                        n8in = "'" + n8in + "'";
	                    }
	                    String n8out = rs.getString("node8_outtime");
	                    if (n8out != null) {
	                        n8out = "'" + n8out + "'";
	                }
	                    String n9 = rs.getString("node9");
	                    String n9in = rs.getString("node9_intime");
	                    if (n9in != null) {
	                        n9in = "'" + n9in + "'";
	                    }
	                    String n9out = rs.getString("node9_outtime");
	                    if (n9out != null) {
	                        n9out = "'" + n9out + "'";
	                }
	                    String n10 = rs.getString("node10");
	                    String n10in = rs.getString("node10_intime");
	                    if (n10in != null) {
	                        n10in = "'" + n10in + "'";
	                    }
	                    String n10out = rs.getString("node10_outtime");
	                    if (n10out != null) {
	                        n10out = "'" + n10out + "'";
	                }
	                    
	                   
	                    try {
	                        forName("com.mysql.cj.jdbc.Driver");
	                        rcon = getConnection("jdbc:mysql://localhost:3306/tempoline?useSSL=false",
	                                "root", "12345");
	                	String rsql="UPDATE tempolinebatch set  node1=" +"\""+ n1+ "\""+ ",node1_intime=" + n1in + ",node1_outtime=" + n1out + ""
	                			+ ",node2=" + "\""+ n2+ "\"" + ",node2_intime=" + n2in +",node2_outtime=" + n2out+""
	                			+ ",node3=" + "\""+ n3+ "\"" + ",node3_intime=" + n3in +",node3_outtime=" + n3out+""
	                			+ ",node4=" + "\""+n4+"\"" + ",node4_intime=" + n4in +",node4_outtime=" + n4out+""
	                			+ ",node5=" + "\""+n5+"\"" + ",node5_intime=" + n5in +",node5_outtime=" + n5out+""
	                			+ ",node6=" + "\""+n6+"\"" + ",node6_intime=" + n6in +",node6_outtime=" + n6out+""
	                			+ ",node7=" + "\""+n7+"\"" + ",node7_intime=" + n7in +",node7_outtime=" + n7out+""
	                		    + ",node8=" + "\""+n8+"\"" + ",node8_intime=" + n8in +",node8_outtime=" + n8out+""
	                			+ ",node9=" + "\""+n9+"\"" + ",node8_intime=" + n9in +",node9_outtime=" + n9out+""
	                			+ ",node10=" + "\""+n10+"\"" + ",node10_intime=" + n10in +",node10_outtime=" + n10out+" WHERE id=2";
	                	
	                	logger.debug("SQL :: " + rsql);
                        try (Statement rstmt = rcon.createStatement();) {
                            int rrs = rstmt.executeUpdate(rsql);
                            if (rrs > 0) {
                                logger.debug("Updated successfully");
                            } else {
                                logger.debug("Not Updated");
                            }
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        logger.fatal("ClassNotFoundException | SQLException occured:" + ex);
                    }
                } else {
                    logger.debug("--------Node not initilized--------");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            logger.fatal("ClassNotFoundException | SQLException occured:" + ex);
        } finally {
            try {
                if (!rcon.isClosed()) {
                    rcon.close();
                }
            } catch (SQLException ex) {
                logger.error("Finally SQLException :: " + ex);
}
        
        }
	    
	    }
	    
}