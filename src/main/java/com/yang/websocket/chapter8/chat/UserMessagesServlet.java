
package com.yang.websocket.chapter8.chat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UserMessagesServlet", urlPatterns = {"/UserMessagesServlet"})
public class UserMessagesServlet extends HttpServlet {
    @EJB
    private TranscriptBean transcriptBean;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<table border=\"0\" cellpadding=\"2\" cellspacing=\"2\" width=\"500\">");
            for (String username : this.transcriptBean.getActiveUsernames()) {
                out.println("<tr>");

                out.println("<td bgcolor=\"#99ff99\" align =\"center\"valign=\"center\">");
                out.println(username);
                out.println("</td>");
                out.println("<td bgcolor=\"#ffffcc\" align =\"center\"valign=\"center\">");
                for (String nextLine : this.transcriptBean.getTranscriptFor(username)) {
                    out.println(nextLine + "<br>");
                }
                out.println("</td>");
                
                out.println("</tr>");
            }
            out.println("</table>");
        } finally {            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
