view()
function view(){
	$.ajax({
		url : "http://localhost:8080/jsptest/board/view" ,
		data : { "type" : "load" },
		success : function( re ){
			let board  = JSON.parse( re )
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('.bid').innerHTML = board.bid;
			document.querySelector('.btitle').innerHTML = board.btitle;
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			document.querySelector('.bdate').innerHTML = board.bdate;
			document.querySelector('.bpoint').innerHTML = board.bpoint;
		}
	})
}
