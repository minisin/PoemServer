package cesar.poem.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cesar.poem.DAO.AuthorDAO;
import cesar.poem.DAO.PoemDAO;
import cesar.poem.DAO.PoemTagDetailDAO;
import cesar.poem.DAO.UserDAO;
import cesar.poem.bean.Author;

public class BSSingleton {
	
	/*
    _ooOoo_
   o8888888o
   88" . "88
   (| -_- |)
   O\  =  /O
____/`---'\____
.'  \\|     |//  `.
/  \\|||  :  |||//  \
/  _||||| -:- |||||-  \
|   | \\\  -  /// |   |
| \_|  ''\---/''  |   |
\  .-\__  `-`  ___/-. /
___`. .'  /--.--\  `. . __
."" '<  `.___\_<|>_/___.'  >'"".
| | :  `- \`.;`\ _ /`;.`/ - ` : | |
\  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
    `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
佛祖保佑       永无BUG
*/
	
	private static AuthorDAO authorDAO = null;
	private static PoemDAO poemDAO = null;
	private static UserDAO userDAO = null;
	private static PoemTagDetailDAO poemTagDetailDAO;
	private static ApplicationContext context = null;
	public static ApplicationContext getApplicationContext() {
		if (context==null) {
			context = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		return context;
	}
	public static AuthorDAO getAuthorDAO() {
		if(authorDAO==null){
			authorDAO = (AuthorDAO) getApplicationContext().getBean("AuthorDAO");
		}
		return authorDAO;
	}
	public static PoemDAO getPoemDAO() {
		if(poemDAO==null){
			poemDAO = (PoemDAO) getApplicationContext().getBean("PoemDAO");
		}
		return poemDAO;
	}
	public static UserDAO getUserDAO() {
		if(userDAO==null){
			userDAO = (UserDAO) getApplicationContext().getBean("UserDAO");
		}
		return userDAO;
	}
	public static PoemTagDetailDAO getPoemTagDetailDAO() {
		if(poemTagDetailDAO==null){
			poemTagDetailDAO = (PoemTagDetailDAO) getApplicationContext().getBean("PoemTagDetailDAO");
		}
		return poemTagDetailDAO;
	}
}
