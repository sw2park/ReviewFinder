<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/movie/moviedetails.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<c:set var="movie" value="${requestScope.moviedto }"/>
	<main>
		<!-- 영화 스틸 이미지와 영화 정보 섹션 -->
		<section class="movie-banner">
			<!-- 스틸 이미지 -->
			<div class="movie-still-container">
				<img alt="영화 스틸 이미지"
					src="${movie.movie_still_image }"
					class="movie-still">
				<!-- 영화 정보 div -->
				<div class="movie-info-overlay">
					<h1 class="movie-title">${param.movie_title }</h1>
					<p class="movie-release-date">상영 날짜: ${param.movie_date }</p>
					<p class="movie-genre">장르: ${movie.movie_genre }</p>
				</div>
			</div>
		</section>

		<!-- 포스터, 별점 선택, 별점, 보고싶어요, 코멘트 줄거리 섹션 -->
		<section class="movie-details">
			<!-- 이미지 -->
			<div class="movie-poster">
				<img alt="영화 포스터"
					src="${movie.movie_poster }">
			</div>
			<!-- 별점 선택, 별점, 보고싶어요, 코멘트, 줄거리 div -->

			<div class="movie-rating">
				<!-- 별점 선택, 별점, 보고싶어요, 코멘트 섹션 -->
				<section>
					<div class="star-rating">
						<!-- 별점 선택 -->
						<span class="star" data-value="1">&#9733;</span> <span
							class="star" data-value="2">&#9733;</span> <span class="star"
							data-value="3">&#9733;</span> <span class="star" data-value="4">&#9733;</span>
						<span class="star" data-value="5">&#9733;</span>
					</div>
					<button type="button">평점 매기기</button>
					<!-- 기존 total-rating 내에 버튼 추가 -->
					<div class="total-rating">
						<!-- 기존 0점 부분 -->
						<span id="rating-score">0점</span>
						<!-- 버튼을 추가 -->
						<div class="wishlist-comment-buttons">
							<button id="wishlist-button" class="btn">보고싶어요 (찜 버튼)</button>
							<button id="comment-button" class="btn">코멘트 버튼</button>
						</div>
					</div>
				</section>
				<hr />
				<!-- 줄거리 섹션 -->
				<section>
					<p>
						<!-- 줄거리 -->
						${movie.movie_plot }
					</p>
				</section>
			</div>
		</section>

		<!-- 출연/제작 섹션 -->
		<section>
			<!-- 출연/제작 -->
			<h3>출연/제작</h3>
		</section>

		<!-- 코멘트 섹션 -->
		<section>
			<h3>코멘트</h3>
		</section>

		<!-- 갤러리 섹션 -->
		<section>
			<!-- 갤러리 -->
			<h3>갤러리</h3>
			<img alt="갤러리1" src=""> <img alt="갤러리2" src=""> <img
				alt="갤러리3" src="">
		</section>

		<!-- 비슷한 작품 섹션 -->
		<section>
			<h3>비슷한 작품</h3>
		</section>
	</main>
	<script src="/movie/moviedetails.js"></script>
</body>

</html>