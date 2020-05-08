<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "<a class="vglnk" href="http://www.w3.org/TR/html4/loose.dtd" rel="nofollow">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User</title>
</head>
<body>
	<div align="center">
		<h1>User List</h1>
		<h3>
			<a href="newUser">New User</a>
		</h3>
		<table border="1">

			<th>UserId</th>
			<th>UserName</th>
			<th>Password</th>

			<c:forEach var="user" items="${listUser}">
				<tr>

					<td>${user.userId}</td>
					<td>${user.userName}</td>
					<td>${user.password}</td>
					<td><a href="editUser?id=${user.userId}">Edit</a> <a
						href="deleteUser?id=${user.userId}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>