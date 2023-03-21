function convertTemperature() {
    let celsius = parseFloat(prompt("Ingresa la temperatura en grados Celsius:"));

    if (isNaN(celsius)) {
        alert("El valor ingresado no es un número válido.");
        convertTemperature();
        return;
    }

    let fahrenheit = (celsius * 9 / 5) + 32;
    let kelvin = celsius + 273.15;

    console.log(`Grados Kelvin: ${kelvin}`);
    console.log(`Grados Fahrenheit: ${fahrenheit}`);
}

convertTemperature();