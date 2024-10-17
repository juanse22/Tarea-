const numeroEntrada = parseInt(prompt("Ingrese el número a calcular"));

if (isNaN(numeroEntrada)) {
    alert("Por favor ingrese un número válido");
} else {
    let resultado = 0;  
    

    for (let i = 1; i <= numeroEntrada; i++) {
        resultado += i;
    }
    
    alert(`La suma de los primeros ${numeroEntrada} números naturales es igual a ${resultado}`);
}