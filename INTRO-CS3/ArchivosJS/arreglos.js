let mivariable = 34;
{}
let miArreglo = []; //declaracion literal
let miArreglo01 = new Array(); // declaracion por instancia

let miArreglo02 = [31,32,33,34];
console.log("dato de miArreglo en el indice 0 - "+ miArreglo02 [0]);
console.log("dato de miArreglo en el indice 1 - "+ miArreglo02 [1]);
console.log("dato de miArreglo en el indice 2 - "+ miArreglo02 [2]);
console.log("dato de miArreglo en el indice 3 - "+ miArreglo02 [3]);
console.log("el tamaño o numero de elementos del arreglo es: " + miArreglo02.length)

let miArreglo03 = ["hola","que", "tal"];
console.log (miArreglo03[0])
console.log (miArreglo03[1])
console.log (miArreglo03[2])
console.log("el tamaño de miArreglo04 es: " + miArreglo03.length)

let miArreglo04 = [{nombre:"Daniel"},{apellido:"Guzman"},{edad: 24}];
console.log("elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04 [0].nombre);
console.log("elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04 [1].apellido);
console.log("elemento del arreglo de tipo objeto miArreglo04 " + miArreglo04 [2].edad);
console.log("el tamaño de miArreglo04 es: " + miArreglo04.length)

let nuevoarreglo00 = [3,6,1,4]
console.log("orden de mi arreglonuevo con sort (): " + nuevoarreglo00.sort())
console.log("orden de mi arreglonuevo con pop (): " + nuevoarreglo00.pop())
console.log("orden de mi arreglonuevo con push (): " + nuevoarreglo00.push(10))
console.log("orden de mi arreglonuevo con reverse (): " + nuevoarreglo00.reverse())

let otroarreglo = ["que","hola", "tal"]
console.log("orden de mi otroarreglo con sort (): " + otroarreglo.sort())
console.log("orden de mi otroarreglo con pop (): " + otroarreglo.pop())
console.log("orden de mi otroarreglo con push (): " + otroarreglo.push("estas"))
console.log("orden de mi otroarreglo con reverse (): " + otroarreglo.reverse())

console.log("javascrip"[2])
console.log("javascript".length)

let matriz = [[1,2,3],
              [4,5,6],
              [7,8,9]]
console.log("tamaño: " + matriz.length)
console.log(matriz[1][1])
console.log(matriz[2][1])
console.log(matriz[0][2])
