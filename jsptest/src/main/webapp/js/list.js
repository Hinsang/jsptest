blist()
function blist(){
	$.ajax({
		url: "/jsptest/board/list",
		success : function( result ) {
			let blist = JSON.parse(result)
			console.log(blist)
			let table = document.querySelector("#boardlist")
			let tag = '<tr>' +
					'<th>번호</th>' +
					'<th>제목</th>' +
					'<th>내용</th>' +
					'<th>작성자</th>' +
					'<th>작성일</th>' +
					'<th>조회수</th>' +
				'</tr>';
			
			for( let i = 0 ; i < blist.length ; i++ ) {
			let b = blist[i]
				tag += '<tr>' +
					'<td>  '+b.bno+'  </td>' +
					'<td onclick="view('+b.bno+')">'+b.btitle+'</td>'+
					'<td>  '+b.bcontent+'  </td>' +
					'<td>  '+b.bid+'  </td>' +
					'<td>  '+b.bdate+'  </td>' +
					'<td>  '+b.bpoint+'  </td>' +
					'</tr>';
			}
			table.innerHTML += tag
		}
	})

}

function view(bno){ // 제목 눌렀을때 게시물 번호를 세션에 저장하는 함수
	console.log(bno+"입니다!!")
	$.ajax({
		url : "http://localhost:8080/jsptest/board/view" ,
		data : { "bno" : bno, "type" : "save" },
		success : function( re ){
			console.log(re)
			location.href = "http://localhost:8080/jsptest/view.html"
		}
	})
}
