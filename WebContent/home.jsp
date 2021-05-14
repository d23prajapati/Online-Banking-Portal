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
<title>Home</title>
</head>
<body>
<% response.setHeader("Cache-control","no-cache,no-store,must-revalidate");%>
<% response.setHeader("Program","no-cache");%>
<%response.setHeader("Expires","0");%>
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
			<li><a href="Report.jsp">Report</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
        <li><a href="./logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      </ul>
	</div>
</nav>
<div class="container-fluid text-center">
	<div class="row-content">
		<div class="col-sm-4 sidenav">
			<img src="pic2.jpg" id="pic">
		</div>
		<div class="col-sm-8 text-left"> 
			<h1 style="font-weight: bold;">Welcome to Lifeline Bank</h1>
			<p id="size">Lifeline bank provides online banking services to customers. The services include withdraw of money
			, deposit of money, transfer money from one bank account to another, show the details of customers, 
			generate pdf report of customers(only for bank use).</p><p id="size">Online banking is 12 bit encrypted which gurantees
			complete protection of your bank account and money. Due to increase in online banking due to covid we have
			extended our servers to ensure fast service to customers. Online banking is easy to use and efficient as 
			no customers have to come to bank to make transaction.
			</p>
		</div>
	</div>
</div>	
</body>
</html>