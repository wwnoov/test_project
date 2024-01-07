<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
	<title>index</title>
</head>
<body>
<h2>개인 프로젝트 남원우</h2>
<a href="/board/save">글작성</a>
<a href="/board/list">글목록</a>
<a href="/board/paging">페이징 목록</a>
<button class="btn btn-success" id="comment-write-btn" onclick="commentWrite()">댓글보기</button>

<script>

	const commentWrite = () => {
		const writer = document.getElementById("commentWriter").value;
		const contents = document.getElementById("commentContents").value;
		$.ajax({
			type: "post",
			url: "/board/list",
			data: {
				commentWriter: writer,
				commentContents: contents,
				boardId: board
			},
			dataType: "json",
			success: function(boardList) {
				console.log("작성성공");
				console.log(boardList);
				let output = "<table class='table table-striped'>";
				output += "<tr><th>번호</th>";
				output += "<th>제목</th>";
				output += "<th>작성자</th>";
				output += "<th>작성시간</th>";
				output += "<th>조회수</th></tr>";
				for(let i in boardList){
					output += "<tr>";
					output += "<td>"+boardList[i].id+"</td>";
					output += "   <a href="/board?id=${board.id}">${boardList[i].boardTitle}</a>";
					output += "<td>"+boardList[i].boardWriter+"</td>";
					output += "<td>"+boardList[i].boardCreatedTime+"</td>";
					output += "<td>"+boardList[i].boardHits+"</td>";
					output += "</tr>";
				}
				output += "</table>";
				document.getElementById('board-list').innerHTML = output;
				document.getElementById('boardWriter').value='';
				document.getElementById('boardTitle').value='';
			},
			error: function() {
				console.log("실패");
			}
		});
	}
</script>
</body>
</html>