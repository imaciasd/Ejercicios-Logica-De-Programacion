/*# Ejercicio 1

## Instrucciones

- Crear un programa en `JavaScript` que realice lo siguiente:

- Input
    - Solicitar por prompt tres datos y guardarlos en sus respectivas variables.


- Output
    - Mostrar los números por consola o DOM ordenados de mayor a menor, y de menor a mayor.
    - Mostrar un mensaje en consola o por el DOM si los números son iguales.

--- 

Input:
```
4, 4, 2
```
Output:
``` 
4, 4, 2
2, 4, 4
``` */

function numero(){
    let numerosGuardados = [];

    for(let i=0; i<3; i++){
        let numero = prompt("Ingrese el número "+(i+1) + ": ");
        numerosGuardados.push(parseInt(numero));
    }

    numerosGuardados.sort(function(a, b) {
        return a - b;
    });

    console.log("Ordenados de menor a mayor: " + numerosGuardados.join(", "));

    numerosGuardados.reverse();

    console.log("Ordenados de mayor a menor: " + numerosGuardados.join(", "));

    if (numerosGuardados[0] === numerosGuardados[2]) {
        console.log("Los números son iguales.");
    }
}

numero();