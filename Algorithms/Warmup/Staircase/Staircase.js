function processData(input) {
    //Enter your code here
    var n = parseInt(input);
    var num_spaces = n-1;
    var num_hashes = 1;
    var res = "";
    
    for(i=0; i<n; i++){
        res="";
        for(j=0; j<num_spaces; j++){
            res+=" ";
        }
        for(j=0; j<num_hashes; j++){
            res+="#";
        }
        console.log(res);
        num_spaces--;
        num_hashes++;
    }
    if(n<=0){
        console.log(res);
    }
    
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});