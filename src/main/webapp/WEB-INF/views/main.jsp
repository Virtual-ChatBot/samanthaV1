<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>

<html lang="ko">

	<head>
		<meta charset="utf-8" />
    	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />

		<title>BEEMIL</title>

		<!--LOGO-->
		<link rel="apple-touch-icon" sizes="180x180" href="/images/phantom/logo.svg">
		<link rel="icon" type="image/png" sizes="32x32" href="/images/phantom/logo.svg">
		<link rel="icon" type="image/png" sizes="16x16" href="/images/phantom/logo.svg">

		<!--CSS-->
		<link rel="stylesheet" href="http://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
		<link rel="stylesheet" href="/css/phantom/main.css">

		<noscript>
			<link rel="stylesheet" href="/css/phantom/noscript.css">
		</noscript>
	</head>

	<body class="is-preload">
		<div id="wrapper">

			<header id="header">
				<div class="inner">

					<!-- Logo -->
					<a href="/user/login?userId=${user.userId}" class="logo">
						<span class="symbol"><img src="/images/phantom/logo.svg" alt="" /></span><span class="title">BEEMIL</span>
					</a>

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
					<li><a href="/user/login?userId=${user.userId}">메인으로</a></li>
					<li><a href="/user/logout">로그아웃</a></li>
					<li><a href="generic.html">블로그</a></li>
					<li><a href="generic.html">소개</a></li>
				</ul>
			</nav>

			<!-- Main -->
			<div id="main">
				<div class="inner">

					<header>

						<h1>비밀연구소</h1>

						<br>

						<h2>${user.nickName}님,</h2>
						<p>여기는 <a href="https://www.youtube.com/@beemil" target="_blank">비밀상담소</a> 가 AI 챗봇을 연구하는 곳입니다.</p>
					</header>

					<section class="tiles">

						<article class="style1">

							<span class="image">
								<img src="/images/phantom/pic01.jpg" alt="" />
							</span>

							<a href="/user/logout">
								<h2>로그아웃</h2>

								<div class="content">
									<br>
									<p>[SamanthaV1]</p>
									<p>NAVER CLOVA Chatbot 을<br>기반으로 만들어진</p>
									<p>첫번째 음성인식 챗봇입니다</p>
								</div>
							</a>

						</article>

						<article class="style2">

							<span class="image">
								<img src="/images/phantom/pic02.jpg" alt="" />
							</span>

							<a href="generic.html">
								<h2>블로그</h2>

								<div class="content">
									<br>
									<p>[특징]</p>
									<p>스테이블 디퓨전을 활용하여</p>
									<p>자신의 얼굴을 가지고 있습니다</p>
								</div>
							</a>

						</article>

						<article class="style3">

							<span class="image">
								<img src="/images/phantom/pic03.jpg" alt="" />
							</span>

							<a href="generic.html">
								<h2>소개</h2>

								<div class="content">
									<br>
									<p>[핵심]</p>
									<p>텍스트와 음성을 인식 후</p>
									<p>알맞게 입을 움직여야 합니다</p>
								</div>
							</a>

						</article>

					</section>
				</div>
			</div>

			<!-- Footer -->
			<footer id="footer">
				<div class="inner">

					<section>
						<h2>OPENING</h2>

						<!--carousel-->
						<div id="carousel" class="carousel carousel-dark slide carousel-fade" data-bs-ride="carousel">

							<div class="carousel-inner">
								<div class="carousel-item active">
									<video class="d-block w-100" autoplay loop>
										<source src="/media/opening.mp4" type="video/mp4">
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
						<li>&copy; Untitled. All rights reserved</li><li>Design: <a href="http://html5up.net" target="_blank">HTML5 UP</a></li>
					</ul>

				</div>
			</footer>
		</div>

		<!--Bootstrap-->
		<script src="http://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

		<!--Jquery-->
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>

		<!-- Scripts -->
		<script src="/js/phantom/browser.min.js"></script>
		<script src="/js/phantom/breakpoints.min.js"></script>
		<script src="/js/phantom/util.js"></script>
		<script src="/js/phantom/main.js"></script>
	</body>
</html>