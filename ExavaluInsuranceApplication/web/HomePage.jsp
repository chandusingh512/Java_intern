
<%@page import="exavalu.com.beans.User"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Selecao Bootstrap Template Demo</title>
        <meta name="robots" content="noindex, nofollow">
        <link rel="stylesheet" href="css/homepage_css.css">
        <body onLoad="noBack();" onpageshow="if (event.persisted) noBack();" onUnload="">
    </head>

    <body>
        <script type="text/javascript">
    window.history.forward();
    function noBack()
    {
        window.history.forward();
    }
</script>
        <%
            User user = (User)request.getSession().getAttribute("user");
        %>      
        <header id="header">


            <a href="https://www.exavalu.com//" rel="home" title="Insurance" title="Back to Insurance Homepage"><img alt="Exavalu" src="images/logo.png"><strong><span> is Best</span></strong></a>


            <div class="navigate">
                <ul>
                    <li><a href="#" >Welcome: <%=user.getUserName()%> </a></li>

                    <li><a href="policylist.jsp" target="_top" title="Policies"> <img alt="Policies" src="images/policy.jpg" height="50" width="50" ></a></li>
                    <li><a href="#" target="_top" title="Customers"> <img alt="Policies" src="images/cust.png" height="50" width="50" ></a></li>

                    <li><a href="Logout" target="_top" title="logout"> <img alt="Logout" src="images/download.png" height="50" width="50" ></a></li>
                </ul>
            </div>

        </header>
    </body>

</html>
