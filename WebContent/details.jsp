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
<style type="text/css">
.header {
  padding: 10px;
  text-align: center;
  background: #3D8FEE;
  color: white;
  font-size: 70px;
   font-family: Copperplate, Papyrus, fantasy;
}
.pic1 {
  float: left;
  padding: 20px;
}
#pic {
  float: left;
}
#size {
	font-size: 20px;
}
</style>
<title>Details</title>
</head>
<body>
<div class="header">
	<img src="logo.png" class="img-rounded pic1">
	<p class="font-effect-outline">Lifeline Bank</p>
</div>
<nav class="navbar navbar-default">
	 <div class="container-fluid">
	 	<div class="navbar-header">
      		<a class="navbar-brand" href="home.jsp"><span class="glyphicon glyphicon-home"></span> Home</a>
   		</div>
		<ul class="nav navbar-nav">
			<li><a href="createaccount.jsp">Create New Account</a></li>
			<li><a href="delete.jsp">Delete Account</a></li>
			<li class="active"><a href="details.jsp">Details of customer</a></li>
			<li><a href="withdraw.jsp">Withdraw</a></li>
			<li><a href="deposit.jsp">Deposit</a></li>
			<li><a href="transfer.jsp">Transfer</a></li>
			<li><a href="Report.jsp">Report</a></li>
		</ul>
	</div>
</nav>
<div class="container-fluid text-center">
	<div class="row-content">
		<div class="col-sm-4 sidenav">
			<img src="pic2.jpg" id="pic">
		</div>
		<div class="col-sm-8 text-left">
			<div class="container-fluid">
				<form action="./search" method="get">
					<h2>Enter account number to get details of customer</h2><br>
					<div class="form-group">
						<label for="accno">Account no.:</label>
						<input type="number" class="form-control" id="accno" placeholder="Enter account no." name="accno">
					</div>
					<button type="submit" class="btn btn-default">Search</button>
				</form>
			</div>
		</div>
	</div>
</div>	
</body>
</html>