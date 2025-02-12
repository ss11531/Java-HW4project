/*package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		

	}
	private static MemberDaoImpl memberdaoimpl=new MemberDaoImpl();


	@Override
	public void addMember(Member member) {
		memberdaoimpl.add(member);
		
	}

	@Override
	public Member Login(String username, String password) {
		Member member=null;
		List<Member> l=memberdaoimpl.selectUsernameAndPassword(username, password);
		if(l.size()!=0)
		{
			member=l.get(0);
		}		
		
		return member;
	}

	@Override
	public boolean isUsernameBeenUse(String username) {

		return !memberdaoimpl.selectByUsername(username).isEmpty();

		
	}

}*/

package service.impl;

import java.util.List;
import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService {

    private MemberDaoImpl memberdaoimpl;

    public MemberServiceImpl() {
        this.memberdaoimpl = new MemberDaoImpl();
    }

    @Override
    public void addMember(Member member) {
        if (member != null) {
            memberdaoimpl.add(member);
        } else {
            System.out.println("無效的會員資料");
        }
    }

    @Override
    public Member Login(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            System.out.println("帳號或密碼不能為空");
            return null;
        }
        List<Member> l = memberdaoimpl.selectUsernameAndPassword(username, password);
        if (l != null && !l.isEmpty()) {
            return l.get(0);
        }
        return null;
    }

    @Override
    public boolean isUsernameBeenUse(String username) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        List<Member> members = memberdaoimpl.selectByUsername(username);
        return members != null && !members.isEmpty();
    }

    public static void main(String[] args) {
        MemberServiceImpl service = new MemberServiceImpl();
        Member testMember = service.Login("testUser", "1234");
        System.out.println(testMember != null ? "登入成功" : "登入失敗");
    }
}

