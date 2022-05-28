package test;

public class Article {
		int articleId;
		String title;
		String body;
		int view;
		String nickname;
		String regDate;
		public Article(int articleId,String title,String body,int view,String nickname,String regDate) {
			this.articleId = articleId;
			this.title = title;
			this.body = body;
			this.view = view;
			this.nickname = nickname;
			this.regDate = regDate;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public int getarticleId() {
			return articleId;
		}
		public void setId(int id) {
			this.articleId = articleId;
		}
		public String getRegDate() {
			return regDate;
		}
		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public int getView() {
			return view;
		}
		public void setView(int view) {
			this.view = view;
		}
}
