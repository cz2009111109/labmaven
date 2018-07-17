function Login(){
	var name=$("#name").val();
	var password=$("#password").val();
	$.ajax({
		type:"get",
		url:"login",
		data:'name='+name+'&password='+password,
		dataType:"json",
		async:true,
		contentType:  'application/json',
		cache: 'false',
		timeout: '1000',
		error: er,
		success: succ
	});
	function er(){
		alert("登录失败");
	}
	function succ(data){
		if(data==null){
			alert("用户信息不存在，登录失败。");
		}else{
			
			alert("登录成功,转至首页");
			//验证该浏览器是否支持localStorage
	        if(window.sessionStorage){
	            var store=window.sessionStorage;
	            //console.log(data);
	            store.setItem("user_id", data.user_id);
	            store.setItem("full_name", data.full_name);
	            store.setItem("role_id", data.role_id);
	            store.setItem("name", data.name);
	            store.setItem("role_department", data.role_department);
	          	window.location.href="/"+getContextPath()+"/main.html";
	        }else{
	            alert('你的浏览器不支持localStorage!');
	        }
		}
	}
	
}

function outlogin(){
	$.ajax({
		type:"get",
		url:getContextPath()+"/try/outlogin",
		async:true,
		timeout: '1000',
		error: er,
		success: succ
	});
	function er(){
		alert("退出失败");
	}
	function succ(data){
		window.location.href="/"+getContextPath()+"/login.html";
	}
}
