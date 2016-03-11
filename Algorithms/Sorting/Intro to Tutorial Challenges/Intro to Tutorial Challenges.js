function processData(input) {
    //Enter your code here
    var lines = input.split("\n");
    var V = lines[0];
    var ar = lines[2].split(" ");
    console.log(ar.indexOf(V));
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   p