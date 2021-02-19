<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<div class="container-fluid">
		<h2>Example simple form bootstrap</h2>
		<form action="recoveryInfo" method="get">
			<br>
			<div class="form-group col-4">
				<input type="text" class="form-control" name="name"
					placeholder="Nome" required>
			</div>
			<br>
			<div class="form-group col-4">
				<input type="email" class="form-control" name="email"
					placeholder="Email" required>
			</div>
			<br>
			<div class="form-group">
				<input type="submit" class="btn btn-primary" />
			</div>
		</form>
	</div>
</body>
</html>