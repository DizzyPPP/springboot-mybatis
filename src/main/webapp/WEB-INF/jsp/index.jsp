<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <form:form modelAttribute="articleList" name="articleList" >
            <table border="1">
                <tr>
                    <td>文章ID</td>
                    <td>文章标题</td>
                    <td>文章内容</td>
                    <td>创建时间</td>
                    <td>修改时间</td>
                </tr>
                <c:forEach var="articleList" items="${articleList}">
                <tr>
                        <td><c:out value="${articleList.id}"/></td>
                        <td><c:out value="${articleList.title}"/></td>
                        <td><c:out value="${articleList.content}" /></td>
                        <td><c:out value="${articleList.create_time}" /></td>
                        <td><c:out value="${articleList.edit_time}"/></td>
                </tr>
                </c:forEach>
            </table>
        </form:form>
    </body>
</html>
