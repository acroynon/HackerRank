function processData(input) {
    //Enter your code here
    var arr = input.split("\n");
    var n = parseInt(arr[0]);
    var nums = arr[1].split(" ");
    var res = 0;
    for(i=0; i<n; i++){
        res+= parseInt(nums[i]);
    }
    console.log(res);
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