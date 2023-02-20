/*
Que en contramos en el arbol DOM?
-Node: Es la unidad basica dentro del documento. Puede se una etiqueta, un texto dentro de una etiqueta o un comentario, etc.
<title>
    Manipulacion DOM
</title>

-Document: tambien es un nodo del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

-Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

- Attributes: Nodos que dan informacion asociada al tipo de elemento

 - Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.
*/

/* Como leer nodos de mi DOM
Metodos tradicionales (Que se usan en versiones antiguas de JS)
- document.getElementById (botonsuma)
-document.getElementsByTagName (</button>)
-document.getElementsByClassName (class botones)*/

/*var elementoID = document.getElementById("botonsuma");
console.log(elementoID);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);
console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta[2]);

var ElementClassName = document.getElementsByClassName("botones");
console.log(ElementClassName);

/*Metodos recientes

-document.querySelector(#botones)
-document.querySelectorAll(.botones)
*/
/*
var UnElemento = document.querySelector("#input1");
console.log(UnElemento);

var VariosElementos = document.querySelectorAll(".botones");
console.log(VariosElementos);*/

/*Creacion de nodos
-document.createElement
*/


//Construccion de la calculadora
var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonsuma = document.getElementById("botonsuma");
var botonresta = document.getElementById("botonresta");
var botonmultiplicacion = document.getElementById("botonmultiplicacion");
var botondivision = document.getElementById("botondivision");
var resultado = document.getElementById("resultado");

//Actualizar nodos
//1er paso: identificar el nodo con un metodo para tomarlo (getElemento o QuerySelector y modificarlo con inner.HTML)
var resultadoquecambia = document.getElementById("resultado");
resultadoquecambia.innerHTML = "Ya se armo";

//Creacion de una etiqueta del tipo imagen
const imagenperrito = document.createElement("img");

//Creamos atributos a la etiqueta
imagenperrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenperrito.alt = "foto del perrito contento"
imagenperrito.style.width = "150px"
imagenperrito.style.borderRadius ="40px"

//poner elementos o nodos en el HTML
document.body.append(imagenperrito);

/*

Manipulacion del DOM


    - Metodos para acceder a elementos 

        - document.getElementById
        - document.getElementsByTagName
        - document.getElementosByClassName


    - Metodos para crear elementos  

        - document.createElement(etiqueta)
        - document.createTextNode(texto) - Investigar


    - Metodos para insertar elementos

        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement


    - Metodos para modificar elementos

        - node.outerHTML (leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)


*/

const textoamodificar = document.querySelector("#h1");

function cambiarcolor(color){
    textoamodificar.style.color = color;
}

//construimos las funciones de nuestra calculadora

function suma(){
let valor1 = parseInt(input1.value);
let valor2 = parseInt(input2.value);
let suma = valor1+valor2;
resultado.innerHTML = suma;
}

function resta(){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let resta = valor1-valor2;
    resultado.innerHTML = resta;
}

function multiplicacion(){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let multiplicacion = valor1*valor2;
    resultado.innerHTML = multiplicacion;
}

function division(){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let division = valor1/valor2;
    resultado.innerHTML = division;
}

/*Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar", lo que quiero que haga)


*/

botonsuma.addEventListener("click", suma);
botonresta.addEventListener("click", resta);
botonmultiplicacion.addEventListener("click", multiplicacion);
botondivision.addEventListener("click", division);