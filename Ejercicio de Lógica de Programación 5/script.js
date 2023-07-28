function adivinarNumeroSecreto() {
    const numeroSecreto = Math.floor(Math.random() * 100) + 1;
    let numerosIngresados = [];

    while (true) {
        let input = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:");

        if (!isNaN(input)) {
            const numeroIngresado = parseInt(input);
            numerosIngresados.push(numeroIngresado);

            if (numeroIngresado === numeroSecreto) {
                console.log("Felicidades, adivinaste el número secreto.");
                console.log("Números ingresados: " + numerosIngresados.join(", "));
                break;
            } else {
                console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
            }
        } else {
            alert("Por favor, ingresa un número válido.");
        }
    }
}

adivinarNumeroSecreto();