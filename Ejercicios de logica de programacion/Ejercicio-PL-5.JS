const generarNumeroAleatorio = () => Math.floor(Math.random() * 100) + 1;

const validarNumero = (numero) => {
    if (isNaN(numero) || numero < 1 || numero > 100) {
        throw new Error('El número ingresado no es válido, por favor ingrese un número del 1 al 100');
    }
};

const jugarAdivinaNumero = () => {
    const numeroSecreto = generarNumeroAleatorio();
    const numerosIngresados = [];

    while (true) {
        let numeroIngresado = prompt('Ingrese un número del 1 al 100 para adivinar el número secreto');

        try {
            validarNumero(numeroIngresado);

            if (numeroIngresado == numeroSecreto) {
                console.log(`Felicidades, adivinaste el número secreto: ${numeroSecreto}`);
                console.log('Números ingresados antes de adivinar:', numerosIngresados);
                break;
            }
            else {
                numerosIngresados.push(numeroIngresado);
                console.log('Ups, el número secreto es incorrecto, vuelve a intentarlo.');
            }
        }
        catch (error) {
            console.log(error.message);
        }
    }
};

jugarAdivinaNumero();