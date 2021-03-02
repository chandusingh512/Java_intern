<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<header id="header">


    <a href="https://www.exavalu.com//" rel="home" title="Insurance" title="Back to Insurance Homepage"><img alt="Exavalu" src="images/logo.png"><strong><span> is Best</span></strong></a>

    <div class="table-responsive" id="sailorTableArea" >
        <table id="sailorTable" class="table table-striped table-bordered" width="100%">


            <%@page import="java.sql.ResultSet"%>
            <%@page import="java.sql.Statement"%>
            <%@page import="exavalu.com.utilities.ConnectionProviderToDB"%>
            <%@page import="java.sql.Connection"%>
            <!DOCTYPE html>
            <!--
            To change this license header, choose License Headers in Project Properties.
            To change this template file, choose Tools | Templates
            and open the template in the editor.
            -->
            <html>
                <head>
                    <title>TODO supply a title</title>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                </head>
                <body>
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Policy_id</th>
                                <th scope="col">Policy_Name</th>
                                <th scope="col">Expiry_Date</th>
                                <th scope="col">Launch_Date</th>
                                <th scope="col">Premium_Amount</th>
                                <th scope="col">Coverage</th>
                                <th scope="col">Min_Age_Offering</th>
                                <th scope="col">Max_Age_Offering</th>
                            </tr>
                        </thead>


                        <%
                            Connection con = ConnectionProviderToDB.getConnection("C:\\Users\\PC\\OneDrive\\Documents\\NetBeansProjects\\ExavaluInsuranceApplication\\config\\db_params.properties");

                            Statement stmt = con.createStatement();
                            ResultSet rs = stmt.executeQuery("select * from policy");
                            while (rs.next()) {

                        %>
                        <tr>
                            <td><%=rs.getString("policyid")%></td>
                            <td><%=rs.getString("poicyname")%></td>
                            <td><%=rs.getString("expirydate")%></td>
                            <td><%=rs.getString("launchdate")%></td>
                            <td><%=rs.getInt("policypremium")%></td>
                            <td><%=rs.getInt("coverage")%></td>
                            <td><%=rs.getInt("minageoffer")%></td>
                            <td><%=rs.getInt("maxageoffer")%></td>
                        </tr>
                        <%}
                            //System.out.println("</table>");  
                            //System.out.println("</html></body>");  
                            con.close();
                        %>


                    </table>
                </body>
            </html>