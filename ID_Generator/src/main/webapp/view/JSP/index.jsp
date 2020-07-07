<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css">
		<meta charset="ISO-8859-1">
		<title>Welcome</title>
	</head>

	<body>
			<div class="container">
			<h1>Lets Start</h1>
			<table class="table ">
				<thead>
						<tr>
							<th></th>
							<th></th>
							<th></th>
							<th></th>
						</tr>
				</thead>
				<tbody>
						<tr>	
							<td><a href = "/register" class="btn btn-primary">Register</a></td>
							<td><a href = "/find" class="btn btn-success">Search</a></td>
							<td> <a href="/update" class="btn btn-info">Update </a></td>
							<td><a href = "/admin" class="btn btn-danger">Admin</a></td>
						</tr>
				</tbody>
			</table>	
		</div>	
		<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	</body>
</html>