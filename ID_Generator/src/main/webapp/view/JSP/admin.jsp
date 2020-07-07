<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css">
		<meta charset="ISO-8859-1">
		<title>admin page</title>
	</head>

	<body>
			<div class="container">
			<h1> All Users List</h1>
			<table class="table table-striped">
				<caption> Users Data Within DB</caption>
				<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Email</th>
							<th>Phone Number</th>
							<th>Department</th>
							<th>Image</th>
						</tr>
				</thead>
				<tbody>
					<jstl:forEach items="${usersList}" var="user" >
						<tr>
							<td>${user.id}</td>
							<td>${user.name}</td>
							<td>${user.email}</td>
							<td>${user.phoneNo}</td>
							<td>${user.department}</td>
							<td><img alt="default" src="data:image/gif;base64,${user.image}" width="50" height="40"></td>
						</tr>
					</jstl:forEach>
				</tbody>
			</table>	
		</div>	
		<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	</body>
</html>