package com.mashen.articleTypeController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mashen.articleTypeService.ArticleTypeService;
import com.mashen.articleTypeService.ArticleTypeServiceImp;
import com.mashen.domian.ArticleType;
@WebServlet("/articleTypeNameUpdate")
public class ArticleTypeUpdateAction extends HttpServlet{
	
	private ArticleTypeService as=new ArticleTypeServiceImp();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String articleTypeName = req.getParameter("articleTypeName");
		ArticleType articleType = as.articleTypeGet(articleTypeName).get(0);
		req.setAttribute("articleType", articleType);
		req.setAttribute("articleTypePage", "/admin/articleTypeUpdate.jsp");
		req.getRequestDispatcher("/admin/maintemp.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		ArticleType articleType=new ArticleType();
		articleType.setArticleTypeName(req.getParameter("articleTypeName"));
		articleType.setArticleTypeId(Integer.parseInt(req.getParameter("articleTypeId")));
		
		int result = as.articleTypeUpDate(articleType);
		if(result!=0){
			req.setAttribute("adminPage", "/admin/articleTypeManager.jsp");
			req.getRequestDispatcher("articleTypeShowAll").forward(req, resp);
		}
	}
	
}
