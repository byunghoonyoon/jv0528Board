package test;
import java.util.ArrayList;


	public class ArticleView {	
	
		
		public void printArticles(ArrayList<Article> articles) {
			for(int i=0; i<articles.size();i++) {
				Article article = articles.get(i);
				
				System.out.printf("번호 : %d\n",article.getarticleId());
				System.out.printf("제목 : %s\n",article.getTitle());
				System.out.printf("등록날짜 : %s\n",Util.getCurrentDate());
				System.out.printf("작성자 : %s\n",article.getNickname());
				System.out.printf("조회수 : %d\n",article.getView());
				System.out.println("==================");
			}
		}
		
		public void help() {
			System.out.println("add    : 게시물 등록");
			System.out.println("list   : 게시물 조회");
			System.out.println("read   : 게시물 상세보기");
			System.out.println("update : 게시물 수정");
			System.out.println("delete : 게시물 삭제");
			System.out.println("login  : 로그인");
			System.out.println("signup : 회원가입");
			System.out.println("exit   : 시스템 종료");
		}
		
		public void printArticlesDetail(Article article) {
				System.out.printf("번호 : %d\n",article.getarticleId());
				System.out.printf("제목 : %s\n",article.getTitle());
				if(!article.getNickname().equals("")) {
				System.out.printf("작성자 : %s",article.getNickname());
			} else {
				System.out.printf("작성자 : 익명 \n");
			}	System.out.printf("내용 : %s\n",article.getBody());
				System.out.printf("등록날짜 : %s\n",Util.getCurrentDate());
				System.out.printf("조회수 : %d\n",article.getView());
				System.out.println("==================");
				
			}
		
	}
	


