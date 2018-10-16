<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="UTF-8" name="view" content="width=device-width,initial-scale=1.0">
        <title>Title</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Page Title</h1>
            <div id="header" class="row-fluid">
                <nav class="navbar navbar-inverse">
                    <div class="navbar-collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="#">Home</a></li>
                            <li><a href="#">Page One</a></li>
                            <li><a href="#">Page Two</a></li>
                            <li class="nav-item dropdown">
                                <a class="dropdown-toggle" href="#" data-toggle="dropdown">
                                    Page Three
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Page3 1</a></li>
                                    <li><a href="#">Page3 2</a></li>
                                    <li><a href="#">Page3 3</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Page3 4</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Page3 5</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
            <div id="chest" class="row-fluid">
                <div class="col-md-10"></div>
                <div class="col-md-2" style="align-content: right">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3000">
                        <ol class="carousel-indicators">
                            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                            <li data-target="#myCarousel" data-slide-to="1"></li>
                            <li data-target="#myCarousel" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner" role="listbox">
                            <div class="item active">
                                <img class="img-responsive center-block" src="${pageContext.request.contextPath}/img/image-1.jpg" alt="First slide">
                                <div class="carousel-caption">标题 1</div>
                            </div>
                            <div class="item">
                                <img class="img-responsive center-block" src="${pageContext.request.contextPath}/img/image-2.jpg" alt="Second slide">
                                <div class="carousel-caption">标题 2</div>
                            </div>
                            <div class="item">
                                <img class="img-responsive center-block" src="${pageContext.request.contextPath}/img/image-3.jpg" alt="Third slide">
                                <div class="carousel-caption">标题 3</div>
                            </div>
                        </div>
                        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
            <div id="content" class="row-fluid" style="background-color: white">
                <div class="col-md-2">
                    <h2>Sidebar</h2>
                    <ul class="nav nav-list">
                        <li><a href="page1.jsp" target="iframe_1">Link1</a></li>
                        <li><a href="page2.jsp" target="iframe_1">Link2</a></li>
                        <li><a href="page3.jsp" target="iframe_1">Link3</a></li>
                        <li><a href="" target="iframe_1">Link4</a></li>
                    </ul>
                    <div class="sidebar-toggle sidebar-collapse">

                    </div>
                </div>
                <div class="col-md-10">
                    <h2>Content</h2>
                    <iframe name="iframe_1" frameborder="0" height="150%" width="100%"></iframe>
                </div>
            </div>
        </div>
    </body>
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js" language="JavaScript" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>

</html>
