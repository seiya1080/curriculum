<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*,java.text.SimpleDateFormat"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@include file="../header.css" %>
<body>
<header></header>
<div>
   <% Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      String formatDate = sdf.format(date);
   out.print(formatDate); %>
  </div> --%>

<!--  </body>
</html>  -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.*,java.text.SimpleDateFormat"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@include file="../header.css" %> --%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class = "header">
<label class = "header1">
login
</label>
<label class="in_header">
   <% Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      String formatDate = sdf.format(date);
   out.print(formatDate); %>
   </label>
  </div>


<!-- </body>
</html> -->