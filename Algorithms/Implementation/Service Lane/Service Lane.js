function processData(input) {
    //Enter your code here
    var lines = input.split("\n").slice(1);
    var serviceLane = lines[0].split(" ");
    for(i=1; i<lines.length; i++){
        var points = lines[i].split(" ");
        var smallest = 3;
        for(j=parseInt(points[0]); j<=parseInt(points[1]); j++){
            if(parseInt(serviceLane[j]) < smallest){
                smallest = parseInt(serviceLane[j]); 
            }   
            if(smallest ==1){
                break;
            }
        }
        console.log(smallest);
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