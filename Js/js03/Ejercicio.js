let dia = parseInt(prompt("0=Domingo,1=Lunes,2=Martes,3=Miercoles,4=Jueves,5=Viernes,6=Sabado"));

if (dia === 0){
    console.log("Domingo");
}
else if(dia === 1){
    console.log("Lunes");
}

else if(dia === 2){
    console.log("Martes")
}

else if(dia === 3){
    console.log("Miercoles")
}

else if(dia === 4){
    console.log("Jueves")
}

else if(dia === 5){
    console.log("Viernes")
}

else if(dia === 6){
    console.log("Sabado")
}

else {
    console.log("Numero de dia incorrecto")
}

//AND "&&""
//VERDADERO SOLO SI LOS DOS ELEMENTOS SON VERDADEROS
let q = true;
let p = true;
if (q && p) console.log(" true")

//OR ""
//VERDADERO SI CUALQUIERA DE LOS ELEMENTOS ES VERDADERO
let a = false;
let b = true;
if (a || b) console.log(" true")
//NOT "!"
// CAMBIE EL VALOR DE FALSO A VERDADERO Y VICEVERSA
let c = false;
let d = false;
if (!(!c || d)) {console.log(" true")};