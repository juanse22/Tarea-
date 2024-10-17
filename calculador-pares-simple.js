function mostrarPares() {
    const limite = parseInt(document.getElementById('limite').value);
    const resultadoDiv = document.getElementById('resultado');
    
    if (isNaN(limite) || limite < 2) {
        resultadoDiv.innerHTML = 'Por favor, ingrese un número válido mayor o igual a 2.';
        return;
    }

    let numerosPares = '';
    let numero = 2;

    while (numero <= limite) {
        numerosPares += numero + ' ';
        numero += 2;
    }

    resultadoDiv.innerHTML = 'Números pares: ' + numerosPares.trim();
}