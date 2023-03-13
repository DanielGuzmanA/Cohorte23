// funcion

function bigWords(palabra, arrrayPalabras) {

    let resultado = [];
    let tamanio = palabra.length; //taamaño de la palabra

    for (let i = 0; i < arrayPalabras.length; i++) {
        if (arrayPalabras[i].length > tamanio) {
            resultado.push(arrayPalabras[i]); //meto las palabras que tienen mayor longitud
        }
    }
    return resultado;
}


function printArray(arrayPalabras) {
    document.write('<li>');
    for (let i = 0; i < arrayPalabras.length; i++) {
        document.write('<ol>' + arrayPalabras[i] + '</ol>');
    }
    document.write('</li>');
}


//INSTANCIA

let arrayPalabras = ['lunes', 'martes', 'miercoles', 'jueves', 'viernes', 'hola', 'hi'];
let palabra = 'dos';

let arrayImprimir = bigWords(palabra, arrayPalabras);

printArray(arrayImprimir);