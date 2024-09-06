/*
 * package org.ljw.myapp.model;
 * 
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement;
 * import java.sql.Timestamp; import java.time.LocalDateTime; import
 * java.util.ArrayList; import java.util.List;
 * 
 * import org.comstudy.myweb.dbcp.JdbcUtil;
 * 
 * public class MemoDAORef {
 * 
 * static final String SELECT_ALL = "SELECT * FROM MEMO"; static final String
 * SELECT_ONE = "SELECT * FROM MEMO WHERE ID=?"; // static final String INSERT =
 * "INSERT INTO MEMO (?, ?, ?, ?, ?)"; static final String INSERT =
 * "INSERT INTO MEMO(TITLE, CONTENT) VALUES (?, ?)"; static final String UPDATE
 * = "UPDATE MEMO SET TITLE=?, CONTENT=?, UPDATED_TIME=? WHERE ID=?"; static
 * final String DELETE = "DELETE FROM MEMO WHERE ID=?";
 * 
 * 
 * //공통으로 쓰는 참조변수는 필드로 선언 Connection conn; Statement stmt; PreparedStatement
 * pstmt; ResultSet rs;
 * 
 * // SELECT_ALL public List<Memo> getAllMemos() {
 * 
 * System.out.println(">>>> getAllMemos() ..."); List<Memo> memoList = new
 * ArrayList<Memo>(); try { conn = JdbcUtil.getConnection(); stmt =
 * conn.createStatement(); rs = stmt.executeQuery(SELECT_ALL); while(rs.next())
 * { int id = rs.getInt(1); String title = rs.getNString(2); String content =
 * rs.getNString(3); memoList.add(new Memo(id, title, content)); }
 * 
 * } catch (SQLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } finally { JdbcUtil.close(conn, pstmt, rs); } return
 * memoList; }
 * 
 * // SELECT_ONE public Memo getMemoById(int id) {
 * System.out.println(">>>> getMemoById() ..."); Memo memo = null; try {
 * 
 * conn = JdbcUtil.getConnection(); pstmt = conn.prepareStatement(SELECT_ONE);
 * pstmt.setInt(1, id); rs = stmt.getResultSet(); while(rs.next()) { memo = new
 * Memo(); memo.setId(rs.getInt(1)); memo.setTitle(rs.getNString(2));
 * memo.setContent(rs.getNString(3));
 * memo.setCreatedTime(rs.getTimestamp(5).toLocalDateTime());
 * memo.setUpdatedTime(rs.getTimestamp(5).toLocalDateTime()); }
 * 
 * } catch (SQLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } return memo; }
 * 
 * // INSERT ONE public void addMemo(Memo memo) {
 * System.out.println(">>>> addMemo() ..."); try {
 * 
 * conn = JdbcUtil.getConnection(); pstmt = conn.prepareStatement(INSERT);
 * pstmt.setString(1, memo.getTitle()); pstmt.setString(2, memo.getContent());
 * 
 * pstmt.execute(); } catch (SQLException e) { // TODO Auto-generated catch
 * block e.printStackTrace(); } return ; }
 * 
 * // UPDATE public void updateMemo(Memo updatedMemo) {
 * System.out.println(">>>> updateMemo() ..."); try {
 * 
 * conn = JdbcUtil.getConnection(); pstmt = conn.prepareStatement(UPDATE);
 * pstmt.setString(1, updatedMemo.getTitle()); pstmt.setString(2,
 * updatedMemo.getContent()); pstmt.setTimestamp(3, Timestamp.valueOf(
 * updatedMemo.getUpdatedTime())); pstmt.setInt(4, updatedMemo.getId());
 * 
 * pstmt.execute(); } catch (SQLException e) { // TODO Auto-generated catch
 * block e.printStackTrace(); } }
 * 
 * // DELETE public void deleteMemo(int id) {
 * System.out.println(">>>> deleteMemo() ..."); try {
 * 
 * conn = JdbcUtil.getConnection(); pstmt = conn.prepareStatement(DELETE);
 * pstmt.setInt(1, id);
 * 
 * pstmt.execute(); } catch (SQLException e) { // TODO Auto-generated catch
 * block e.printStackTrace(); }
 * 
 * }
 * 
 * 
 * // public static void main(String[] args) {
 * 
 * //static으로 선언한 멤버는 클래스 차원의 멤버 //static으로 없이 선언한 멤버는 인스턴스(객체) 멤버 //static 멤버
 * 한해서는 this 사용 불가능.. // testGetAllMemos(); // testGetMemoById(); //
 * testAddMemo(); // testUpdateMemo(); // testDeleteMEmo(); // }
 * 
 * public static void testGetAllMemos() {
 * 
 * MemoDAORef dao = new MemoDAORef(); List<Memo> list = dao.getAllMemos();
 * System.out.println(list); }
 * 
 * 
 * public static void testGetMemoById() { MemoDAORef dao = new MemoDAORef();
 * System.out.println(dao.getMemoById(1)); }
 * 
 * public static void testAddMemo() { MemoDAORef dao = new MemoDAORef();
 * dao.addMemo(new Memo("테스트입니다", "테스트 too"));
 * System.out.println(dao.getAllMemos()); }
 * 
 * public static void testUpdateMemo() {
 * 
 * MemoDAORef dao = new MemoDAORef(); Memo myMemo = new Memo(1, "테스트 - updated",
 * "테스트 updated"); myMemo.setUpdatedTime(LocalDateTime.now());
 * dao.updateMemo(myMemo); System.out.println(dao.getAllMemos()); }
 * 
 * public static void testDeleteMEmo() { MemoDAORef dao = new MemoDAORef();
 * dao.deleteMemo(1); System.out.println(dao.getAllMemos()); }
 * 
 * 
 * }
 */