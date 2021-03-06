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

<title>Quản Trị Viên</title>

<!-- Custom fonts for this template-->
<link href="http://localhost:8080/Karaoke_MVC/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
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
				<div class="container-fluid" >
					<!-- Content -->
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<div class="card mt-5">
								<h2 class="card-header text-danger text-center">
									Thêm Quản Trị Viên
								</h2>
							</div>
							<div class="card-body ">
								<div class="container">
									<form action="http://localhost:8080/Karaoke_MVC/AddAdminServlet" method="post">
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Họ và tên</label>
												<input class="form-control" type="text" name="txtHoVaTen" placeholder="Họ và Tên">
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Số Điện Thoại</label>
												<input class="form-control mx " type="text" name="txtSDT" placeholder="Số Điện Thoại">
											</div>	
										</div>
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Ngày Sinh</label>
												<input class="form-control mx " type="date" name="txtNgaySinh" 	>
											</div>	
										</div>
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark"> Hình Ảnh </label>	
												<input class=" " type="file" name="imgQuanTri">
											</div>											
										</div>									
										<div class="form-group row text-center">
											<div class="col-sm-10">
												<input class="btn btn-warning" type="submit" value="Thêm">
												<input class="btn btn-outline-warning" type="button" value="Hủy">
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
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