function processData(input) {
    var alphabet = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];
    var lines = input.split("\n");
    var n = parseInt(lines[0]);
    var s = String(lines[1]);
    var k = parseInt(lines[2]);
    while(k>25){k-=26};
    for(i=0; i<n; i++){
        var val = alphabet.indexOf(s.charAt(i).toUpperCase());
        if(val == -1){
            continue;
        }
        if(val>=0){val+=k};
        while(val>25){val-=26}
        if(s.charAt(i).toUpperCase() == s.charAt(i)){
            s = s.substr(0,i) + alphabet[val] + s.substr(i+1);
        }else{
            s = s.substr(0,i) + String(alphabet[val]).toLowerCase() + s.substr(i+1);
        }
         
    }
    
    console.log(s);
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