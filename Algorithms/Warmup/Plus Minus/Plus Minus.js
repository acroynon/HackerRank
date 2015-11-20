function processData(input) {
    //Enter your code here
    var inputList = input.split("\n");
    var n = inputList[0];
    var arr = inputList[1].split(" ");
    var negs = 0;
    var pos = 0;
    var zeros = 0;
    for(i=0; i<n; i++){
        if(parseInt(arr[i]) > 0){
            pos++;
        }else if(parseInt(arr[i]) < 0){
            negs++;
        }else{
            zeros++;
        }
    }
    console.log(  ((pos/n).toPrecision(5))  );
    console.log(  ((negs/n).toPrecision(5))  );
    console.log(  ((zeros/n).toPrecision(5))  );
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