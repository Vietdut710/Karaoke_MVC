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
<title>Slide bar</title>
<!-- Custom fonts for this template-->
<link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="../css/sb-admin-2.min.css" rel="stylesheet">
</head>
<body>
	<div id="wrapper">
		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-warning sidebar sidebar-dark accordion"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a class="sidebar-brand d-flex align-items-center justify-content-center"
				href="http://localhost:8080/Karaoke_MVC/ShowIndexAdminServlet">
				<div class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-robot text-dark"></i>
				</div>
				<div class="sidebar-brand-text text-dark mx-3">
					Karaoke Admin <sup>VIP</sup>
				</div>
			</a>
			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading text-dark">Cài đặt giao diện</div>

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item active"><a class="nav-link collapsed"
				href="#" data-toggle="collapse" data-target="#collapseTwo"
				aria-expanded="true" aria-controls="collapseTwo"> <i
					class="fas fa-fw fa-cog"></i> <span>Trang Web</span>
			</a>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Danh sách trang:</h6>
						<a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowHomePageServlet">Trang chủ</a> <a
							class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowStorePageServlet">Trang cửa hàng</a> <a
							class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowComboPageServlet">Trang Combo</a> <a
							class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowContactPageServlet">Trang liên hệ</a>
						<a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowBannerServlet">Banner</a>
					</div>
				</div></li>
			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->
			<div class="sidebar-heading text-dark">Hệ thống</div>
			<!-- Nav Item - Pages Collapse Menu -->
			<!-- Cửa hàng -->
			<li class="nav-item active"><a class="nav-link" href="#"
				data-toggle="collapse" data-target="#collapseCuaHang"
				aria-expanded="true" aria-controls="collapseCuaHang"> <i
					class="fas fa-home"></i> <span>Cửa Hàng</span>
			</a>
				<div id="collapseCuaHang" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Cửa hàng</h6>
						<a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowStoreServlet">Danh sách cửa hàng</a> <a
							class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowAddStoreServlet">Thêm mới cửa hàng</a>
					</div>
				</div></li>
			<!-- Hàng hóa -->
			<li class="nav-item active"><a class="nav-link" href="#"
				data-toggle="collapse" data-target="#collapseHangHoa"
				aria-expanded="true" aria-controls="collapseHangHoa"> <i
					class="fas fa-balance-scale"></i> <span>Hàng hóa</span>
			</a>
				<div id="collapseHangHoa" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Hàng hóa</h6>
						<a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowProductServlet">Danh sách hàng hóa</a> <a
							class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowAddProductServlet">Thêm mới hàng hóa</a>
					</div>
				</div></li>
			<!-- Khách hàng -->
			<li class="nav-item active"><a class="nav-link" href="#"
				data-toggle="collapse" data-target="#collapseKhachHang"
				aria-expanded="false" aria-controls="collapseKhachHang"> <i
					class="fas fa-handshake"></i> <span>Khách hàng</span>
			</a>
				<div id="collapseKhachHang" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Khách hàng</h6>
						<a class="collapse-item " href="http://localhost:8080/Karaoke_MVC/ShowCustomerServlet">Danh sách khách hàng</a>
						<a class="collapse-item " href="http://localhost:8080/Karaoke_MVC/ShowAddCustomerServlet">Thêm mới khách hàng</a>
					</div>
				</div></li>

			<!-- Nhân viên -->
			<li class="nav-item active"><a class="nav-link" href="#"
				data-toggle="collapse" data-target="#collapseNhanVien"
				aria-expanded="false" aria-controls="collapseNhanVien"> <i
					class="fas fa-id-badge"></i> <span>Nhân viên</span>
			</a>
				<div id="collapseNhanVien" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Nhân viên</h6>
						<a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowStaffPageServlet">Danh sách nhân viên</a> 
						 <a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowAddStaffServlet">Thêm mới nhân viên</a>
					</div>
				</div></li>
			<!-- Báo cáo thống kê -->
			<li class="nav-item active"><a class="nav-link" href="#"
				data-toggle="collapse" data-target="#collapseBCTK"
				aria-expanded="false" aria-controls="collapseBCTK"> <i
					class="fas fa-clipboard"></i> <span>Báo cáo thống kê</span>
			</a>
				<div id="collapseBCTK" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Báo cáo thống kê</h6>
						<a class="collapse-item active" href="http://localhost:8080/Karaoke_MVC/ShowReportServlet">Trang báo cáo </a> <a
							class="collapse-item active" href="http://localhost:8080/Karaoke_MVC/ShowDayReportServlet">Doanh số theo ngày</a> <a
							class="collapse-item active" href="http://localhost:8080/Karaoke_MVC/ShowMothReportServlet">Doanh số theo tháng</a> <a
							class="collapse-item active" href="http://localhost:8080/Karaoke_MVC/ShowYearReportServlet">Doanh số theo năm</a> <a
							class="collapse-item active" href="http://localhost:8080/Karaoke_MVC/ShowStoreReportServlet">Doanh số theo cửa hàng</a>
					</div>
				</div></li>

			<!-- Tài khoản -->
			<li class="nav-item active"><a class="nav-link" href="#"
				data-toggle="collapse" data-target="#collapseTaiKhoan"
				aria-expanded="false" aria-controls="collapseTaiKhoan"> <i
					class="fas fa-lock"></i> <span>Tài Khoản</span>
			</a>
				<div id="collapseTaiKhoan" class="collapse"
					aria-labelledby="headingPages" data-parent="#accordionSidebar">
					<div class="bg-white py-2 collapse-inner rounded">
						<h6 class="collapse-header">Quản Trị Viên</h6>
						<a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowAdminPageServlet">Danh sách quản trị viên</a>
						<a class="collapse-item" href="http://localhost:8080/Karaoke_MVC/ShowAddAdminServlet">Thêm tài khoản quản trị</a>
					</div>
				</div></li>

			<!-- Nav Item - Tables -->
			<li class="nav-item active"><a class="nav-link text-danger"
				href="#"> <i class="fas fa-sign-out-alt text-danger"></i> <span>Đăng
						Xuất</span>
			</a></li>

			<!-- Divider -->
			<hr class="sidebar-divider d-none d-md-block">

			<!-- Sidebar Toggler (Sidebar) -->
			<div class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</div>

		</ul>
		<!-- End of Sidebar -->
	</div>
	<!-- Bootstrap core JavaScript-->
	<script src="../vendor/jquery/jquery.min.js"></script>
	<script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="../vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="../js/sb-admin-2.min.js"></script>
</body>
</html>