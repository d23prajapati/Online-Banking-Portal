<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Sign Up</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <style>
  	h2 {
  		color: white;
  	}
  	body {
  		background-image: url('loginbg.jpg');
		background-repeat: no-repeat;
		background-attachment: fixed;
    	background-size: cover;
  	}
  	label {
  		color: white;
  	}
  	a {
  		color: white;
  	}
  </style>
</head>
<body>

<div class="container">
  <h2>Sign Up</h2>
  <form action="./regdata" method="post">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="pass">Password:</label>
      <input type="password" class="form-control" id="pass" placeholder="Set password" name="pass">
    </div>
    <div class="form-group">
      <label for="accno">Account No:</label>
      <input type="number" class="form-control" id="accno" placeholder="Enter Account no." name="accno">
    </div>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
    </div>
    <div class="form-group">
      <label for="balance">Balance:</label>
      <input type="text" class="form-control" id="balance" placeholder="Enter Opening amount(min 500/-)" name="balance">
    </div>
    <div class="form-group">
      <label for="phno">Mobile No:</label>
      <input type="text" class="form-control" id="phno" placeholder="Enter Mobile No." name="phno" maxlength="10">
    </div>
    <div class="form-group">
      <label for="address">Address:</label>
      <input type="text" class="form-control" id="address" placeholder="Enter address" name="address">
    </div>
    <br>
    <button type="submit" class="btn btn-default">Submit</button>
    <br>
    <a href="login.jsp">Log In</a>
  </form>
</div>

</body>
</html>
