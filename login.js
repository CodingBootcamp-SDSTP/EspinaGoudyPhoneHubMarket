window.onload = ()=> {
	document.getElementById('login').onclick = ()=> {
		let username = document.getElementById('username').value;
		let password = document.getElementById('password').value;
		let rq = new XMLHttpRequest();
		rq.onreadystatechange = ()=> {
			if(rq.readyState == 4) {
				alert("You are now logged in");
			}
			else {
				alert("Incorrect username or password");
			}
		}
			rq.open("GET", "/phonehubmarket/login", true);
			rq.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
			rq.send("username="+username+"&password="+password);
	}
}
