function show() {
	var arr= [3,
	          'hello',
	          function() {
				return "Welcome";
				},
				{'city':'Hyderabad',
			  'state':'TS'}
	          ];
   var res="";
   res+="First Element " +arr[0] + "<br/>";
   res+="Second Element " +arr[1] + "<br/>";
   res+="Third Element " +arr[2]() + "<br/>";
   res+="Key Value 1 " +arr[3].city + "<br/>";
   res+="Key Value 2 " +arr[3].state + "<br/>";
   
   document.getElementById("res").innerHTML=res;
}