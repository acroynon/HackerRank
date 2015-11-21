function processData(input) {
    var lines = input.split("\n").splice(1);
    for(i=0; i<lines.length;i++){
        var N = parseInt(lines[i])
        var digits = lines[i].split("");
        var res = 0;
        digits.forEach(function(digit){
                 if(N%parseInt(digit) == 0){
                     res++;
                 }
        });
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