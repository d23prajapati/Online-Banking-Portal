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
<title>Report</title>
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
			<li><a href="details.jsp">Details of customer</a></li>
			<li><a href="withdraw.jsp">Withdraw</a></li>
			<li><a href="deposit.jsp">Deposit</a></li>
			<li><a href="transfer.jsp">Transfer</a></li>
			<li class="active"><a href="Report.jsp">Report</a></li>
		</ul>
	</div>
</nav>
<div class="container-fluid text-center">
	<div class="row-content">
		<div class="col-sm-4 sidenav">
			<img src="pic2.jpg" id="pic">
		</div>
		<div class="col-sm-8 text-left">
			<h1>Create the pdf report of customers</h1>
			<h5 style="color: red;">Only for Bank Use</h5><br><br>
			<div class="container-fluid">
				<form action="./pdfgenerator" method="get">
					<div class="form-group">
						<input type="submit" class="form-control" id="pdf"  name="pdf" value="Create PDF Report">
					</div>
				</form>
			</div>
		</div>
	</div>
</div>	
</body>
</html>