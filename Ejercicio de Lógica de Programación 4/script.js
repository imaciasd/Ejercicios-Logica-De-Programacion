function generarFibonacci() {
    let numero;

    do {
        let input = prompt("Ingrese un número para generar la serie de Fibonacci:");
        numero = parseInt(input);

        if (isNaN(numero)) {
            alert("Por favor, ingrese un número válido.");
        }
    } while (isNaN(numero));

    let fibonacciSerie = [0, 1];

    for (let i = 2; i < numero; i++) {
        fibonacciSerie[i] = fibonacciSerie[i - 1] + fibonacciSerie[i - 2];
    }

    console.log("Serie de Fibonacci hasta " + numero + ": " + fibonacciSerie.join(", "));

    document.getElementById("resultado").innerHTML = "Serie de Fibonacci hasta " + numero + ": " + fibonacciSerie.join(", ");
}

generarFibonacci();