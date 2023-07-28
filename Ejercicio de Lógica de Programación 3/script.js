function calcularFactorial() {
    let numero;
    
    do {
        let input = prompt("Ingrese un número para calcular su factorial:");
        numero = parseFloat(input);

        if (isNaN(numero)) {
            alert("Por favor, ingrese un número válido.");
        }
    } while (isNaN(numero));

    let factorial = 1;

    for (let i = 1; i <= numero; i++) {
        factorial *= i;
    }

    console.log("Factorial de " + numero + ": " + factorial);

    document.getElementById("resultado").innerHTML = "Factorial de " + numero + ": " + factorial;
}

calcularFactorial();