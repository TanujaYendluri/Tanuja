var i=0;
questions=[
   '1. What is Object Oriented programming',
   '2. Who introduced Java',
   '3. How to declare generics',
   '4. String.format() used for '
           ];
function show() {
	document.getElementById("question").innerHTML=
		questions[i];
}

function nextQuestion() {
	i=i+1;
	if(i < 4) {
		show();
	} else {
		alert("Exam Over...");
	}
}


