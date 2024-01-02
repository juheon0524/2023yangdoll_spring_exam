package kr.co.juheon.repogitory;

import java.util.List;

import kr.co.juheon.vo.MemberVO;

public interface MemberDAO {

	MemberVO getMember(String memId);

	int updateMember(MemberVO vo);

	List<MemberVO> getAllMember();

	List<MemberVO> getMemberForEach(List<String> list);

}
