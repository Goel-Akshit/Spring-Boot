<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <title>GenerateID</title>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css">

    </head>
    <body>
        <h1 class="text-dark text-center font-weight-bold" style="font-size: 60px;">
            Search ID
        </h1>
            <div class="container">
               <div class="row ">
                    <div class="col-5">
                    	<span style="color:#FF0000"> ${message} </span>
	                        <form action="/search" class="form-group bg-mute " method="post">
	                          <div class="form-group">
	                            <label class="font-weight-bold"> Email: </label>
	                            <input type="email" required="required" name="email" class="form-control" id="email2" autocomplete="off">
	                             </div>
	                                 <input type="submit" name="submit" value="SearchID" class="btn btn-primary">
	                          </form>
                    	</div>
                    </div>
                </div>

                <script type="text/javascript" src="js/script.js"></script>
                    <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
                <script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    </body>
</html>
