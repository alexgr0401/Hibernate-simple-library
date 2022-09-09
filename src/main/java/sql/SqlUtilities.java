//package sql;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class SqlUtilities {
//
//	static Connection connection = DatabaseConnection.getInstance().getConnection();
//	static PreparedStatement ps;
//	static ResultSet rs = null;
//
//	public static ResultSet getBookByTitlePart(String titlePart) {
//		String sql = "CALL getBookByTitlePart(?)";
//		try {
//			ps = connection.prepareStatement(sql);
//			ps.setString(1, titlePart);
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//				String title = rs.getString("title");
//				System.out.println("Title: " + title);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return rs;
//	}
//
//}
