package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import model.BoardDao;
import model.BoardDto;

/**
 * Servlet implementation class view
 */
@WebServlet("/board/view")
public class view extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		String type = request.getParameter("type");
		BoardDao dao = new BoardDao();

		if(type.equals("save")) {
			
			int bno = Integer.parseInt(request.getParameter("bno"));
			session.setAttribute("bno", bno);
			
			dao.getboard(bno);
			response.getWriter().print(bno);
			System.out.println("save타입");
			return;
		} else if(type.equals("load") ) {
			int bno = (Integer)session.getAttribute("bno");
			BoardDto dto = dao.getboard(bno);
			System.out.println(dto);
			JSONObject object = new JSONObject();
			object.put("bno", dto.getBno());
			object.put("btitle", dto.getBtitle());
			object.put("bcontent", dto.getBcontent());
			object.put("bid", dto.getBid());
			object.put("bdate", dto.getBdate());
			object.put("bpoint", dto.getBpoint());
			response.getWriter().print(object);
		}
		
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
