// if (condition){
//Bloque codigo
//}

let edad = parseInt(prompt("Escribe tu edad"));

if (edad <= 17){
    document.write("<h2> Estas morro, morro </h2>");
}
else if(edad === 18){
    document.write("Eres mayor de edad");
}

else if(edad > 18){
    document.write("<h2> Estas ruco, ruco </h2>")
}
else {
    document.write("<h2> Este no es un numero valido </h2>")
}

// (5 == "5") true //== Compara valor
// (5 === "5") false //=== Compara valor y tipo de dato