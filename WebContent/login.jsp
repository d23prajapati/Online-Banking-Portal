<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Login</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js" 
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous">
</script>
<script type="text/javascript"
    src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js">
</script>
<script type="text/javascript">
 
    $(document).ready(function() {
        $("#loginForm").validate({
            rules: {
                email: {
                    required: true,
                    email: true
                },
         
                pass: "required",
            },
             
            messages: {
                email: {
                    required: "Please enter email",
                    email: "Please enter a valid email address"
                },
                 
                pass: "Please enter password"
            }
        });
 
    });
</script>
<style>
body {
	background-image: url('loginbg.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
    background-size: cover;
}
label {
	color: white;
}
a:hover {
	color: white;
}
#align {
	margin: auto;
	width: 100%;
	padding-top: 90px;
	paddin-right: 120px;
}
h1 {
	color: white;
	text-align: center;
}
h2 {
	color: white;
	text-align: center;
}
</style>
</head>
<body>
<h1>Welcome to <b>LIFELINE BANK</b></h1>
<h2>Login To Continue...</h2>
<div class="container" id="align">
	<form class="form-horizontal" action="./logdata" method="post">
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">Email:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="email" placeholder="Enter Email" name="email">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pass">Password:</label>
			<div class="col-sm-4">
				<input type="password" class="form-control" id="pass" placeholder="Enter Password" name="pass">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-4"><br/><br/>${message}</label>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">Log In</button>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<a href=reg.jsp>Sign Up</a>
			</div>
		</div>
	</form>	
</div>
</body>
</html>