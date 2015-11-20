function processData(input) {
    //Enter your code here
    var lines = input.split("\n");
    var n = parseInt(lines[0]);
    var arr = [];
    var d1 = 0;
    var d2 = 0;
    
    for(i=0; i<n; i++){
        arr.push(lines[i+1].split(" "));
    }

    for(i=0; i<n; i++){
        d1 += parseInt(arr[i][i]);
        d2 += parseInt(arr[i][(n-1)-i]);
    }
    console.log(Math.abs(d1-d2));
    
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