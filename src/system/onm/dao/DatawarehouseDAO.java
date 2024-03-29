/**
 * 아래에 나오는 클래스의 소속 패키지 경로를 설정하기
 * 모든 자바 클래스 최상단에는 소속 패키지 경로가 먼저 나옴
 */
package system.onm.dao;

/**
 * DatawarehouseDAO 인터페이스
 * DAO 클래스를 사용하기 위해 정의한 인터페이스
 * @author Jo
 */
public interface DatawarehouseDAO {
	/**
	 * 속성변수 선언
	 */
	String sqlSessionPathAll = "system.onm.dto.All.";
	String sqlSessionPath = "system.onm.dto.DatawarehouseDAO.";

	/**
	 * 메소드 선언
	 */
}