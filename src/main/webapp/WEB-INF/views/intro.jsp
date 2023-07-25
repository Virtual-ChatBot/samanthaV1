<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>

<html lang="ko">

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />

		<title>BEEMIL</title>

		<!--LOGO-->
		<link rel="apple-touch-icon" sizes="180x180" href="../images/phantom/logo.svg">
		<link rel="icon" type="image/png" sizes="32x32" href="../images/phantom/logo.svg">
		<link rel="icon" type="image/png" sizes="16x16" href="../images/phantom/logo.svg">

		<!--CSS-->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
		<link rel="stylesheet" href="../css/phantom/main.css">

		<noscript>
			<link rel="stylesheet" href="../css/phantom/noscript.css">
		</noscript>
	</head>

	<body class="is-preload">
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<div class="inner">

							<!-- Logo -->
							<c:if test="${sessionScope.user.nickName eq 'BEEMIL'}">

								<a href="../user/login?userId=${user.userId}" class="logo">
									<span class="symbol"><img src="../images/phantom/logo.svg" alt="" /></span><span class="title">BEEMIL</span>
								</a>

							</c:if>

							<c:if test="${sessionScope.user.nickName ne 'BEEMIL'}">

								<a href="../user/visit" class="logo">
									<span class="symbol"><img src="../images/phantom/logo.svg" alt="" /></span><span class="title">BEEMIL</span>
								</a>

							</c:if>

							<!-- Nav -->
								<nav>
									<ul>
										<li><a href="#menu">Menu</a></li>
									</ul>
								</nav>

						</div>
					</header>

				<!-- Menu -->
				<nav id="menu">
					<h2>환영합니다</h2>

					<ul>
						<li>
							<c:if test="${sessionScope.user.nickName eq 'BEEMIL'}">
								<a href="../user/login?userId=${user.userId}">메인으로</a>
							</c:if>

							<c:if test="${sessionScope.user.nickName ne 'BEEMIL'}">
								<a href="../user/visit">메인으로</a>
							</c:if>
						</li>

						<li>
							<a href="../user/logout">로그아웃</a>
						</li>

						<li>
							<a href="../intro">소개</a>
						</li>

						<li>
							<a href="generic.html">게시판</a>
						</li>
					</ul>
				</nav>

				<!-- Main -->
					<div id="main">
						<div class="inner">

							<header>

								<a href="../intro" class="logo">
									<h1>SAMANTHA</h1>
								</a>

								<br>

							</header>

							<p>음성인식 챗봇에 관한 이야기입니다</p>
							<span class="image main"><img src="images/beemil/her.png" alt="" /></span>
							<p><b>1. 음성인식 챗봇 구축을 위한 가상화 네트워크를 구축하였습니다.</b></p>
							<p>클라우드 서비스 이용 시 고정으로 지출되는 비용을 줄이기 위해 호스트 OS 가상화를 이용하였습니다. 공유기를 이용해 공인IP와 사설IP를 구분하여 외부 통신이 가능하면서도 보안성을 높일 수 있었습니다. WOL 및 스마트 플러그를 이용해 원격 서버 기동 및 접속을 구현하여 어디서든 개발이 가능하도록 구현 하였습니다.</p>
						</div>
					</div>

				<!-- Footer -->
				<footer id="footer">
					<div class="inner">

						<section>
							<h2>HER</h2>

							<!--carousel-->
							<div id="carousel" class="carousel carousel-dark slide carousel-fade" data-bs-ride="carousel">

								<div class="carousel-inner">
									<div class="carousel-item active">
										<video class="d-block w-100" autoplay loop>
											<source src="../media/beemil/her.mp4" type="video/mp4">
										</video>
									</div>
								</div>

							</div>

						</section>

						<section>

							<div>
								<h2>Follow</h2>
								<ul class="icons">
									<li><a href="https://www.youtube.com/@beemil" target="_blank" class="icon brands style2 fa-youtube"><span class="label">Youtube</span></a></li>
									<li><a href="https://github.com/Virtual-ChatBot" target="_blank" class="icon brands style2 fa-github"><span class="label">GitHub</span></a></li>
								</ul>
							</div>

							<br>
							<br>

							<div>
								<h2>Project</h2>
								<ul class="icons">
									<li><a href="https://github.com/sososo95/motrip_main_project" target="_blank" class="icon brands style2 fa-git"><span class="label">git</span></a></li>
								</ul>
							</div>
						</section>

						<ul class="copyright">
							<li>&copy; Untitled. All rights reserved</li><li>Design: <a href="https://html5up.net" target="_blank">HTML5 UP</a></li>
						</ul>

					</div>
				</footer>
			</div>

		<!--Bootstrap-->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

		<!--Jquery-->
		<script src="https://code.jquery.com/jquery-latest.min.js"></script>

		<!-- Scripts -->
		<script src="../js/phantom/browser.min.js"></script>
		<script src="../js/phantom/breakpoints.min.js"></script>
		<script src="../js/phantom/util.js"></script>
		<script src="../js/phantom/main.js"></script>

	</body>
</html>