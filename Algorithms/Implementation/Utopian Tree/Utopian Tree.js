'use strict';

function processData(input) {
    var lines = input.split("\n").splice(1);
    var numCycles = 0;
    var treeLength = 1;
    var cycleDouble = true;
    for(var i=0;i<lines.length;i++){
        treeLength = 1;
        numCycles = parseInt(lines[i]);
        cycleDouble = true;
        for(var j=0;j<numCycles;j++){
            if(cycleDouble){
                treeLength*=2;
            }else{
                treeLength+=1;
            }
            cycleDouble = !cycleDouble;
        }
        console.log(treeLength);
    }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
var _input = "";
process.stdin.on("data", function (input) { _input += input; });
process.stdin.on("end", function () { processData(_input); });