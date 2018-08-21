<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title> ${param.pageTitle}- Blog app</title>

	<!-- Bootstrap -->
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		  integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
		  integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<link rel="stylesheet" href="/resources/css/main.css">
	<link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet"/>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
			integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
			crossorigin="anonymous"></script>

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body>

<c:if test="${not empty successMessage}">
	<div class="alert alert-success">
			${successMessage}
	</div>
</c:if>

<c:url var="createAccountURL" value="/account/create"/>
<form:form modelAttribute="account" action="${createAccountURL}" method="post" class="form-horizontal">
	<div class="form-group">
		<form:label path="userName" class="col-sm-2 control-label">User name</form:label>
		<div class="col-sm-10">
			<form:input type="text" class="form-control" path="userName" placeholder="User name"/>
			<span class="errormessage"> <form:errors path="userName"/></span>
		</div>
	</div>
	<div class="form-group">
		<form:label path="goalName" class="col-sm-2 control-label">Goal name</form:label>
		<div class="col-sm-10">
			<form:input type="text" class="form-control" path="goalName" placeholder="Goal name"/>
			<span class="errormessage"> <form:errors path="goalName"/></span>
		</div>
	</div>
	<sec:csrfInput/>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">Create account</button>
		</div>
	</div>
</form:form>

</body>
</html>