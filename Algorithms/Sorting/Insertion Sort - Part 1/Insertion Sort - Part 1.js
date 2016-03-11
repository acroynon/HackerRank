function processData(input) {
    var lines = input.split("\n");
    var ar = lines[1].split(" ");
    var P = parseInt(ar[ar.length-1]);
    var pI = ar.length-2;
    for(i=pI; i>-1; i--){
        if(ar[i] > P){
            ar[i+1] = ar[i];
        }else{
            ar[i+1] = P;
            console.log(ar.toString().replace(/,/g," "));
            return;
        }
        console.log(ar.toString().replace(/,/g," "));
        if(i==0){
            ar[i] = P;
             console.log(ar.toString().replace(/,/g," "));
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