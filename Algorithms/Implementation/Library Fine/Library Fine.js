function processData(input) {
    //Enter your code here
    var lines = input.split("\n")
    var d1 = lines[0].split(" ");
    var d2 = lines[1].split(" ");
    if(parseInt(d1[2]) > parseInt(d2[2])){
        console.log(10000);
        return;
    }else if(parseInt(d1[2]) < parseInt(d2[2])){
        console.log(0);
        return;
    }
    if(parseInt(d1[1]) > parseInt(d2[1])){
        console.log(500 * (parseInt(d1[1]) - parseInt(d2[1])));
        return;
    }else if(parseInt(d1[1]) < parseInt(d2[1])){
        console.log(0);
        return;
    }
    if(parseInt(d1[0]) > parseInt(d2[0])){
        console.log(15 * (parseInt(d1[0]) - parseInt(d2[0])));
        return;
    }else if(parseInt(d1[0]) < parseInt(d2[0])){
        console.log(0);
        return;
    }
    console.log(0);
    
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