// Arreglos 
let miVariable = 5;
let miArray = [2,3,4,5,6,7];
//let miArray = new Array();

console.log("mi Array" + miArray[0]);
console.log("mi Array" + miArray[1]);

let miArray1 = [ 
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

console.log("miarray1 " + miArray1 [1][0]);
console.log("miarray1 " + miArray1 [0][2]);
console.log("miarray1 " + miArray1 [2][1]);
console.log("miarray1 " + miArray1 [1][2]);

console.log("Todo el indice " + miArray1[0])
console.log("Todo el indice " + miArray1[1])
console.log("Todo el indice " + miArray1[2])

// Ciclo for //

for(let i=1; i <= 10; i++){
console.log("Imprimiendo i -> "+ i);
}

for(let i=10; i >= 0; i--){
console.log("Imprimiendo i -> "+ i);
}


for(let i = 0; i < 3; i++){
    for(let j=0; j < 3; j++){
        console.log("Imprimiendo la matriz1 -> " + miArray1[i][j]);
    }
    console-log("*********");
}

let miArray2 = [ 
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

let matrizR=[
    [],[],[]
]
for(let i = 0; i < 3; i++){
    for(let j=0; j < 3; j++){
        matrizR[i][j]=miArray2[i][j] * miArray2 [i][j];
    }
}
console.log(matrizR);

// While //

/* 
let variable inicio

while(condicion){

}
*/

let contador = 0;
while(contador <= 10){
    console.log(contador);
    contador++;
}