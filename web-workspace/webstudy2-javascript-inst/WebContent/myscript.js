function testSrc(){
	alert("방가 js");
}
function checkForm(){
	var mf=document.menuForm;
	var flag=false;
	for(var i=0;i<mf.menu.length;i++){
		if(mf.menu[i].checked){
			flag=true;
			break;
		}
	}
	if(flag==false){
		alert("메뉴를 하나이상 선택하세요!");
		return false;
	}
	if(mf.count.value==""){
		alert("수량을 입력하세요!");
		return false;
	}
	if(isNaN(mf.count.value)){
		alert("수량을 숫자로 입력하세요!");
		return false;
	}
}