import React from 'react'

const productos = 
[{titulo: 'Carros', esFruta: false, id: 1},
{titulo: 'Motos', esFruta: false, id: 2},
{titulo: 'Celulares', esFruta: true, id: 3},
{titulo: 'Celulares', esFruta: true, id: 3}];

function TercerComponente() {
    const lista = productos.map(producto => <li key={producto.id}>{producto.titulo}</li>)
  return (
    <div>
      <h3>TercerComponente</h3>
      <h2>Jugando con map</h2>
      <ol>{lista}</ol>
    </div>
  )
}
export default TercerComponente