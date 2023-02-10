division(14,5);
/*Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)*/

//Funciones
function suma(a,b){
    let sum1 = a + b
    console.log( sum1 );
}

/* Cosas importantes a tener en cuenta para crear funciones.
- Nombre que sea descriptivo y evoque al funcionamiento de ese bloque de codigo
- Datos de entrada (parametros)
- Procesos o instrucciones a ejecutar
- Salida (return)*/

//Funcion directa
function agregarCarritoCompra(){
    //Lo que hace mi funcion
}

//Invocar funcion
agregarCarritoCompra();

//Funcion anonima, con x llamas a la funcion
let x = function(){
    let valor1 = 5;
    let valor2 = 7;
    let suma = valor1 + valor2;
    console.log("Esta funcion anonima: ",suma);
}

x();

//Funcion
function division (parametro1, parametro2){
    let resultado = parametro1 / parametro2;
    console.log(resultado);
}

division(88,10);

/*Tipos de funciones
- Funciones directas - nombre (comunes)
- Funciones anonimas - viven pegadas a una variable o constante
- Funciones como metodos(para especificar que hace mi objeto)
- Funciones como contructores (pra construir o crear un objeto)*/

//Funciones flecha

//Sintaxis de una funcion flecha

//Funcion directa o normal
function suma(a,b){
    let sum1 = a + b
    console.log( sum1 );
}
//Funcion flecha
var suma = (a , b) => a + b;

//Funcion flecha con mas lineas de codigo
const sumarYMultiplicar = (a,b) => {
    const sum = a + b;
    const result = suma * 2;
    console.log(result);
}

/*Return
La sentencia return finaliza la ejecucion de la funcion, y especifica un valor para ser devuelto a quien llama a la funcion. O lo que es lo mismo, usamos return para finalizar y tambien para poder asignar el resultado a una variable.
Si no usamo el return, la funcion nunca termina*/

function areaCuadrado(){
    let lado = 5;
    let area = lado * lado;
    console.log("el area de mi cuadrado es: ", area); //25
    return area;
    console.log("Hola a todos")
}

areaCuadrado();

let resultadoDeMiFuncion = areaCuadrado();

console.log ("El resultado de mi funcion cuadrado es: ", resultadoDeMiFuncion);
