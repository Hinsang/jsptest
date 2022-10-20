function bwrite() {
	let btitle = document.querySelector("#btitle").value
	let bcontent = document.querySelector("#bcontent").value
	let bid = document.querySelector("#bid").value
	let bpw = document.querySelector("#bpw").value
	
	$.ajax({
		url: "/jsptest/board/write",
		data: { "btitle": btitle, "bcontent": bcontent, "bid": bid, "bpw": bpw },
		type: 'POST',
		success: function(re) {
			if(re == 'true') {
				alert("등록성공!!")
				location.href="/jsptest/list.html"
			} else {
				alert("등록실패!!")
			}
		}
	})
}
