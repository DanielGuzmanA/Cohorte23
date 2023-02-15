let texto = "Hola mundo";
// "Includes" Busca y lo imprime si es verdadero. "else" Si el caracter no se encuentra aparecera la leyenda "este caracter no esta"
if(texto.includes("z")){
console.log("--- l");
}
else{
    console.log("Ese caracter no esta compa");
}

//Busca el espacio en blanco y añade el simbolo que esta entre " / " 
let palabra2 = texto.split(" ");
console.log(palabra2[0]+ " / "+ palabra2[1]);

//Imprime el indice pero se tiene que especificar el rango y quita el primer indice del rango
let palabra1 = texto.substring(5,7);
console.log(palabra1);

//Imprime solo desde el indice que le pones "5"
let palabra = texto.substr(5);
conseole.log(palabra);

//Pone el texto en mayusculas "toUpperCase"
let mensaje2 = texto.toUpperCase();
console.log(mensaje2)

//Separa la cadena de caracteres de "texto"
let mensaje1 = "";
for(let index = 0; index < texto.length; index++){
    mensaje1 += texto[index] + " ";
}
//".trim" elimina los caracteres en blanco
mensaje1 = mensaje1.trim();
console.log(mensaje1);

//Cuenta las letras que tiene "texto"
let mensaje = "El texto tiene " + texto.length + " caracteres";
console.log(mensaje);