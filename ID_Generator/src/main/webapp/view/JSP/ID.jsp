<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	    <link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="jspCss/ID_jsp.css">
		<title>ID Card</title>
	</head>

<body>
<div class="container">
	<div class="row">
		<div class="col-lg-3 col-sm-6">
            <div class="card hovercard">
                <div class="cardheader">
	                <div class="title">NEWGEN</div>
	             </div>
                  <div class="avatar">
                    <img alt="default" src="data:image/gif;base64,${user.image}" width="150" height="150">
                </div>
             
                <div class="info">
                    <div class="title">${user.name}</div>
                    <div class="desc">${user.department}</div>
                    <div class="desc">${user.email}</div>
                    <div class="desc">${user.phoneNo}</div>
                </div>
                <div class="bottom">
                <div class="title">${user.id}</div>                
                </div>
            </div>
        </div>
	</div>
</div>
<div class="container">
	<div class="row">
		<div class = "col-lg-3 col-sm-6">
			<a title="Print Screen" onclick="window.print();" target="_blank" style="cursor:pointer;">PRINT ID</a>
		</div>
	</div>
</div>
		<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		
</body>
</html>