<%@page import="exavalu.com.beans.User"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Selecao Bootstrap Template Demo</title>
  <meta name="robots" content="noindex, nofollow">
  <link rel="stylesheet" href="css/homepage_css.css">
  <link rel="stylesheet" href="css/topnav.css">
  <link rel="stylesheet" href="css/carousel.css">

  </head>

<body>
  <header id="header">
      <% User user=(User)request.getSession().getAttribute("user"); %>
    
        <a href="https://www.exavalu.com//" rel="home" title="Insurance" title="Back to Insurance Homepage"><img alt="Exavalu" src="images/logo.png"><strong>INSURANCE COMPANY</strong></a>
    
        
        

    <div class="navigate">
      <ul>
          </ul>
    </div>
        <div class="topnav">
            <a class="active" href="#">Welcome : <c:out value="${user.getUserName()}"/></a>
            <a href="HomePage.jsp">Home</a>
            <a href="Customer">Customers</a>
            <a href="policylist.jsp">Policy</a>
            <a href="Logout">Logout</a>
            <a href="Back">Back</a>
        </div>
            
          
  </header>
  
</body>

</html>
