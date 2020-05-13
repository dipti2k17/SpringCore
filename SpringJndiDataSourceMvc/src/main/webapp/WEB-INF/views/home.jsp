<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
        <div align="center">
            <h1>User List</h1>
            <table border="1">
                <th>Id</th>
                <th>Name</th>
                <th>Role</th>
                 
                <c:forEach var="user" items="${userList}" varStatus="status">
                <tr>
                     <td>${status.index + 1}</td>
                    <td>${user.name}</td>
                    <td>${user.role}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>
