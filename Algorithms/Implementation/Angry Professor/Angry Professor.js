function processData(input) {
    //Enter your code here
    var lines = input.split("\n");
    var t = parseInt(lines[0]);
    for(i=1; i<=t; i++){
        var NK = lines[i*2-1].split(" ");
        var times = lines[i*2].split(" ");
        var ontimes = 0;
        for(j=0; j<parseInt(NK[0]); j++){
            if(parseInt(times[j]) <= 0){
                ontimes++;
            }
            if(ontimes>=parseInt(NK[1])){
                console.log("NO");
                break;
            }
            if(j==parseInt(NK[0])-1){
                console.log("YES");
            }
        }        
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