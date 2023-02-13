// problema 1
// let nombre = ["sofia", "david", "juan"]

//problema 2
//let nombre ["david", "juan", "sara", "agustin"];

//problema 3
//let nombre ["david","renata" "juan", "sara", "agustin", "elena"];

//Ejercicio 2
function anidado(){
    for(let i = 0; i < 6; i++){
        for(let j = 0; j < i; j++){
            matrizR[i][j]=miArray2[i][j] * miArray2 [i][j];
        }
    }
}
console.log(anidado())

for (let i = 1; i <= 5; i++) { //bucle exterior itera 5 veces, empezando desde 1
    let asterisco = ''; //cadena vacía para almacenar cada fila de asteriscos
    for (let j = 1; j <= i; j++) { //el bucle interior itera 'i' veces, empezando desde 1
      asterisco += '* '; //agrega un asterisco seguido de un espacio a la cadena de la fila
    }
    console.log(asterisco); // imprime la cadena de la fila en una nueva línea
}

//Ejercicio 3 parte 1
let xValue = 10;
while (xValue > 0) {
  console.log(xValue);
  xValue-=0.5;
}

//Ejercicio 3 parte 2
let x = 1;
while(x <= 100){
console.log(x);
x+=2;
}

//Ejercicio 3 parte 3
let n=6;
while(n<= 6){
  console.log(6)
}