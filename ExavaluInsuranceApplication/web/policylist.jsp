<%@page import="exavalu.servlets.policy"%>
<%@page import="exavalu.com.beans.Policy"%>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="well">
    <table class="table">
      <thead>
        <tr>
          <th>Policy_id</th>
          <th>Policy_name</th>
          <th>expiry_date</th>
          <th>Launch_date</th>
          <th>Policy_Premium</th>
          <th>Policy_Coverage</th>
          <th>min_age_offering</th>
          <th>Max_age_offering</th>
          
          <th style="width: 36px;"></th>
        </tr>
      </thead>
      
      <tbody>
            
       
       
      </tbody>
    </table>
</div>


page import="java.sql.ResultSet"%>
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
    Connection con = ConnectionProviderToDB.getConnection("G:\\exavaluJava\\ExavaluInsuranceApp\\config\\db_params.properties");

       
         Statement stmt = con.createStatement();  
             ResultSet rs = stmt.executeQuery("select * from policydetails");  
             while (rs.next()) 
             {  
                 
                 %>
                 <tr>
<td><%=rs.getString("idPolicyDetails") %></td>
<td><%=rs.getString("Policyname") %></td>
<td><%=rs.getString("Expdate") %></td>
<td><%=rs.getString("Launchdate") %></td>
<td><%=rs.getInt("premiumAmt") %></td>
<td><%=rs.getInt("coverage") %></td>
<td><%=rs.getInt("minAgeOffering") %></td>
<td><%=rs.getInt("maxAgeOffering") %></td>
</tr>
                 <%}
             //System.out.println("</table>");  
             //System.out.println("</html></body>");  
             con.close();
%>

  
</table>
    </body>
</html>