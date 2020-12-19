<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Nhân viên</title>

<!-- Custom fonts for this template-->
<link href="http://localhost:8080/Karaoke_MVC/vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="http://localhost:8080/Karaoke_MVC/css/sb-admin-2.min.css" rel="stylesheet">

</head>
<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<%@ include file="../../Layouts/slidebar.jsp"%>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<%@ include file="../../Layouts/topbar.jsp"%>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">
					<!-- Content -->
					<div>
						<div class="mx-auto text-center">
							<h2 class="text-danger">Nhân Viên</h2>
						</div>
						<form action="http://localhost:8080/Karaoke_MVC/ShowAddStaffServlet">
						<input class="btn btn-outline-warning" type="submit" value="Thêm mới">
						</form>
						<table class="table text-center text-dark" >
							<tr>
								<th scope="col"> STT </th>
								<th scope="col"> Tên Nhân Viên </th>
								<th scope="col"> Số Điện Thoại </th>
								<th scope="col"> Địa Chỉ</th>
								<th scope="col"> Hành động </th>
							</tr>
							<tr>
								<td> 1 </td>
								<td> Dương Tất Thành </td>
								<td> Bố Trạch </td>
								<td> 0123456789 </td>
								<td> 
									<input type="button" class="btn btn-sm btn-outline-warning" value="Sửa">
									<input type="button" class="btn btn-sm btn-outline-warning" value="Xóa">
								</td>
							</tr>
							<tr>
								<td> 2 </td>
								<td> Thành Dương </td>
								<td> Quảng Trạch </td>
								<td> 0987654321 </td>
								<td> 
									<input type="button" class="btn btn-sm btn-outline-warning" value="Sửa">
									<input type="button" class="btn btn-sm btn-outline-warning" value="Xóa">
								</td>
							</tr>
						</table>
					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<%@include file="../../Layouts/footer.jsp"%>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<%@include file="../../Layouts/logoutmodal.jsp"%>

	<!-- Bootstrap core JavaScript-->
	<script src="http://localhost:8080/Karaoke_MVC/vendor/jquery/jquery.min.js"></script>
	<script src="http://localhost:8080/Karaoke_MVC/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="http://localhost:8080/Karaoke_MVC/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="http://localhost:8080/Karaoke_MVC/js/sb-admin-2.min.js"></script>

</body>
</html>