function show() {
	var gen="";
     var radios = frmRadio.elements["gender"];
     for (var i = 0; i < radios.length; i++) {
        if (radios[i].checked) {
        	// alert(radios[i].value);
        	gen=radios[i].value;
       }
  }
  alert(gen);
 }