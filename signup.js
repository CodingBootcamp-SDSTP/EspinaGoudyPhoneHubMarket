window.onload = ()=> {
	document.getElementById('signup').onclick = ()=> {
		let username = document.getElementById('username').value;
		let password = document.getElementById('password').value;
		let email = document.getElementById('email').value;
		let contact = document.getElementById('contact').value;
		let location = document.getElementById('location').value;
		let rq = new XMLHttpRequest();
		rq.onreadystatechange = ()=> {
			if(rq.readyState == 4) {
				alert("You are now sucessfully registered!");
			}
		}
		rq.open("POST", "/phonehubmarket/adduser", true);
		rq.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
		rq.send("username="+username+"&password="+password+"&email="+email+"&contact="+contact+"&location="+location);
	}
}
