
function convertirTemperatura() {
    let temperaturaCelsius;
    let temperaturaFahrenheit;
    let temperaturaKelvin;

    do {
        let input = prompt("Ingrese la temperatura en grados Celsius:");
        temperaturaCelsius = parseFloat(input);

        if (isNaN(temperaturaCelsius)) {
            alert("Por favor, ingrese un número válido.");
        }
    } while (isNaN(temperaturaCelsius));

    temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
    temperaturaKelvin = temperaturaCelsius + 273.15;

    console.log("Grados Fahrenheit: " + temperaturaFahrenheit.toFixed(2));
    console.log("Grados Kelvin: " + temperaturaKelvin.toFixed(2));

    document.getElementById("resultado").innerHTML = "Grados Fahrenheit: " + temperaturaFahrenheit.toFixed(2) + "<br>Grados Kelvin: " + temperaturaKelvin.toFixed(2);
}

convertirTemperatura();