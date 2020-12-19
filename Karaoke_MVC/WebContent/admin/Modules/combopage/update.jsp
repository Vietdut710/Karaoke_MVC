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

<title>Thêm tin tức</title>

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
									Tạo gói mới
								</h2>
							</div>
							<div class="card-body ">
								<div class="container">
									<form action="http://localhost:8080/Karaoke_MVC/AddServicePageServlet" method="post">
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Tên Gói</label>
												<input class="form-control" type="text" name="txtTengoi" placeholder="Tên gói">
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Loại Phòng</label>
												<select name="sltLoaiphong" class="form-control border-dark">
												<optgroup label="V.I.P">
													<option> Phòng couple cinema </option>												
													<option> Phòng dưới 15 Người </option>
													<option> Phòng dưới 25 Người </option>
													<option> Sự kiện </option>
												</optgroup>
												<optgroup label="Normal">
													<option> Phòng couple cinema </option>												
													<option> Phòng dưới 15 Người </option>
													<option> Phòng dưới 25 Người </option>
												</optgroup>
												</select>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark"> Loại dịch vụ </label>
												<div class="form-check">
												  <label class="form-check-label">
												    <input type="radio" class="form-check-input" name="rad">Tiệc sinh nhật
												    
												  </label>
												  <label class="form-check-label mx-5">
												    <input type="radio" class="form-check-input" name="rad">Tiệc kỷ niệm
												  </label>
												  <label class="form-check-label mx-5">
												    <input type="radio" class="form-check-input" name="rad">Tiệc nhỏ
												  </label>
												  <label class="form-check-label mx-5">
												    <input type="radio" class="form-check-input" name="rad">Xem phim
												  </label>
												</div>																							
											</div>											
										</div>
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Menu</label>
												<table class="table form-group" >
													<tr class="text-primary">
														<th>Tên hàng </th>
														<th>Đơn giá </th>
														<th>Số lượng </th>
														<th>Thành Tiền </th> 
													</tr>
													<tr >
														<td>Heniken </td>
														<td>40.000 </td>
														<td> <input class="form-control" type="number" value="0" name="tblNumber"> </td>
														<td>0</td> 
													</tr>
													<tr >
														<td>Heniken </td>
														<td>40.000 </td>
														<td> <input class="form-control" type="number" value="0" name="tblNumber"> </td>
														<td>0</td> 
													</tr>
													<tr class="text-danger" >
														<td>Thành tiền </td>
														<td> </td>
														<td> </td>
														<td>0</td> 
													</tr>
												</table>												
											</div>										
										</div>
										<div class="form-group">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Giảm giá</label>
												<div class="col-sm-3 input-group mb-3">
												  <input type="number" class="form-control" placeholder="0">
												  <div class="input-group-append">
												    <span class="input-group-text bg-warning" id="basic-addon2">%</span>
												  </div>
												</div> 
											</div>
										</div>
										<div class="form-group row">
											<div class="col-sm-10">
												<label class="font-weight-bold text-dark">Nội dung</label> <br>
												<textarea class="form-control" rows="5" cols="" ></textarea>
											</div>
										</div>
										<div class="form-group row text-center">
											<div class="col-sm-10">
												<input class="btn btn-warning" type="submit" value="Cập Nhật">
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