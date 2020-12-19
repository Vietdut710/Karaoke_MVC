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

<title>Thêm Liên hệ</title>

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
							<h2 class="text-danger">Thêm liên hệ</h2>
						</div>
					<form action="http://localhost:8080/Karaoke_MVC/AddContactPageServlet">
						<table class="table">
						<tr>
						 <th> Cửa Hàng </th>
							 <td>	
							 	<select class="select" name="sltCuahang">
							 		<option> Karaoke&Movie Quảng Trạch </option>
							 		<option> Karaoke&Movie Ba Đồn </option>
							 		<option> Karaoke&Movie Lý Hòa </option>
							 		<option> Karaoke&Movie Bố Trạch </option>
							 		<option> Karaoke&Movie Hoàn Lão </option>
							 	</select>
							 </td>
						</tr>
						<tr>
						 <th> Số điện thoại </th>
						 <td> <input class="form-control" type="text" name="txtSDT" placeholder="SĐT"> </td>
						</tr>
						<tr>
						 <th> Địa chỉ </th>
						 <td> <input class="form-control" type="text" name="txtDiaChi" placeholder="Địa chỉ"> </td>
						</tr>
						<tr>
						 <th> Nội dung </th>
						 <td> <textarea class="form-control" name="txtNoidung" placeholder="Nhập nội dung" rows="5"> </textarea> </td>
						</tr>
						<tr>
						 <th>Hình ảnh </th>
						 <td> <input class="" type="file" name="imgContact"> </td>
						</tr>
						<tr>
						 <th></th>
						 <td class="text-center"> 
						 	<input class="btn btn-outline-warning " type="submit" value="Thêm">  
						 	<input class="btn btn-outline-warning " type="button" value="Hủy bỏ">
						 </td>
						</tr>
						</table>
					</form>
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