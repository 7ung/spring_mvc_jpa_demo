<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>"rel="stylesheet"  type="text/css" />
        <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>"rel="stylesheet"  type="text/css" />
        <script type="text/javascript" src="<c:url value="/resources/jQuery/jquery-3.0.0.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>

    </head>
    <body>
        <div class="container">
            <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
            <p><i>To display a different welcome page for this project, modify</i>
                <tt>index.jsp</tt> <i>, or create your own welcome page then change
                    the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                    welcome page and also update the welcome-file setting in</i>
                <tt>web.xml</tt>.</p>
            <h1>Tiêu đề 1</h1>

            <div class="row">
                <div class="col-xs-13 col-md-4 col-sm-12 col-lg-4">
                    <img src="https://scontent.fsgn5-1.fna.fbcdn.net/v/t1.0-9/10384377_1504990886395410_861266707969483767_n.jpg?oh=fdca62d6df8e615173141a26087f112b&oe=59451A33"
                    class="img-responsive" alt="Product 1"  title="Product 1">
                </div>
                <div class="col-xs-12 col-md-4 col-sm-12 col-lg-4">
                    <img src="https://scontent.fsgn5-1.fna.fbcdn.net/v/t1.0-9/10178143_1504991429728689_3338683013884394431_n.jpg?oh=9e4fedde01abfa21aabdb44b1c1a6983&oe=58FE53C5" 
                    class="img-responsive" alt="Product 2" title="Product 2">
                </div>
                <div class="col-xs-12 col-md-4 col-sm-12 col-lg-4">
                    <img src="https://scontent.fsgn5-1.fna.fbcdn.net/v/t1.0-9/10341435_1504991593062006_4906278650664928_n.jpg?oh=56462defbd83dd50cd597b8e00f5528c&oe=593FB394"
                    class="img-responsive" alt="Product 3" title="Product 3">
                </div>
            </div>
            
            <form class="form-horizontal">
                <div class="form-group">
                    <label for="yourName" class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="yourName" placeholder="Your name please"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="yourEmail" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="text" class="form-control" id="yourEmail" placeholder="Your email"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="yourComments" class="col-sm-3 control-label">Tell us</label>
                    <div class="col-sm-9">
                        <textarea class="form-control" id="yourComments" placeholder="Your commments" rows="3"></textarea>
                    </div>
                </div>
                <div class="col-sm-9 col-sm-offset-3">
                    <div class="checkbox">
                        <label><input type="checkbox">Subcribe Me!!!</label>
                    </div>
                </div>
                <div class="col-sm-12 text-center">
                    <button type="submit" class="btn btn-primary">Post it</button>
                </div>
            </form>
        </div>
    </body>
</html>
