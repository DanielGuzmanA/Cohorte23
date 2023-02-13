let lista = [12,5,80,34,7];
lista.sort(
    function(valor1,valor2){
        return valor1 > valor2;
    }
);
console.log(lista);


// Los ordena en orden al primer digito
lista.sort();
console.log(lista)

// Lo acomoda al reves
lista.reverse();
console.log(lista);

// Elimina los que no se señalan
let remover = lista.splice(1,2);
console.log(remover); // Los eliminados
console.log(lista); // Los sobrantes
lista.splice(2,0, 100, 200, 300);
console.log(lista)

// Elimina el primer elemento "shift"
lista.shift();
console.log(lista);


// Elimina el ultimo elemento "pop"
lista.pop();
console.log(lista);

//Agrega mas de 1 elemento "contact" no modifica el arreglo original
let masE= lista.concat(100,200,300);
console.log(masE);

//Agrega 1 elemento al final "push" modifica el arreglo original
lista.push(100);
console.log(lista);

//Agrega simbolos "join"
let msj = lista.join("-");
console.log(msj);

//Devuelve una copia del array "slice" 
let listanueva = lista.slice(1,4)
console.log(listanueva);


// cuenta el número de caracteres en la cadena, incluidos los espacios, y devuelve el número "length"
for(let i =0; i < lista.length; i++){
    console.log(lista [i]);
}
console.log(lista);