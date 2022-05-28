package test;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardPractice {
	int num = 0;
	ArrayList<Article> articles = new ArrayList<>();
	ArrayList<Member> members = new ArrayList<>();
	ArticleView articleView = new ArticleView();
	ArticleRepository repo = new ArticleRepository();
	ArrayList<Member> signupMembers = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	String title = "";
	String body = "";
	
	public void run(){
		repo.addtestdata();
			while(true){
			if(!repo.loginMember.getMemberId().equals("")) {
				System.out.printf("명령어를 입력해주세요(%s[%s]) : \n",repo.loginMember.getMemberId(),repo.loginMember.getMemberNickname());
			}else {System.out.println("명령어를 입력해주세요 : ");
			}
			System.out.println(">>");
			String cmd = sc.nextLine();
			if(cmd.equals("help")) {
				articleView.help();
			}else if(cmd.equals("add")) {
				addArticles();
			}else if(cmd.equals("list")) {
				articleView.printArticles(repo.getArticleList());
			}else if(cmd.equals("update")) {
				update();
			}else if(cmd.equals("search")) {
				searchArticles();
			}else if(cmd.equals("read")) {
				read();
			}else if(cmd.equals("signup")) {
				repo.signup();
			}else if(cmd.equals("login")) {
				repo.login();
			}else if(cmd.equals("delete")) {
				deleteArticle();
			}else if(cmd.equals("exit")){
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못된 명령어입니다.");
			}
		}
		
	}
	
	public void searchArticles() {
		System.out.println("검색 키워드를 입력해주세요 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Article> searchedList = (ArrayList<Article>) repo.getSearchedArticleList(keyword);
		articleView.printArticles(searchedList);
	}
	public void addArticles() {
		System.out.print("제목을 입력해주세요 : ");
		String title = sc.nextLine();
		System.out.print("내용을 입력해주세요 : ");
		String body = sc.nextLine();
		
		if(!repo.loginMember.getMemberId().equals("")) {
			System.out.printf("작성자 : %s",repo.loginMember.getMemberNickname());
		} else {
			System.out.printf("작성자 : 익명 \n");
		}
		System.out.printf("등록날짜 : %s\n",Util.getCurrentDate());
		System.out.println("게시물이 저장되었습니다.");
		repo.addArticle(title, body);
		}	
	public void update() {
		System.out.println("수정할 게시물 번호 : ");
		int targetId = Integer.parseInt(sc.nextLine());
		Article article = repo.getArticleOne(targetId);
		if(article == null) {
			System.out.println("없는 게시물 번호입니다.");
		} else {
			System.out.println("새제목 : ");
			String title = sc.nextLine();
			System.out.println("새내용 : ");
			String body = sc.nextLine();
			repo.updateArticle(article, title, body);
			System.out.println("수정이 완료되었습니다.");
		} 
		articleView.printArticles(articles);
	}

	public void read() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상세보기할 게시물 번호를 입력해주세요 : ");
		int targetId = Integer.parseInt(sc.nextLine());
		
		Article article = repo.getArticleOne(targetId);
		if(article == null) {
			System.out.println("없는 게시물입니다.");
		} else {
			repo.increaseReadCnt(article);
			articleView.printArticlesDetail(article);
		}

	}
	public void deleteArticle() {		
		System.out.print("삭제 할 게시물 번호 : ");
		int targetId = Integer.parseInt(sc.nextLine());
		
		Article article = repo.getArticleOne(targetId); 		
		repo.deleteArticle(article);		
		
		System.out.println("삭제가 완료되었습니다.");
	}
}

