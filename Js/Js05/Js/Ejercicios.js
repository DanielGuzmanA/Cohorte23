// Ejercicio 1

var Nombres = ["Maria", "Antony", "Joy", "Juan"];
var Nombres2 = ["Jona", "Jherson", "Maria", "Beto"];

// Escriba una función para insertar un nombre al final de la lista. Agregue su propio nombre al final de la lista.
function agreganombre(nombre){
    Nombres.push(nombre);
}
agreganombre("Daniel");
console.log(Nombres);

//Escribe una función que tome un nombre y verifique si la lista tiene ese nombre. Debería devolver un booleano - verdadero/falso.
function comprobarnombre(incluye){
    console.log(Nombres.includes(incluye));
}
comprobarnombre("Daniel");

// Escribe una función que tome una lista de nombres. Esta función debería comparar la lista tomada en la nameslista que tiene actualmente. La función debe devolver una matriz con los nombres que están en ambas listas.
function duplicarnombre(){
    let resultados = [];
    for (let i = 0; i< Nombres.length; i++){
        if (Nombres2.includes(Nombres[i])){
            resultados.push(Nombres[i]);
        }
    }
    return resultados;
}
console.log(duplicarnombre());

// Escriba una función que tome una lista de nombres y devuelva una lista de números enteros con la longitud de los nombres en el mismo orden en que se recibieron. Sugerencia para usar la función de empuje.
function devolvernumerosE(Nombres){
    let longitudes = [];
    for (let i = 0; i< Nombres.length; i++){
        longitudes.push(Nombres[i].length);
    }
    return longitudes;
}
let Imprimirtamaño = devolvernumerosE(Nombres);
console.log(Imprimirtamaño);


// Ejercicio 2
console.log (false || (true && false)); // false
console.log (true || (11 + 12)); // true
console.log ((31 + 22) || true); // 53
console.log (true && (1 + 7)); // 8
console.log (false && (3 + 4)); // false
console.log ((1 + 2) && true); // true
console.log ((32 * 4) >= 129); //false
console.log (false !== !true); //false
console.log (true === 4); //false
console.log (false === (847 === '847')); //true
console.log (false === (887 == '887')); //false
console.log ((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false); //true

// Ejercicio 3
// numberRange(25);   // '25 is between 0 and 25'
// numberRange(75);   // '75 is between 26 and 100'
// numberRange(125);  // '125 is greater than 100'
// numberRange(-25);  // '-25 is less than 0'
function comparador(){
    let numero = parseInt(prompt("Por favor, ingresa un número: "));
    if(numero<=25){
        console.log(numero, "is between 0 and 25");
    }else if(numero>25 && numero<=100){
        console.log(numero, "is between 26 and 100");        
    }else if(numero>100){
        console.log(numero,"is greater than 100");
    }else{
        console.log(numero,"is less than 0");
    }
}
comparador(-25);