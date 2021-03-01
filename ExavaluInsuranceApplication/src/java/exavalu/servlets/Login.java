package exavalu.servlets;

import exavalu.com.beans.User;
import exavalu.com.utilities.ConnectionProviderToDB;
import static java.awt.SystemColor.window;

import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 *
 *
 * @author Avijit Chattopadhyay
 *
 */
public class Login extends HttpServlet {

    /**
     *
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     *
     * methods.
     *
     *
     *
     * @param request servlet request
     *
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     *
     * @throws IOException if an I/O error occurs
     *
     */
    @SuppressWarnings("empty-statement")
    protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            //Get the parameters from request
            String emailAddress = request.getParameter("emailAddress");

            String password = request.getParameter("password");

            //Establish connection to DB
//            InputStream propFile = getServletContext().getResourceAsStream("/WEB-INF/db_params.properties");
//            System.err.println("File Path = "+propFile);
            Connection con = ConnectionProviderToDB.getConnectionObject().getConnection("C:\\Users\\PC\\OneDrive\\Documents\\NetBeansProjects\\ExavaluInsuranceApplication\\config\\db_params.properties");

            System.out.println("Connection established::" + con);

//Write SQL
            String sql = "SELECT * FROM login_credentials where email_address=? and password=?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, emailAddress);

            stmt.setString(2, password);

            System.out.println("Sql to execute=" + stmt);

            // execute SQL
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
         
                //user present
                System.out.println("Login Successful...........");
                HttpSession session = request.getSession();
                User user=new User();
                user.setUserName(rs.getString("user_name"));
                session.setAttribute("user", user);
                RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");

                rd.forward(request, response);

            } else
            {

                //failed validation
                System.out.println("Login Not Successful...........");

                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");

                rd.forward(request, response);

            }

//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Login</title>");           
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Data Received  " + emailAddress+" and "+password + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }
        return null;

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     *
     * Handles the HTTP <code>GET</code> method.
     *
     *
     *
     * @param request servlet request
     *
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     *
     * @throws IOException if an I/O error occurs
     *
     */
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

    /**
     *
     * Handles the HTTP <code>POST</code> method.
     *
     *
     *
     * @param request servlet request
     *
     * @param response servlet response
     *
     * @throws ServletException if a servlet-specific error occurs
     *
     * @throws IOException if an I/O error occurs
     *
     */
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

    /**
     *
     * Returns a short description of the servlet.
     *
     *
     *
     * @return a String containing servlet description
     *
     */
    @Override

    public String getServletInfo() {

        return "Short description";

    }// </editor-fold>

}
