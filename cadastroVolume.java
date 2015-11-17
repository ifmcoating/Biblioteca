package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Volume;

import java.util.ArrayList;
import java.util.List;


/**
 * Servlet implementation class cadastroVolume
 */
@WebServlet("/cadastroVolume")
public class cadastroVolume extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		// Recuperar lista de usu�rios da sess�o. Caso n�o exista ainda 
		// ser� recuperado null.
		List<Volume> volumes = (List<Volume>) session.getAttribute("volumes");
		
		// Criar a lista de usu�rios caso n�o exista.
		if (volumes == null) {			
			volumes = new ArrayList<Volume>();		
		} 
		
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor"); 
		String  TipoVolume = request.getParameter("TipoVolume");
		String nPaginas = request.getParameter("nPaginas");
		String anoProducao = request.getParameter("anoProducao");
		String editora = request.getParameter("editora");
		
		
		
		// Entidade usu�rio.
		Volume Volume = new Volume();
		Volume.setTitulo(titulo);
		Volume.setAutor(autor);
		Volume.setTipoVolume(TipoVolume);
		Volume.setNumeroPaginas(nPaginas);
		Volume.setAnoPublicacao(anoProducao);
		Volume.setEditora(editora);
		
		// Adicionando usu�rio a lista de usu�rios.
		volumes.add(Volume);
		
		// Atualizando a sess�o.
		session.setAttribute("volumes", volumes);
		
		response.sendRedirect("consulta.html");
	}

}
