//Asi trbaja sincrona
console.log("Holaaaa");
console-log("adios");
alert("Dia del michi");
console-log ("adios");

//Settimeout
/*
function(){
    console.log("Hola mundo, con retraso");
} console.log("Sorpresa");*/

const myCollback = () => console.log("Hola mundo con retresa");
setTimeout(myCollback,0);
console.log("Sorpresa");

