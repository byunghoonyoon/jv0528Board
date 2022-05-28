package test;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class ArticleRepository {
	ArrayList<Article> articles = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> signupMembers = new ArrayList<>();
	ArrayList<Member> members = new ArrayList<>();
	Member loginMember = new Member("","","");
//	repository = 저장소 
	int articleId = 4;
	int View = 0;
	public void addtestdata() {
		Article a1 = new Article(1,"제목1","내용1",10,"익명",Util.getCurrentDate());
		Article a2 = new Article(2,"제목2","내용2",30,"익명",Util.getCurrentDate());
		Article a3 = new Article(3,"제목3","내용3",20,"익명",Util.getCurrentDate());
		
		articles.add(a1);
		articles.add(a2);
		articles.add(a3);
		}
	
	
	public ArrayList<Article> getArticleList(){
		return articles;
	}
	
	public void updateArticle(Article article, String title, String body) {
		article.setTitle(title);
		article.setBody(body);
		
	}
	
	public void deleteArticle(Article article) {
		articles.remove(article);
	}
	
	public void addArticle(String title, String body) {
		Article article = new Article(articleId, title, body,View,loginMember.getMemberNickname(),Util.getCurrentDate());
		articles.add(article);
		articleId++;
	}


	public Article getArticleOne(int targetId) {
		for(int i=0;i<articles.size();i++) {
			if(targetId-1==i) {
				return articles.get(i);
			}
		}
		return null;
	}
	public ArrayList<Article> getSearchedArticleList(String keyWord) {
		ArrayList<Article> searchedArticleList = new ArrayList<>();
		
		for(int i=0;i<articles.size();i++) {
			if(articles.get(i).title.contains(keyWord)) {
					searchedArticleList.add(articles.get(i));
				}
			}
			return searchedArticleList;
		}
	
	public void signup() {
		System.out.println("==== 회원가입을 진행합니다. ====");
		System.out.println("아이디를 입력해주세요 : ");
		String memberId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String memberPassword = sc.nextLine();
		System.out.println("닉네임을 입력해주세요 : ");
		String memberNickname = sc.nextLine();
		System.out.println("==== 회원가입이 완료되었습니다. ====");
		
		Member member = new Member(memberId,memberPassword,memberNickname);
		signupMembers.add(member);
	}
	public void login() {
		System.out.println("아이디를 입력해주세요 : ");
		String loginId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String loginPassword = sc.nextLine();
		
		for(int i=0;i<signupMembers.size();i++) {
			if(loginId.equals(signupMembers.get(i).memberId)&&loginPassword.equals(signupMembers.get(i).memberPassword)) {
					loginMember = signupMembers.get(i);
					break;
			}  
		}
		if(!loginMember.getMemberId().equals("")) {
			System.out.printf("%s님 환영합니다!\n",loginMember.memberNickname);
		} else {
			System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
		}
	}


	public void increaseReadCnt(Article article) {
		article.setView(article.getView()+1);
		
	}
}
