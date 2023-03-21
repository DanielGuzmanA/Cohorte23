let number;

while (true) {
    number = prompt("Ingrese un número:");
    if (isNaN(number)) {
        console.log("Error: debe ingresar un número válido.");
    }
    else {
        break;
    }
}

let factorial = 1;
for (let i = 2; i <= number; i++) {
    factorial *= i;
}

console.log(`El factorial de ${number} es ${factorial}.`);