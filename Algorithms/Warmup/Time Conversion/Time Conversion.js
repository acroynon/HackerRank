function processData(input) {
    var arr = input.split(":");
    if(arr[2].indexOf("PM") > -1){
        if(parseInt(arr[0]) < 12){
            arr[0] = parseInt(arr[0])+12;
        }
    }
    if(arr[2].indexOf("AM") > -1 && parseInt(arr[0]) == 12){
        arr[0] = "00";
    }
    arr[2] = arr[2].slice(0,2);
    console.log(arr[0] + ":" + arr[1] + ":" + arr[2]);
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